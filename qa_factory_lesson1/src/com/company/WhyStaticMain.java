package com.company;

/**
 * Created by Admin on 15.09.15.
 */
public class WhyStaticMain {
    public static void main(String[] args ){
        System.out.println("whyStatic.publicStaticVar"+WhyStatic.publicStaticVar);
        System.out.println("whyStatic.publicStaticVar"+WhyStatic.publicStaticVar);
        WhyStatic w=new WhyStatic();
        WhyStatic w2=new WhyStatic();
        System.out.println(""+w.publicNonStaticVar);
    }
}
