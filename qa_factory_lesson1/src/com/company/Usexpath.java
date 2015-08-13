package com.company;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by admin on 13.08.15.
 */
public class Usexpath {
    public static void main(String[] arg) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        ChromeDriver drv = new ChromeDriver();

        drv.get("http://google.com");

        System.out.println(drv.getTitle());

        WebElement j=drv.findElementByXPath("//[@name=q]");


        System.out.println(j);
        slp(2);

    }
        public static void slp(long sec) {
            try {
                Thread.sleep(sec * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
