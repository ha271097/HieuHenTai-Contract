package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList <Contact> listContact = new ArrayList<>();
        Manager haanh = new Manager();
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Heloo MR.LUON CHUA.");
            System.out.println("Number 1: Display all Contact.");
            System.out.println("Number 2: Add new MEM.");
            System.out.println("Number 3: Update MEM.");
            System.out.println("Number 4: Delete MEM.");
            System.out.println("Number 5: Search.");
            System.out.println("Number 0: Exit.");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    haanh.dispayListContact(listContact);
                    break;
                case 2:
                    haanh.add(listContact);
                    haanh.dispayListContact(listContact);
                    break;
                case 3:
                    Scanner updateIndex = new Scanner(System.in);
                    System.out.println("Enter index update: ");
                    int numberUpdate = updateIndex.nextInt();
                    haanh.update(numberUpdate, listContact);
                    haanh.dispayListContact(listContact);
                    break;
                case 4:
                    Scanner deleteIndex = new Scanner(System.in);
                    System.out.println("Enter index delete: ");
                    int numberDelete = deleteIndex.nextInt();
                    haanh.deleteMem(numberDelete, listContact);
                    haanh.dispayListContact(listContact);
                    break;
                case 5:
                    Scanner searchI = new Scanner(System.in);
                    System.out.println("Enter name or phone search: ");
                    String searchMem = sc.next();
                    haanh.search(searchMem, listContact);
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        }
    }
}
