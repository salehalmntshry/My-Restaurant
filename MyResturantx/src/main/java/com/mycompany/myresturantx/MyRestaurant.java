package com.mycompany.myresturantx;

import java.util.Scanner;

public class MyRestaurant {

    public static void main(String[] args) {

        orders invoices = new orders(); // create an orders object to store all the invoices

        final Scanner input = new Scanner(System.in); // create a Scanner object to read input from the user

        // create several food objects and add them to the Helper's food array list
        food f1 = new food();
        f1.setName("chicken");
        f1.setPrice(27);
        f1.setCalories(239);
        Helper.foodArrayList.add(f1);

        food f2 = new food();
        f2.setName("Meat   ");
        f2.setPrice(38);
        f2.setCalories(143);
        Helper.foodArrayList.add(f2);

        food f3 = new food();
        f3.setName("egg    ");
        f3.setPrice(14);
        f3.setCalories(63);
        Helper.foodArrayList.add(f3);

        food f4 = new food();
        f4.setName("fruits ");
        f4.setPrice(50);
        f4.setCalories(210);
        Helper.foodArrayList.add(f4);

        // create several beverages objects and add them to the Helper's beverages array list
        beverages b1 = new beverages();
        b1.setName("Pepsi  ");
        b1.setPrice(5);
        b1.setCalories(210);
        Helper.beveragesArrayList.add(b1);

        beverages b2 = new beverages();
        b2.setName("cola   ");
        b2.setPrice(5);
        b2.setCalories(100);
        Helper.beveragesArrayList.add(b2);

        beverages b3 = new beverages();
        b3.setName("orange ");
        b3.setPrice(8);
        b3.setCalories(45);
        Helper.beveragesArrayList.add(b3);

        beverages b4 = new beverages();
        b4.setName("water  ");
        b4.setPrice(3);
        Helper.beveragesArrayList.add(b4);

        while (true) {
            System.out.println("Enter one to buy food or two to buy beverage or 0 to end: ");
            int option = input.nextInt(); // read the user's choice of food or beverage

            if (option == 0) { // if the user chooses 0, exit the inner loop
                break;

            } else if (option == 1) { // if the user chooses 1, show the food menu and ask for the quantity of the food
                int i = 1;
                for (food f : Helper.foodArrayList) {
                    System.out.println(i + "-" + f.getName() + "       " + f.getPrice() + "     " + f.getCalories());
                    i++;
                }

                System.out.println("Select an option from the above menu :");
                int foodNumber = input.nextInt();
                System.out.println("Enter How much you want:");
                int quantity = input.nextInt();
                new Helper().getBill(foodNumber,quantity);

            } else if (option == 2) {// if the user chooses 2, show the beverages menu and ask for the quantity of the beverage
                int i = 1;
                for (beverages b : Helper.beveragesArrayList) {
                    System.out.println(i + "-" + b.getName() + "       " + b.getPrice() + "     " + b.getCalories());
                    i++;
                }
                System.out.println("Select an option from the above menu :");
                int beveragesNumber = input.nextInt();
                System.out.println("Enter How much you want:");
                int quantity = input.nextInt();
                new Helper().getBill(beveragesNumber,quantity);
            } else {
                System.out.println("Error");
            }
        }

        order invoice = new order();

        invoice.setItems(Helper.getBill());
        invoice.setPrice(Helper.getTotalPrice());
        invoice.setCalories((int) Helper.getTotalofcalories());
        invoices.addInvoice(invoice);

        while (true) {
            System.out.println("Do you want to print the bill? (y/n)");
            String choice = input.next();
            if (choice.equals("y")) {
                System.out.println(Helper.getBill());
                System.out.println("-------------------");
                System.out.println("total For All Invoice: " + invoices.getFullPrice() + " SAR");
                System.out.println("total For All Invoice: " + invoices.getFullCalories() + " calories");
                System.out.println("**************");
                invoices.printAllInvoice();
                while (true) {
                    System.out.println("Enter bill number to get it print?");
                    int invoiceNumber = input.nextInt();
                    if (invoices.cheakBill(invoiceNumber)) {
                        invoices.printInvoice(invoiceNumber);
                        break;
                    } else {
                        System.out.println("Wrong Number");
                    }
                }

                break;
            } else if (choice.equals("n")) {
                break;
            } else {
                System.out.println("Error");
            }
        }
    }
}
