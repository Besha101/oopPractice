package org.example.Midterm.a3rdTask;

import java.util.List;
import java.util.Optional;

public class InventoryManagementSystem {

    public Optional<InventoryItem> findItemById(List<InventoryItem> inventory,int itemId){
        for(InventoryItem inventoryItem:inventory){
            if(inventoryItem.getId()==itemId){
                return Optional.of(inventoryItem);
            }
        }
        return Optional.empty();
    }

    public double calculateTotalInventoryValue(List<InventoryItem> inventory){
        double total=0;
        for(InventoryItem item:inventory){
            total+=item.getPrice()*item.getQuantity();
        }
        return total;
    }

    public void displayItemDetails(Optional<InventoryItem> itemOptional){

        if(itemOptional.isPresent()){
            InventoryItem item=itemOptional.get();
            System.out.println("id: " + item.getId() +
                    "\nname: " + item.getName() +
                    "\nquantity: " + item.getQuantity() +
                    "\nprice: " + item.getPrice() );
        }
    }
}