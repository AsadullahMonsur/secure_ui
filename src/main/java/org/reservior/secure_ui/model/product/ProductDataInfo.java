package org.reservior.secure_ui.model.product;

import java.util.ArrayList;

public class ProductDataInfo {

    public static ArrayList<Product> get_data(){

        ArrayList<Product> list = new ArrayList<Product>();

        for (int i=1; i<10; i++){

            Product product = new Product(""+i, "#000"+i,"a"+i,"b"+i,
                                          "/image/nav_bar/trending/shirt.jpeg");
            list.add(product);

        }

        return list;
    }


}
