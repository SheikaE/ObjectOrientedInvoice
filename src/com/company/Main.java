package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Invoice> bisonitems = new ArrayList<Invoice>();
        Invoice ip = new Invoice();
        Scanner input = new Scanner(System.in);
        String item = "";
        String price = "";


        do {ip.setItem(item);
            ip.setPrice(price);
            bisonitems.add(ip);
            System.out.println("What do you want to do?");
            System.out.println("1) add purchase 2) change purchase 3) show purchases 4) finish transaction");
            item = input.nextLine();
            if (bisonitems.equals("1")) {
                System.out.println("What do you wish to buy?");
                bisonitems = input.nextLine();
                bisonitems.add(bisonitems);
            }
            if (bisonitems.equals("2")) {
                System.out.println("Change purchase: ");
                String bisonitem = input.nextLine();
            }
            if (bisonitems.equals("3")) {
                System.out.println(bisonitems.get(0).getItem() + bisonitems.get(0).getPrice());
                }
            }while (!item.equals("4")) ;}
        }





