package io.renren.service;

import io.renren.dao.GeneratorDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class SysGeneratorServiceTest {

    @Mock
    private GeneratorDao generatorDao;
    @InjectMocks
    private SysGeneratorService sysGeneratorService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void queryTable() {

        Map<String, String> mockData = new HashMap<>();
        mockData.put("code", "编码");
        mockData.put("name", "名称");

        when(sysGeneratorService.queryTable("role")).thenReturn(mockData);

        Map<String, String> columns = sysGeneratorService.queryTable("role");
        System.out.println(columns);
        assertEquals(columns.size(), 2);
        assertTrue(columns.containsKey("code"));
        assertTrue(columns.containsKey("name"));
    }

    @Test
    public void queryList() {
    }

    @Test
    public void queryColumns() {
    }

    @Test
    public void generatorCode() {
    }
}