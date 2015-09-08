package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by admin on 03.09.15.
 */
public class Lesson13 {
    @Before
    public void beforeDriver(){
        TestHelper.setup(AngelPage.url);
        //TestHelper.get("http://angel.net/~nic/passwd.current.html");
    }

    @Test
    public void test1() {
        AngelPage.setMaster("masterpass");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test111() {
        AngelPage.setMaster("masterpass");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        AngelPage.setMaster("masterpass");
        AngelPage.generate();
        System.out.println(AngelPage.getPassword());
        TestHelper.slp(5);
    }
    @Test
    public void test2() {
        AngelPage.setMaster("hello");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.getPassword());

    }
    @Test
    public void test3() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("google.com");
        AngelPage.sendEnter();
        Assert.assertEquals("quSWcvR/lH8G8@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());

    }
    @Test
    public void test4() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        Assert.assertEquals("quSWcvR/lH8G8@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());

    }
    @Test
    public void test5() {
        AngelPage.setMaster("");
        AngelPage.setSitename("");
        AngelPage.generate();
        Assert.assertEquals("BaefBs8/Z/cm2@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test7() {
        AngelPage.setMaster(" ");
        AngelPage.setSitename(" ");
        AngelPage.generate();
        Assert.assertEquals("2YQR63Cwft+D6@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test8() {
        AngelPage.setMaster("333");
        AngelPage.setSitename("111");
        AngelPage.generate();
        Assert.assertEquals("CD/iUTsNwzV4v@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test9() {
        AngelPage.setMaster("111");
        AngelPage.setSitename("333");
        AngelPage.generate();
        Assert.assertEquals("A61tAOVfX4wCm@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test10() {
        AngelPage.setMaster("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.setSitename("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.generate();
        Assert.assertEquals("mWxGz2VYwGgZK@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test11() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("asd");
        AngelPage.generate();
        Assert.assertEquals("agdjoTB4cjI5E@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test12() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("ASD");
        AngelPage.generate();
        Assert.assertEquals("FkfaCm2ddwvDg@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test17() {
        AngelPage.setMaster("1+1");
        AngelPage.setSitename("");
        AngelPage.generate();
        Assert.assertEquals("BXYuMvgLoT5Ll@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test18() {
        AngelPage.setMaster("2/0");
        AngelPage.setSitename("2/0");
        AngelPage.generate();
        Assert.assertEquals("v3xY97+tXxAS5@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test19() {
        AngelPage.setMaster("\"a\"");
        AngelPage.setSitename("\"a\"");
        TestHelper.slp(5);
        AngelPage.generate();
        Assert.assertEquals("vybb/hnwlLYhi@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test20() {
        AngelPage.setMaster("\"([a-zA-Z]+) (\\d+)\"");
        AngelPage.setSitename("\"([a-zA-Z]+) (\\d+)\"");
        TestHelper.slp(5);
        AngelPage.generate();
        Assert.assertEquals("z3Bz38Fe3+Xef@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test23() {
        AngelPage.setMaster("999.999.999.999");
        AngelPage.setSitename("999.999.999.999");
        AngelPage.generate();
        Assert.assertEquals("GlDQ/PeFN+t2k@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }

    @Test
    public void test24() {
        AngelPage.setMaster("Feb 30, Sept 31");
        AngelPage.setSitename("Feb 30, Sept 31");
        AngelPage.generate();
        Assert.assertEquals("OZ0T2U4X2eX4H@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @After
    public void aftertest(){
        TestHelper.quit();
    }


}
