package com.company;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by admin on 04.08.15.
 */
public class SeleniumLesson1 {
    public static void main(String[] arg){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        ChromeDriver d = new ChromeDriver();
        d.get("http://apppicker.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        d.quit();
    }
}
