package io.renren.modules.oss.service.impl;

import io.renren.modules.oss.dao.SysOssDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class SysOssServiceImplTest {

    @Mock
    private SysOssDao sysOssDao;
    @InjectMocks
    private SysOssServiceImpl sysOssService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void queryPage() {
    }
}