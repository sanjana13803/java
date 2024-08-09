package com.xworkz.zomatoapp.zomato;

import com.xworkz.zomatoapp.food.Food;

public class Zomato {

   public String foodName;
   public Food food;

             public boolean   orderFood(Food food){
                      boolean isOrdered = false;
                      if(food != null){
                          this.food=food;
                          this.food.displayOrderDetails();
                          isOrdered = true;


                      }else System.out.println("nen hakiro fooditem nam athra ila guru");



             return isOrdered;
             }


}
