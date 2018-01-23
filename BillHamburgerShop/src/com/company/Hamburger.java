package com.company;

public class Hamburger extends Food {
    private String breadRollType;
    private String meat;
    private Food[] additionals;
    private double basePrice;
    private int index;

    public Hamburger(double price, String breadRollType, String meat) {
        super(price);
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = price;
        this.additionals = new Food[4];
        this.index = 0;
    }

    public void addAdditionals(Food food){
        if (this.index >= 4){
            System.out.println("Could not add more additions");
        }else{
            this.additionals[this.index] = food;
            while (this.additionals[this.index] != null){
                this.index +=1;
                if (this.index == 4){
                    break;
                }
            }
        }
    }

    public void takeOutAdditionals(Food food){
        if (food.getClass().getSimpleName().equals("Tomato") || food.getClass().getSimpleName().equals("Letture") || food.getClass().getSimpleName().equals("Carrot") || food.getClass().getSimpleName().equals("Chip") || food.getClass().getSimpleName().equals("Drink")){
            for (int i = 0; i<index; i++){
                if (this.additionals[i].equals(food)){
                    this.additionals[i] = null;
                    this.index = i;
                    break;

                }
            }
        }
    }

    public void listOfadditionals(){
        System.out.println("----- Normal additionals -----");
        for (int i = 0; i<4; i++){
            if (this.additionals[i] != null){
                System.out.println(this.additionals[i].getClass().getSimpleName() + " -> price = " + this.additionals[i].getPrice());
            }
        }
    }

    @Override
    public double getPrice() {
        double actualPrice = 0;
        for (int i = 0; i<4; i++){
            if (this.additionals[i] != null){
                actualPrice += this.additionals[i].getPrice();
            }
        }
        return this.basePrice + actualPrice;
    }

    public String getBreadRollType() {
        return this.breadRollType;
    }

    public String getMeat() {
        return this.meat;
    }

    public Food[] getAdditionals() {
        return this.additionals;
    }

    public double getBasePrice() {
        return this.basePrice;
    }
}
