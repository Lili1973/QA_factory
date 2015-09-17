package com.company;

import org.openqa.selenium.By;

public class AnywayAnyday {
    public static String url = "https://www.anywayanyday.com/";

    public static void setLenguage(String value) {
        TestHelper.drv.findElement(By.xpath("//*[contains(@class,' j-current_culture' )]")).click();
        TestHelper.drv.findElement(By.xpath("//*[contains(@class,' b-language_section' )]//li[contains(@class)]")).click();
    }
}
