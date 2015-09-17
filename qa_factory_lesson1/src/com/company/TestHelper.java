package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHelper {

    public static WebDriver drv;
    public static String master="//tr[1]/td[2]/input";
    public static String siteName="//tr[2]/td[2]/input";
    public static String buttonGenerate="//*[@value='Generate']";
    public static String passwordField="//tr[4]/td[2]/input";

    public static void setup(){
        System.setProperty("webdriver.chrome.driver",
                //"/usr/local/bin/chromedriver");
                "C:\\Automation\\Soft\\chromedriver_win32\\chromedriver.exe");
        drv = new ChromeDriver();
    }
    public static void setup(String url){
        setup();
        get(url);
    }
    public static void get(String url){
        drv.get(url);
    }

 /*   public static void afterDriver(){
        drv.quit();
    }*/

    public static void quit(){
        drv.quit();
    }
    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}


/*public class TestHelper {
    public static WebDriver drv;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Soft\\chromedriver_win32\\chromedriver.exe");
        drv = new ChromeDriver();
    }
    public static void setup(String url){
        setup();
        get(url);
    }
    public static void get(String url){
        drv.get(url);
    }
    public static void quit(){
        drv.quit();
    }
    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}*/
