package Midterm.a3rdTask;

/*
Task: Inventory Management System
Create a class named InventoryItem with the following attributes: id (int), name (String),
quantity (int), and price (double).

Create a class named InventoryManagementSystem with the following methods:

findItemById: Accepts a list of inventory items and an item ID. Implement this method
using Optional to find and return the inventory item with the specified ID if it exists,
or an empty Optional if not.

calculateTotalInventoryValue: Accepts a list of inventory items and calculates the total
value of the entire inventory. The total value of an item is its quantity multiplied by its
price.

displayItemDetails: Accepts an Optional<InventoryItem> and prints the details of the item
if it exists, or a message indicating that the item is not found.

In the main method, instantiate the InventoryManagementSystem and create a list of
inventory items. Perform the following operations:

Use the findItemById method to find an item by its ID.
Use the calculateTotalInventoryValue method to calculate the total value of the entire
inventory.
Use the displayItemDetails method to print the details of a specific item, handling the
case where the item is not found gracefully.
 */

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem();

        List<InventoryItem> inventory = List.of(
                new InventoryItem(1, "ItemA", 10, 20.0),
                new InventoryItem(2, "ItemB", 5, 30.0),
                new InventoryItem(3, "ItemC", 15, 15.0)
        );

        int itemIdToFind = 2;
        Optional<InventoryItem> foundItem = inventoryManagementSystem.findItemById(inventory, itemIdToFind);
        System.out.println();
        inventoryManagementSystem.displayItemDetails(foundItem);
        System.out.println();

        System.out.println("Total value of inventory is: "+inventoryManagementSystem.calculateTotalInventoryValue(inventory));
    }

}
