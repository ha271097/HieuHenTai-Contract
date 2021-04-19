package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class fixContact {

    // Check Index cần sửa có trong Contact hay không
    public boolean testUpdateIndex(int check, ArrayList <Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(check == i){
                return true;
            }
        }
        System.out.println("Index not in Contact -- Please enter again.");
        return false;
    }
    //Check name cần sửa có trong Contact hay không
    public boolean testUpdateName(String name, ArrayList<Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(name.equals(arrayList.get(i).getFullName())){
                return true;
            }
        }
        System.out.println("Name not in Contact -- Please enter again.");
        return false;
    }

    // Sửa phần tử trong mảng
    public void updateIndex(int index, ArrayList<Contact> arrayList){
        Contact newMem = new Contact();
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if( i == index) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter new Mem: ");
                newMem.setFullName(sc1.nextLine());
                System.out.println("Enter new phone: ");
                newMem.setPhoneName(sc1.next());
                System.out.println("Enter group: ");
                newMem.setGroup(sc1.next());
                System.out.println("Enter gender: ");
                newMem.setGender(sc1.next());
                System.out.println("Enter address: ");
                newMem.setAddress(sc1.next());
                System.out.println("Enter email: ");
                newMem.setMail(sc1.next());
                System.out.println("Enter Date Birth: ");
                newMem.setDateBirth(sc1.next());
                arrayList.set(i,newMem);
            }
        }
    }
    public void updateName(String name, ArrayList <Contact> arrayList){
        Contact newMem = new Contact();
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(name.equals(arrayList.get(i).getFullName())){
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter new Mem: ");
                newMem.setFullName(sc1.nextLine());
                System.out.println("Enter new phone: ");
                newMem.setPhoneName(sc1.next());
                System.out.println("Enter group: ");
                newMem.setGroup(sc1.next());
                System.out.println("Enter gender: ");
                newMem.setGender(sc1.next());
                System.out.println("Enter address: ");
                newMem.setAddress(sc1.next());
                System.out.println("Enter email: ");
                newMem.setMail(sc1.next());
                System.out.println("Enter Date Birth: ");
                newMem.setDateBirth(sc1.next());
                arrayList.set(i,newMem);
            }
        }
    }
}
