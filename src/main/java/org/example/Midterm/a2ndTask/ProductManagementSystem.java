package org.example.Midterm.a2ndTask;

import java.util.ArrayList;
import java.util.List;

public class ProductManagementSystem implements DetailsProvider<Product>{

    @Override
    public void displayDetails(Product item) {
        System.out.println("ID: "+item.id()+"\nItem: "+item.name()+"\nPrice: "+item.price());
    }

    public void filterProductsByPriceRange(List<Product> productList,double minimum,double max){
        List<Product> filteredList=new ArrayList<>();
        for(Product product:productList){
            if(product.price()<=max && product.price()>=minimum){
                filteredList.add(product);
            }
        }
        System.out.println(filteredList);
    }

    public int calculateTotalPrice(List<Product> productList){
        int sum=0;
        for(Product product:productList){
            sum+=product.price();
        }
        return sum;
    }

}
