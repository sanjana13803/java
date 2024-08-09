package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Products;

public class Amazon {

   public String productName;
    Products products;

      public boolean  orderProduct(Products products){
       boolean isProductOrdered = false;
       if(productName !=null){
           this.products=products;
           this.products.getProductDetails();
           isProductOrdered = true;

       }else System.out.println("guru product ilaaa nen huduktha irodu");


      return isProductOrdered;
      }

}
