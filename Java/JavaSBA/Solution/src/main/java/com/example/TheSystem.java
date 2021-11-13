package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
   HashMap<String, Item> itemCollection;
   Item item = new Item();

    TheSystem() {
        itemCollection = new HashMap<>();
        if(getClass().getSimpleName().equals("AppSystem")){
            try{
                File myObj = new File("resources/sample.txt");
                Scanner myReader = new Scanner(myObj);
                while(myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    String[] itemInfo = data.split("\\s");
                    item.setItemName(itemInfo[0]);
                    item.setItemDesc(itemInfo[1]);
                    item.setItemPrice(Double.parseDouble(itemInfo[2]));
                    item.setQuantity(Integer.parseInt(itemInfo[3]));
                    itemCollection.put(item.getItemName(), item);
                    System.out.println(data);
                }
                myReader.close();
            } catch(FileNotFoundException e){
                System.out.println("file not found");
                e.printStackTrace();
            }
        }
    }
    
    public HashMap<String, Item> getItemCollection(){
        return itemCollection;
    }
    
    public Boolean checkAvailability(Item item) {
        if(item.getQuantity()>= item.getAvailableQuantity()){
            System.out.println("System is unable to add "+ item.getItemName()+ " to the card. System only has "+ item.getAvailableQuantity()+ " of "+ item.getItemName()+ "s.");
            return false;
        }
        return true;
    }
    
    public Boolean add(Item item) {
        if (item == null){
            return false;
        }
        else if (itemCollection.get(item.getItemName()) != null && checkAvailability(item)){
            int addOne = itemCollection.get(item.getItemName()).getAvailableQuantity() + 1;
            itemCollection.get(item.getItemName()).setAvailableQuantity(addOne);
            return true;
        }
        else if (itemCollection.get(item.getItemName()) != null){
            itemCollection.put(item.getItemName(), item);     
            return true;    
        }
        else {
            return false;
        }
    }

    public Item remove(String itemName) {
        if(itemCollection.get(itemName) != null){
            return itemCollection.remove(itemName);
        }
        return null;
    }

    public abstract void display();
}
