package Midterm.a2ndTask;

/*
Create a record named Product with the following attributes: id (int), name (String),
price (double).

Create an interface named DetailsProvider<T> with a method displayDetails(T item)
that accepts an item of type T and prints its details.

Create a class named ProductManagementSystem that implements the DetailsProvider<Product>
interface. This class should have the following methods:

filterProductsByPriceRange: Accepts a list of products and a minimum and maximum price,
and returns a new list containing only the products with a price within the specified range.

calculateTotalPrice: Accepts a list of products and calculates the total price of all products.

Implement the displayDetails method from the DetailsProvider interface to display the
details of each product.

In the main method, instantiate the ProductManagementSystem and create a list of products.
Perform the following operations:

Use the filterProductsByPriceRange method to filter products within a specific price range.
Use the calculateTotalPrice method to calculate the total price of all products.
Use the displayDetails method to print the details of each product.

 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductManagementSystem productManagementSystem = new ProductManagementSystem();

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "ProductA", 50.0));
        products.add(new Product(2, "ProductB", 75.0));
        products.add(new Product(3, "ProductC", 100.0));

        System.out.println();
        productManagementSystem.filterProductsByPriceRange(products, 60.0, 90.0);
        System.out.println();





        for (Product product : products) {
            productManagementSystem.displayDetails(product);
        }
        System.out.println();


        System.out.println("Total Price of all products: " + productManagementSystem.calculateTotalPrice(products));
    }

}
