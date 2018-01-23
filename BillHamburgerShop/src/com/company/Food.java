package com.company;

public class Food {
    private double price;

    public Food(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass().getSimpleName().equals(obj.getClass().getSimpleName())){
            Food othFood = (Food)(obj);
            if (othFood.getPrice() == this.getPrice())return true;
        }
        return false;
    }
}
