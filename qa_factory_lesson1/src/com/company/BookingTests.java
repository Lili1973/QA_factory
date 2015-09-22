package com.company;

import org.junit.After;
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
        TestHelper.slp(5);
        Booking.setDestination("Ивано-Франковск");
        TestHelper.slp(3);
        Booking.dateDeparture("20.10.2015");
        TestHelper.slp(3);
        Booking.search();
        TestHelper.slp(7);
    }
    @After
    public void aftertest(){
        TestHelper.quit();
    }
}