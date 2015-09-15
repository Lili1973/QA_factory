package com.company;

/**
 * Created by Admin on 15.09.15.
 */
public class Door {
    public String color="Wood";
    public String doorState="Closed";
    public static String made="china";
    public String state(){
        return doorState;
    }
    public void open(){
        doorState="Open";
        return ;
    }
}
