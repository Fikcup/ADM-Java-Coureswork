package com.example;

public class AppSystem extends TheSystem {
    AppSystem() {

    }

    @Override
    public void display() {
        System.out.println("AppSystem Inventory");
        System.out.format("%-20s %-20s %-20s%-20s","Name", "Description","Price", "Available Quantity");

        for (String key : itemCollection.keySet())
        {
            String name = item.getItemName();
            System.out.println(name);

            String description = item.getItemDesc();
            System.out.println(description);

            double price = (double) item.getItemPrice();
            System.out.println(price);

            Integer quantity = item.getQuantity();
            System.out.println(quantity);
        }
        
        System.out.format("%-20s %-20s %-10.2f %-10.2d", name, description, price, quantity);
        System.out.println();
    }

    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        // Your code here
    }

    public Item reduceAvailableQuantity(String item_name) {
    
    }
}
