/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myresturantx;

public class order {


    // Define instance variables to store the total price and total calories of the order
    public String items = "";
    public double price = 0;
    public int calories = 0;
    private double amount;

    // Setters and getters for the instance variables
    public void setItems(String items) {
        this.items = items;
    }

    public String getItems() {
        return items;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setInvoice(){
        setItems(Helper.getBill());
        setPrice(Helper.getTotalPrice());
        setCalories((int) Helper.getTotalofcalories());
        new orders().addInvoice(this);
    }
}
