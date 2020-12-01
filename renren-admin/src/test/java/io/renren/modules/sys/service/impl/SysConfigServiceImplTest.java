package io.renren.modules.sys.service.impl;

import io.renren.modules.sys.dao.SysConfigDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class SysConfigServiceImplTest {

    @Mock
    private SysConfigDao sysConfigDao;
    @InjectMocks
    private SysConfigServiceImpl sysConfigService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void queryPage() {
    }

    @Test
    public void saveConfig() {
    }

    @Test
    public void update() {
    }

    @Test
    public void updateValueByKey() {
    }

    @Test
    public void deleteBatch() {
    }

    @Test
    public void getValue() {
    }

    @Test
    public void getConfigObject() {
    }
}