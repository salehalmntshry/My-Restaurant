/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myresturantx;

import java.util.ArrayList;

public class Helper {
    public static String bill = "";
    public static double totalPrice = 0;
    public static double totalofcalories = 0;

    // Create two static ArrayLists to store food and beverages
    static ArrayList<food> foodArrayList = new ArrayList<>();
    static ArrayList<beverages> beveragesArrayList = new ArrayList<>();

    // Method to save a food object to the ArrayList s
    public static void saveFood(food food) {
        Helper.foodArrayList.add(food);
    }

    // Method to save a beverage object to the ArrayList s1
    public static void saveBeverage(beverages beverages) {
        Helper.beveragesArrayList.add(beverages);
    }
    public void getBill(int foodNumber, int quantity){
        this.bill += "food name:" + foodArrayList.get(foodNumber - 1).getName() + "   price: " + foodArrayList.get(foodNumber - 1).getPrice()
                + "   calories: " + foodArrayList.get(foodNumber - 1).getCalories() + "   quantity : " + quantity + "\n";
        totalPrice += quantity * +foodArrayList.get(foodNumber - 1).getPrice();
        totalofcalories += quantity * +foodArrayList.get(foodNumber - 1).getCalories();
    }
    //setter and getter

    static String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    static double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        Helper.totalPrice = totalPrice;
    }

    static double getTotalofcalories() {
        return totalofcalories;
    }

    public void setTotalofcalories(double totalofcalories) {
        Helper.totalofcalories = totalofcalories;
    }
}