package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookingTests {
    @Before
    public void beforeDriver() {
        TestHelper.setup(Booking.url);
    }

    @Test
    public void test1() {
        Booking.setFrom("Киев");
        TestHelper.slp(1);
        Booking.setDestination("Ивано-Франковск");
        TestHelper.slp(1);
        Booking.dateDeparture("20.10.2015");
        TestHelper.slp(3);
        Booking.search();
        TestHelper.slp(5);
        Assert.assertEquals("043 К", Booking.checkNumberOfTrain01("043 К"));
        Assert.assertEquals("143 К", Booking.checkNumberOfTrain01("143 К"));
        Booking.selectTrain("043 К");
        Assert.assertEquals("Маршрут поезда", Booking.getRouteWindowTitle());
        Booking.closeRouteWindow();
        TestHelper.slp(3);
        Booking.selectButtonPlace("043 К","Купе");
        TestHelper.slp(5);
        System.out.println(Booking.checkNumberWagon());
        Assert.assertTrue(Booking.checkNumberWagon());
        Assert.assertEquals(true, Booking.checkNumberSit());
        Booking.selectPlace();
        System.out.println(Booking.getPrice());
        Assert.assertEquals("179,07*", Booking.getPrice());
        Booking.setSurname("Петров");
        TestHelper.slp(5);
        Booking.setName("Петя");
        TestHelper.slp(5);
    }
    @Test
    public void test2() {
        Booking.setFrom("Львов");
        TestHelper.slp(1);
        Booking.setDestination("Ужгород");
        TestHelper.slp(4);
        Booking.dateDeparture("30.09.2015");
        Booking.search();
        TestHelper.slp(4);
        Booking.selectTrain("601 Л");
    }
    @After
    public void aftertest(){
        TestHelper.quit();
    }
}