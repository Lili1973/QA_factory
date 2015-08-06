package com.company;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.spec.KeySpec;

/**
 * Created by admin on 04.08.15.
 */
public class SeleniumLesson1 {
    public static void main(String[] arg){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        ChromeDriver d = new ChromeDriver();
        //d.get("http://apppicker.com");
        d.get("http://google.com");
        slp(2);

        System.out.println(d.getTitle());
        WebElement j=d.findElementByName("q");
        j.sendKeys("котята");
        j.sendKeys(Keys.ENTER);
        d.findElementByName("btnG").click();
        slp(2);
        d.quit();
    }
    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
