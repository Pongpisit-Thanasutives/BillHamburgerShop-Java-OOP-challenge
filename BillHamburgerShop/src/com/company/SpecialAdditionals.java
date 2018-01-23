package com.company;

public class SpecialAdditionals {
    private double price;
    boolean isSpecial;
    public SpecialAdditionals(double price) {
        this.price = price;
        this.isSpecial = true;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSpecial() {
        return this.isSpecial;
    }

    @Override
    public boolean equals(Object obj) {
        SpecialAdditionals othSpecialAdditionals = (SpecialAdditionals)(obj);
        return this.getClass().getSimpleName().equals(obj.getClass().getSimpleName()) && this.getPrice() == othSpecialAdditionals.getPrice();
    }
}
