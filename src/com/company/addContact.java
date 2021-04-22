package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class addContact {

    // Check Phone
    public  boolean test(String test, ArrayList<Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(test.equals(arrayList.get(i).getPhoneName()) || test.equals(arrayList.get(i).getFullName())){
                System.out.println("Please enter again: ");
                return false;
            }
        }
        return true;
    }
    // Check định dạng phone
    public boolean checkInvalidPhone(String phone){
        String phonePattenrn = "\\+\\d{2}-\\d{9}";
        if(phone.matches(phonePattenrn)){
            return true;
        }
        System.out.println(" Invalid data!!!!");
        return false;
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

        Scanner sc1 = new Scanner(System.in);
        do {
            System.out.println("Enter new phone: ");
            System.out.println("// +xx - xxxxxxxxx");
            newMem.setPhoneName(sc1.nextLine());
        }while (test(newMem.getFullName(), arrayList) == false || checkInvalidPhone(newMem.getPhoneName()) == false);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter group: ");
        newMem.setGroup(sc2.nextLine());

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter gender: ");
        newMem.setGender(sc3.nextLine());

        Scanner sc4= new Scanner(System.in);
        System.out.println("Enter address: ");
        newMem.setAddress(sc4.nextLine());

        Scanner sc5 = new Scanner(System.in);
        do {
            System.out.println("Enter email: ");
            newMem.setMail(sc5.nextLine());
        }while (checkMail(newMem.getMail()) == false);

        Scanner sc6 = new Scanner(System.in);
        System.out.println("Enter Date Birth: ");
        newMem.setDateBirth(sc6.nextLine());

        Scanner sc7 = new Scanner(System.in);
        System.out.println("Note: ");
        newMem.setNote(sc7.nextLine());

        arrayList.add(newMem);
    }
}
