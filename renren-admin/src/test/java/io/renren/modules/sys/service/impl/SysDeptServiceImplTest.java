package io.renren.modules.sys.service.impl;

import io.renren.modules.sys.dao.SysDeptDao;
import io.renren.modules.sys.entity.SysDeptEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class SysDeptServiceImplTest {

    @Mock
    private SysDeptDao sysDeptDao;

    @InjectMocks
    private SysDeptServiceImpl sysDeptService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void queryList() {

        SysDeptEntity root = new SysDeptEntity();
        root.setDeptId(1L);
        root.setName("集团");
        root.setParentId(-1L);
        root.setOrderNum(1);
        root.setDelFlag(0);

        SysDeptEntity child = new SysDeptEntity();
        child.setDeptId(2L);
        child.setName("事业部");
        child.setParentId(1L);
        child.setOrderNum(2);
        child.setDelFlag(0);

        List<SysDeptEntity> mockData = Arrays.asList(root, child);

        when(sysDeptService.queryList(null)).thenReturn(mockData);
        List<SysDeptEntity> result = sysDeptService.queryList(null);
        System.out.println(result);
        // 验证返回条数为2
        assertEquals(result.size(), 2);
        // 验证第一条的部门编号为1
        assertEquals(result.get(0).getDeptId().longValue(), 1L);
    }

    @Test
    public void queryDetpIdList() {
        List<Long> mockData = Arrays.asList(2L);
        when(sysDeptService.queryDetpIdList(1L)).thenReturn(mockData);
        when(sysDeptService.queryDetpIdList(2L)).thenReturn(new ArrayList<>());

        List<Long> ids = sysDeptService.queryDetpIdList(1L);
        System.out.println(ids);
        // 验证子部门个数是否为1个
        assertEquals(ids.size(), 1);
        // 验证子部门的id是否为2
        assertEquals(ids.get(0).longValue(), 2L);
    }

    @Test
    public void getSubDeptIdList() {
        List<Long> mockData = Arrays.asList(2L);
        when(sysDeptService.queryDetpIdList(1L)).thenReturn(mockData);
        when(sysDeptService.queryDetpIdList(2L)).thenReturn(new ArrayList<>());

        List<Long> ids = sysDeptService.getSubDeptIdList(1L);
        System.out.println(ids);
        // 验证子部门个数是否为1个
        assertEquals(ids.size(), 1);
        // 验证子部门的id是否为2
        assertEquals(ids.get(0).longValue(), 2L);
    }
}