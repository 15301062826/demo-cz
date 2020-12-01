package io.renren.common.utils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
public class RTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void error() {
        R r = R.error();
        assertTrue(r.containsKey("code"));
        assertTrue(r.get("code").equals(500));
    }

    @Test
    public void error1() {
        R r = R.error("aaa");
        assertTrue(r.get("code").equals(500));
        assertTrue(r.get("msg").equals("aaa"));
    }

    @Test
    public void error2() {
        R r = R.error(401, "aaa");
        assertTrue(r.get("code").equals(401));
        assertTrue(r.get("msg").equals("aaa"));
    }

    @Test
    public void ok() {
        R r = R.ok();
        assertTrue(r.get("code").equals(0));
        assertTrue(r.get("msg").equals("success"));
    }

    @Test
    public void ok1() {
        R r = R.ok("bbb");
        assertTrue(r.get("code").equals(0));
        assertTrue(r.get("msg").equals("bbb"));
    }

    @Test
    public void ok2() {
    }

    @Test
    public void put() {
    }
}