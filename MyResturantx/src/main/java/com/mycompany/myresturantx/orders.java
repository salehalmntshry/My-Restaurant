/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myresturantx;

import java.util.ArrayList;

public class orders {
    static int id = 1;

    // Create an ArrayList to store orders
    ArrayList<order> invoice = new ArrayList<>();

    // Method to add a new order to the ArrayList
    public void addInvoice(order order) {
        // Check if the specified ID is within the bounds of the ArrayList
        if (orders.id >= invoice.size() || orders.id < 0) {
            // If it is not, add the new order to the end of the ArrayList and print a message with the new ID
            invoice.add(order);
            System.out.println("Your bill number " + orders.id);
        } else {
            // If it is, print a message indicating that the order already exists
            System.out.println("your bill number " + orders.id);
        }
        orders.id++;
    }

    // Method to print all orders in the ArrayList
    public void printAllInvoice() {
        System.out.println("Printing All Invoice");
        // Loop through the ArrayList and print the details of each order
        for (int index = 0; index < invoice.size(); index++) {
            order value = invoice.get(index);
            System.out.println("Your bill number " + index);
            System.out.println(value.getItems());
            System.out.println("total: " + value.getPrice() + " SAR");
            System.out.println("total: " + value.getCalories() + " calories");
            System.out.println("-----");
        }

    }

    // Method to print a specific order in the ArrayList
    public void printInvoice(int billId) {
        // Retrieve the order with the specified ID from the ArrayList and print its details
        order value = invoice.get(billId);
        System.out.println("Print Invoice");
        System.out.println("**************");
        System.out.println("Your bill number " + billId);
        System.out.println(value.getItems());
        System.out.println("total: " + value.getPrice() + " SAR");
        System.out.println("total: " + value.getCalories() + " calories");
    }

    // Method to check if a specific order exists in the ArrayList
    public Boolean cheakBill(int billId) {
        if (billId >= invoice.size() || billId < 0) {
            // If the specified ID is not within the bounds of the ArrayList, return false
            return false;
        } else {
            // If the specified ID is within the bounds of the ArrayList, return true
            return true;
        }
    }

    // Method to calculate the total price of all orders in the ArrayList
    public int getFullPrice() {
        int fullPrice = 0;
        // Loop through the ArrayList and add up the price of each order
        for (int index = 0; index < invoice.size(); index++) {
            order value = invoice.get(index);
            fullPrice += value.getPrice();
        }
        // Return the total price
        return fullPrice;
    }

    // Method to calculate the total number of calories in all orders in the ArrayList
    public int getFullCalories() {
        int fullCalories = 0;
        // Loop through the ArrayList and add up the number of calories in each order
        for (int index = 0; index < invoice.size(); index++) {
            order value = invoice.get(index);
            fullCalories += value.getCalories();
        }
        // Return the total number of calories
        return fullCalories;
    }
}
