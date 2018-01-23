package com.company;

import java.util.ArrayList;

public class HealthyHamburger extends Hamburger{
    private ArrayList<SpecialAdditionals> specialAdditionals;
    private int count;

    public HealthyHamburger(double price, String meat) {
        super(price, "Brown rye", meat);
        this.specialAdditionals = new ArrayList<SpecialAdditionals>();
        this.count = 0;
    }

    public void addSpecialAdditions(SpecialAdditionals spa){
        if (spa.getClass().getSimpleName().equals("Chicken") || spa.getClass().getSimpleName().equals("Bean")){
            if (count >= 0 && count <2){
                this.specialAdditionals.add(spa);
                count +=1;
            }else{
                System.out.println("Could not add more special additionals to the hamburger");
            }
        }
    }

    public void takeOfSpecialAdditionals(SpecialAdditionals spa){
        if (this.specialAdditionals.remove(spa)){
            count -= 1;
        }else{
            System.out.println("Nothing to be removed from special additionals");
        }
    }

    @Override
    public double getPrice() {
        double actualPrice = 0;
        for (int i = 0; i<4; i++){
            if (super.getAdditionals()[i] != null){
                actualPrice += this.getAdditionals()[i].getPrice();
            }
        }

        for (int i = 0; i<2; i++){
            if (this.specialAdditionals.get(i) != null){
                actualPrice += this.specialAdditionals.get(i).getPrice();
            }
        }

        return this.getBasePrice() + actualPrice;
    }

    public void listSpecialAdditionals(){
        System.out.println("----- Special additionals -----");
        for (int i = 0; i<count; i++){
            if (this.specialAdditionals.get(i) != null){
                System.out.println(this.specialAdditionals.get(i).getClass().getSimpleName() + " -> price = " + this.specialAdditionals.get(i).getPrice());
            }
        }
    }
}
