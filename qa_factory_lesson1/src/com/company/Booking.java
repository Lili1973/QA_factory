package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Date;

public class Booking {
    public static String url = "http://booking.uz.gov.ua/ru/";

    public static String station_from="//*[@id='station_from']/input";
    public static String station_till="//*[@id='station_till']/input";

    //public static String train01 = "//tbody//a[contains(text(),'043 К')]";
   // public static String train02 = "//tbody//a[contains(text(),'143 К')]";
    public static String wagon = "//*[@class='coaches']/a[1]";
    public static String sit = "//span[text()='27']/..";
    public static String price="//tbody//td[contains(text(),'179,07')]";
    public static String surname="//input[@class='lastname']";
    public static String name="//input[@class='firstname']";

    public static void setFrom(String value) {
        TestHelper.drv.findElement(By.xpath(station_from)).sendKeys(value);
        TestHelper.slp(3);
        TestHelper.drv.findElement(
                By.xpath("//*[@id='stations_from']/div[@title='" + value + "']")).click();
    }

    public static void setDestination(String value) {
        TestHelper.drv.findElement(By.xpath(station_till)).sendKeys(value);
        TestHelper.slp(3);
        TestHelper.drv.findElement(
                By.xpath("//*[@id='stations_till']/div[@title='" + value + "']")).click();
    }

    public static void dateDeparture(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@id='date_dep']")).clear();
        TestHelper.drv.findElement(By.xpath("//*[@id='date_dep']")).sendKeys(value);
        TestHelper.drv.findElement(By.xpath("//*[@id='date_dep']")).sendKeys(Keys.ENTER);
        TestHelper.slp(3);
    }

    public static void search() {
        TestHelper.drv.findElement(By.xpath("//button[@name='search']")).click();
        TestHelper.slp(3);
    }

    public static void selectTrain(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@class='num']/a[text()='"+value+"']")).click();
        TestHelper.slp(5);
    }
    public static String getRouteWindowTitle () {
        return TestHelper.drv.findElement(By.xpath("//*[@class='vToolsPopupHeader']/span")).getText();
    }
    public static void closeRouteWindow() {
        TestHelper.drv.findElement(By.xpath("//button[text()='Ok']")).click();
        TestHelper.slp(5);
    }
 /*   public static String checkNumberOfTrain01() {
        return TestHelper.cyclicElementSearchByXpath(train01).getText();
    }
    public static String checkNumberOfTrain02() {
        return TestHelper.cyclicElementSearchByXpath(train02).getText();
    }*/
    public static String checkNumberOfTrain01(String train) {
        return TestHelper.cyclicElementSearchByXpath("//tbody//a[contains(text(),'"+train+"')]").getText();
 }
    /*public static void selectButtonPlace() {
        TestHelper.drv.findElement(By.xpath("//a[text()='043 К']/../..//div[@title='Купе']/button")).click();
        TestHelper.slp(5);
    }*/
    public static void selectButtonPlace(String train,String type) {
        TestHelper.drv.findElement(By.xpath("//a[text()='"+train+"']/../..//div[@title='"+type+"']/button")).click();
        TestHelper.slp(5);
    }
    public static boolean checkNumberWagon() {
        return TestHelper.cyclicElementSearchByXpath(wagon).isEnabled();
    }

    public static boolean checkNumberSit() {
        return TestHelper.cyclicElementSearchByXpath(sit).isEnabled();
    }
    public static void selectPlace() {
        TestHelper.drv.findElement(By.xpath(sit)).click();
        TestHelper.slp(5);
    }
    public static String getPrice() {
        return TestHelper.drv.findElement(By.xpath(price)).getText();
    }
    public static void setSurname(String value) {
        TestHelper.drv.findElement(By.xpath(surname)).sendKeys(value);
    }
    public static void setName(String value) {
        TestHelper.drv.findElement(By.xpath(name)).sendKeys(value);
    }


}