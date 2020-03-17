package com.arn.gsonexample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = null;
        try {
        	System.out.println("\nBufferedReader Example Gson");
            reader = new BufferedReader(new FileReader("user.json"));
            Gson gson = new Gson(); 
            Item[] ItemArray = gson.fromJson(reader, Item[].class);
            
            System.out.println("\nArray Lenght = "+ItemArray.length);
        	System.out.println("\nArray output 1");
            System.out.println(ItemArray[0]);
            System.out.println(ItemArray[1]);
        	System.out.println("\nArray output Shop [1]");
        	System.out.println(ItemArray[1].getShop());
            
        	System.out.println("\nArray output 2");
            for(Item item : ItemArray) {
                System.out.println(item);
            }
            
        	System.out.println("\nArray output Date");
            for(Item item : ItemArray) {
                System.out.println(item.getDate());
            }
            
        	System.out.println("\nArray output Shop");
            for(Item item : ItemArray) {
                System.out.println(item.getShop());
            }

          } catch (FileNotFoundException ex) {
          	 ex.printStackTrace();
          } finally {
          }

	}

}
