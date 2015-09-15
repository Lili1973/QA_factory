package com.company;


public class WhyStatic {
    public static int publicStaticVar=0;
    public int publicNonStaticVar=1;
    private static int privateStaticVar=2;
    private int privateNonStaticVar=3;

    public int getStaticVar(){
        return privateStaticVar;
    }
    public int getNonStaticVar(){
        return privateNonStaticVar;
    }
}
