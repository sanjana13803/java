package com.xworkz.zomatoapp.food;

public class Food {
   public String foodName;
    public double foodPrice;
    public int quantity;
    public String restaurantName;

    public  void displayOrderDetails(){

        System.out.println("the food u have order is :"+foodName);
        System.out.println("the price is :"+foodPrice+" $");
        System.out.println("the number of quantity is :"+quantity);
        System.out.println("the restaurant  :"+restaurantName);

    }


}
