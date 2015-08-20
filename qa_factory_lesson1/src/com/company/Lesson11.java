package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Lesson11 {
    @Test
    public void test1(){
        Assert.assertEquals(19,10+10);
        Assert.assertEquals(true,1==1);
        Assert.assertTrue(1==2);
    }
    @Test
    public void test3(){
        Assert.assertEquals(18, sumAll(new int[]{1, 4, 2, 3, 8}));
    }
    @Test
    public void test4(){
        Assert.assertEquals(0, sumAll(new int[]{0, 0, 0, 0, 0}));
    }
    @Test
    public void test5(){
        Assert.assertEquals(2, sumAll(new int[]{2}));
    }
    @Test
    public void test6(){
        Assert.assertEquals(2, sumAll(new int[]{}));
    }

    @Test
    public void testFalled(){
        Assert.assertEquals(30,sumAll(new int[] {1,41,2}));
    }
    public static int sumAll(int[] a ){
        int sum=0;
        for (int i = 0; i < a.length; i = i + 1) {
            sum=sum+a[i];
        }
        return sum;
    }
}
