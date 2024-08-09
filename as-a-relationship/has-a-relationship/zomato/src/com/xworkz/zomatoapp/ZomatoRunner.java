package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.food.Food;
import com.xworkz.zomatoapp.zomato.Zomato;

public class ZomatoRunner {
    public static void main(String[] args) {
        Zomato zomato = new Zomato();
        zomato.foodName = "Ghee-Pudi-MasalaDosa";

        Food food = new Food();
        food.foodName = "Ghee-Pudi-MasalaDosa";
        food.foodPrice=89;
        food.quantity=2;
        food.restaurantName="CTR";

        zomato.orderFood(food);

    }
}
