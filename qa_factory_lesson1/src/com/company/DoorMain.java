package com.company;

/**
 * Created by Admin on 15.09.15.
 */
public class DoorMain {
    public static void main(String[] args) {
        Door d=new Door();
        System.out.println(d.color);
        //wood

        Door d2=new Door();
        System.out.println(d2.color);
        //wood

        d.color="Red";
        System.out.println(d.color);
        //red
        System.out.println(d2.color);
        //wood
        System.out.println(d.state());
        //closed
        System.out.println(d2.state());
        //closed

        d.open();
        System.out.println(d.state());
        // Open
        System.out.println(d2.state());
        // Closed
       System.out.println(Door.made);
        // China
        Door.made = "Japan";
        System.out.println(Door.made);
        // Japan
        //System.out.println(Door.state); // ERROR*/
    }
}
