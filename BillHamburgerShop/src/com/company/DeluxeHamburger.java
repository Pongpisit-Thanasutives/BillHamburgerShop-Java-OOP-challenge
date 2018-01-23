package com.company;

public class DeluxeHamburger extends Hamburger{
    public DeluxeHamburger(double price, String breadRollType, String meat) {
        super(price, breadRollType, meat);
        super.addAdditionals(new Drink());
        super.addAdditionals(new Chip());
    }

    @Override
    public void addAdditionals(Food food) {
        System.out.println("Uable to add");
    }

    @Override
    public void takeOutAdditionals(Food food) {
        System.out.println("Uable to take off anything");
    }
}
