package com.company;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class TestSelect {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Soft\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver drv = new ChromeDriver();
        drv.get("https://strahovator.com.ua/kupit_strahovku/avtocivilka_avtograzhdanka_osago_oscpv");
        WebElement s=drv.findElementByXPath("//*[@id='ts_type']");
        Select sel=new Select(s);
        slp(2);
        System.out.println(drv.getTitle());
        System.out.println(sel.getFirstSelectedOption().getText());
        //System.out.println(sel.getOptions());
        //sel.getOptions() all elements from list
        sel.selectByVisibleText("мотоцикл или мотороллер");

        Select sel1=new Select(drv.findElementByXPath("//*[@id='ts_details_type']"));
        sel1.selectByVisibleText("объем двигателя более 300 см³");
        Select sel2=new Select(drv.findElementByXPath("//*[@id='ts_zone']"));
        sel2.selectByVisibleText("Киев");
        Select sel3=new Select(drv.findElementByXPath("//*[@id='no_crash_years_qty']"));
        sel3.selectByIndex(2);
        new Select(drv.findElementByXPath("//*[@id='period']")).selectByValue("7");
        new Select(drv.findElementByXPath("//*[@id='dgo']")).selectByVisibleText("да, на 200 000 грн");

        slp(2);
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
