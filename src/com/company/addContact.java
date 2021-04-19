package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class addContact {
    public  boolean test(String test, ArrayList<Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(test.equals(arrayList.get(i).getPhoneName()) || test.equals(arrayList.get(i).getFullName())){
                System.out.println("Please enter again: ");
                return false;
            }
        }
        return true;
    }
    // Check xem email đúng hay sai
    public boolean checkMail(String mail ){
        if(mail.contains("@") && mail.contains(".")){
            return true;
        }
        System.out.println("Email fail -- Please enter again.");
        return false;
    }
    // Thêm phần tử trong mảng
    public void add(ArrayList<Contact> arrayList){
        Scanner sc = new Scanner(System.in);
        Contact newMem = new Contact();
        do {
            System.out.println("Enter new Mem: ");
            newMem.setFullName(sc.nextLine());
        }while (test(newMem.getFullName(), arrayList) == false);
        do {
            System.out.println("Enter new phone: ");
            newMem.setPhoneName(sc.next());
        }while (test(newMem.getFullName(), arrayList) == false);

        System.out.println("Enter group: ");
        newMem.setGroup(sc.next());
        System.out.println("Enter gender: ");
        newMem.setGender(sc.next());
        System.out.println("Enter address: ");
        newMem.setAddress(sc.next());
        do {
            System.out.println("Enter email: ");
            newMem.setMail(sc.next());
        }while (checkMail(newMem.getMail()) == false);
        System.out.println("Enter Date Birth: ");
        newMem.setDateBirth(sc.next());
        arrayList.add(newMem);
    }
}
