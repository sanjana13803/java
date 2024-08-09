package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Products;

public class AmazonRunner {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.productName = "Ps5";

        Products products = new Products();
        products.productId=17;
        products.productName="Ps5";
        products.price=44789.00;
        products.brand="Sony";

        amazon.orderProduct(products);
    }


}
