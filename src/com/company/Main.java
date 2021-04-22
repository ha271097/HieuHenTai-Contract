package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
	// write your code here
        ArrayList <Contact> listContact = new ArrayList<>();
        Manager haanh = new Manager();
        addContact add = new addContact();
        fixContact fixContact = new fixContact();
        deleteContact deleteContact = new deleteContact();
        searchContact searchContact = new searchContact();
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
                    haanh.displayListContact(listContact);
                    break;
                case 2:
                    add.add(listContact);
                    haanh.displayListContact(listContact);
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
                            int upIndex;
                            do {
                                System.out.println("Enter index update: ");
                                 upIndex = updateIndex.nextInt();
                            }while (fixContact.testUpdateIndex(upIndex - 1 , listContact ) == false);
                            fixContact.updateIndex(upIndex - 1, listContact);
                            haanh.displayListContact(listContact);
                            break;
                        case 2:
                            Scanner updateName = new Scanner(System.in);
                            String upName;
                            do{
                                System.out.println("Enter name update: ");
                                upName = updateName.next();
                            }while (fixContact.testUpdateName(upName, listContact) == false);
                            fixContact.updateName(upName, listContact);
                            haanh.displayListContact(listContact);
                            break;
                        case 0:
                            System.exit(0);
                    }
                    break;
                case 4:
                    Scanner deleteMem = new Scanner(System.in);
                    System.out.println("Number 1: Delete Index.");
                    System.out.println("Number 2: Delete Name.");
                    System.out.println("Number 0: Exit..");
                    int numDelete = deleteMem.nextInt();
                    switch (numDelete){
                        case 1:
                            Scanner deleteIndex = new Scanner(System.in);
                            int deIndex;
                            do {
                                System.out.println("Enter index delete: ");
                                deIndex = deleteIndex.nextInt();
                            }while (deleteContact.testDeleteIndex(deIndex, listContact) == false);
                            deleteContact.deleteMemIndex(deIndex - 1, listContact);
                            haanh.displayListContact(listContact);
                            break;
                        case 2:
                            Scanner deleteName = new Scanner(System.in);
                            String deName;
                            do {
                                System.out.println("Enter name delete: ");
                                deName = deleteName.nextLine();
                            }while (deleteContact.testDeleteName(deName, listContact) == false);
                            deleteContact.deleteMemName(deName, listContact);
                            haanh.displayListContact(listContact);
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
                            String searchNorP;
                            do {
                                System.out.println("Enter name or phone search: ");
                                searchNorP = searchNameorPhone.next();
                            }while (searchContact.testName(searchNorP, listContact) == false);
                            searchContact.search(searchNorP, listContact);
                            break;
                        case 2:
                            Scanner searchInex = new Scanner(System.in);
                            int searchI;
                            do {
                                System.out.println("Enter index search: ");
                                searchI = searchInex.nextInt();
                            }while (searchContact.testIndex(searchI, listContact) == false);
                            searchContact.searchIndex(searchI - 1, listContact);
                            break;
                        case 0:
                            System.exit(0);
                    }
                    break;
                case 6:
                    ;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
