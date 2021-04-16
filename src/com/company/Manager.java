package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public  void test(String test, ArrayList <Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(test.equals(arrayList.get(i).getPhoneName()) || test.equals(arrayList.get(i).getFullName())){
                System.out.println("Please enter again: ");
            }
        }
    }
    public void add(ArrayList<Contact> arrayList){
//        String fullName, String phoneName, String group, String gender, String address, String mail, String dateBirth
        Scanner sc = new Scanner(System.in);
        Contact newMem = new Contact();
            System.out.println("Enter new Mem: ");
            newMem.setFullName(sc.nextLine());
            test(newMem.getFullName(),arrayList);
            System.out.println("Enter new phone: ");
            newMem.setPhoneName(sc.next());
            System.out.println("Enter group: ");
            newMem.setGroup(sc.next());
            System.out.println("Enter gender: ");
            newMem.setGender(sc.next());
            System.out.println("Enter address: ");
            newMem.setAddress(sc.next());
            System.out.println("Enter email: ");
            newMem.setMail(sc.next());
            System.out.println("Enter Date Birth: ");
            newMem.setDateBirth(sc.next());
            arrayList.add(newMem);
        }

    public void update(int index, ArrayList<Contact> arrayList){
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
    public void deleteMem(int index, ArrayList<Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if (i == index){
                arrayList.remove(i);
            }

        }
    }
    public void dispayListContact(ArrayList <Contact> arrayList){
        System.out.println(arrayList);

    }
    public void search(String mem, ArrayList<Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(mem.equals(arrayList.get(i).getPhoneName() ) || mem.equals(arrayList.get(i).getFullName())) {
                Contact a = arrayList.get(i);
                System.out.println(a);
            }
        }
    }

}
