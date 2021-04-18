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
            System.out.println("----- WELCOME - MENU OF MR.LUON CHUA -----");
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
                    Scanner updateMem = new Scanner(System.in);
                    System.out.println("Number 1: Update index.");
                    System.out.println("Number 2: Update name.");
                    System.out.println("Number 0: Exit..");
                    int numIndex = updateMem.nextInt();
                    switch (numIndex){
                        case 1:
                            Scanner updateIndex = new Scanner(System.in);
                            System.out.println("Enter index update: ");
                            int upIndex = updateIndex.nextInt();
                            haanh.updateIndex(upIndex - 1, listContact);
                            haanh.dispayListContact(listContact);
                            break;
                        case 2:
                            Scanner updateName = new Scanner(System.in);
                            System.out.println("Enter name update: ");
                            String upName = updateName.next();
                            haanh.updateName(upName,listContact);
                            haanh.dispayListContact(listContact);
                            break;
                        case 0:
                            System.exit(0);
                    }
                    break;
                case 4:
                    Scanner deleteMem = new Scanner(System.in);
                    System.out.println("Number 1: Delete Index.");
                    System.out.println("Number 2: Delete Name.");
                    System.out.println("Number 0: Exit.");
                    int numDelete = deleteMem.nextInt();
                    switch (numDelete){
                        case 1:
                            Scanner deleteIndex = new Scanner(System.in);
                            System.out.println("Enter index delete: ");
                            int deIndex = deleteIndex.nextInt();
                            haanh.deleteMemIndex(deIndex - 1, listContact);
                            haanh.dispayListContact(listContact);
                            break;
                        case 2:
                            Scanner deleteName = new Scanner(System.in);
                            System.out.println("Enter name delete: ");
                            String deName = deleteName.nextLine();
                            haanh.deleteMemName(deName, listContact);
                            haanh.dispayListContact(listContact);
                            break;
                        case 0:
                            System.exit(0);
                            break;
                    }

                    break;
                case 5:
                    Scanner searchMem = new Scanner(System.in);
                    System.out.println("Number 1 : Enter name or phone search.");
                    System.out.println("Number 2 : Enter index search.");
                    System.out.println("Number 0 : Exit.");
                    int numSearch = searchMem.nextInt();
                    switch (numSearch){
                        case 1:
                            Scanner searchNameorPhone = new Scanner(System.in);
                            System.out.println("Enter name or phone search: ");
                            String searchNorP = searchNameorPhone.next();
                            haanh.search(searchNorP, listContact);
                            break;
                        case 2:
                            Scanner searchInex = new Scanner(System.in);
                            System.out.println("Enter index search: ");
                            int searchI = searchInex.nextInt();
                            haanh.searchIndex(searchI - 1, listContact);
                            break;
                        case 0:
                            System.exit(0);
                    }

                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        }
    }
}
