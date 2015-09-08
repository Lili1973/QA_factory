package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AngelPage {
    public static String url= "http://oxogamestudio.com/passwd.current3.htm";
            //"http://angel.net/~nic/passwd.current.html";

    public static void setMaster(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@name='master']")).sendKeys(value);
     }

    public static void setSitename(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@name='site']")).sendKeys(value);
    }

    public static void generate() {
        TestHelper.drv.findElement(By.xpath("//*[@value='Generate']")).click();
    }

    public static void sendEnter() {
        TestHelper.drv.findElement(By.xpath("//*[@name='site']")).sendKeys(Keys.ENTER);
    }

    public static String getPassword() {
        return TestHelper.drv.findElement(By.xpath("//input[@name='password']")).getAttribute("value");
    }
}
