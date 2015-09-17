package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AnywayAnydayTest {
    @Before
    public void beforeDriver(){
        TestHelper.setup(AnywayAnyday.url);
    }

    @Test
    public void test1() {
        AnywayAnyday.setLenguage("English");

    }
    @After
    public void aftertest(){
        TestHelper.quit();
    }
}
