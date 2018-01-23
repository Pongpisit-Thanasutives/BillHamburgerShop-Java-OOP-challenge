package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Hamberger Test
        Hamburger h = new Hamburger(5.0,"Default","Default");
        h.addAdditionals(new Chip());
        h.addAdditionals(new Tomato());
        h.addAdditionals(new Chip());
        h.listOfadditionals();
        h.takeOutAdditionals(new Chip());
        h.listOfadditionals();
        h.addAdditionals(new Letture());
        h.addAdditionals(new Letture());
        h.listOfadditionals();
        h.takeOutAdditionals(new Letture());
        h.listOfadditionals();
        System.out.println(h.getPrice());
        h.addAdditionals(new Drink());

        // HealthyHamberger Test
        HealthyHamburger hh = new HealthyHamburger(6,"Default");
        hh.addSpecialAdditions(new Chicken());
        hh.addSpecialAdditions(new Chicken());
        hh.listOfadditionals();
        hh.listSpecialAdditionals();
        hh.takeOfSpecialAdditionals(new Chicken());
        hh.listSpecialAdditionals();
        hh.takeOfSpecialAdditionals(new Chicken());
        hh.listSpecialAdditionals();
        hh.takeOfSpecialAdditionals(new Chicken());
        hh.takeOfSpecialAdditionals(new Chicken());
        hh.addSpecialAdditions(new Bean());
        hh.addSpecialAdditions(new Bean());
        hh.listSpecialAdditionals();
        hh.addSpecialAdditions(new Bean());
        System.out.println(hh.getPrice());

        //DeluxeHamburger Test
        DeluxeHamburger dh = new DeluxeHamburger(6,"Default","Default");
        dh.addAdditionals(new Tomato());
        dh.addAdditionals(new Letture());
        dh.takeOutAdditionals(new Letture());
        dh.listOfadditionals();
        System.out.println(dh.getPrice());
    }
}
