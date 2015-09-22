package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Date;

public class Booking {
    public static String url = "http://booking.uz.gov.ua/";

    public static void setFrom(String value){
        TestHelper.drv.findElement(By.xpath("//*[@id='station_from']/input")).sendKeys(value);
        TestHelper.slp(3);
        TestHelper.drv.findElement(
                By.xpath("//*[@id='stations_from']/div[@title='"+value+"']")).click();
    }
    public static void setDestination(String value){
        TestHelper.drv.findElement(By.xpath("//*[@id='station_till']/input")).sendKeys(value);
        TestHelper.slp(3);
        TestHelper.drv.findElement(
                By.xpath("//*[@id='stations_till']/div[@title='"+value+"']")).click();
    }
    public static void dateDeparture(String value){
        TestHelper.drv.findElement(By.xpath("//*[@id='date_dep']")).clear();
        TestHelper.drv.findElement(By.xpath("//*[@id='date_dep']")).sendKeys(value);
        TestHelper.slp(3);
    }
    public static void search(){
        TestHelper.drv.findElement(By.xpath("//*[@id='content']/form/p/button/text()")).click();
        TestHelper.slp(3);
    }
    public static void selectTrain(String value){
        TestHelper.drv.findElement(By.xpath("//*[@id='ts_res_tbl']")).clear();
        TestHelper.drv.findElement(By.xpath("//*[@id='date_dep']")).sendKeys(value);
        TestHelper.slp(3);
}
//*[@id="ts_res_tbl"]/thead/tr/th[1]/text()