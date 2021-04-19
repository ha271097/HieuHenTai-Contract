package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    // Check xem name or phone đang thêm có bị trùng hay không
    public  boolean test(String test, ArrayList <Contact> arrayList){
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
    public boolean testUpdateName(String name, ArrayList <Contact> arrayList){
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
    // Check Index cần xóa có trong Contact hay không
    public boolean testDeleteIndex(int index, ArrayList <Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(i == index){
                return true;
            }
        }
        System.out.println("Index not in Contact -- Please enter again.");
        return false;
    }
    // Check Name cần xóa có trong Contact hay không
    public boolean testDeleteName(String name, ArrayList <Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(name.equals(arrayList.get(i).getFullName())){
                return true;
            }
        }
        System.out.println("Name not in Contact -- Please enter again.");
        return false;
    }
    // Xóa phần tử trong mảng
    public void deleteMemIndex(int index, ArrayList<Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if (i == index){
                arrayList.remove(i);
            }
        }
    }
    public void deleteMemName(String name, ArrayList <Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if( name.equals(arrayList.get(i).getFullName())){
                arrayList.remove(i);
            }
        }
    }

    // In ra màn hình
    public void displayListContact(ArrayList <Contact> arrayList){
        System.out.println(arrayList);
    }
    // Check name or phone có trong Contact không
    public boolean testName(String name, ArrayList <Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(name.equals(arrayList.get(i).getFullName()) || name.equals(arrayList.get(i).getPhoneName())){
                return true;
            }
        }
        System.out.println("Name not in Contact -- Please enter a gain. ");
        return false;
    }
    // Check index có trong Contact không
    public boolean testIndex(int index, ArrayList <Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if( i == index){
                return true;
            }
        }
        System.out.println("Index not in Contact -- Please enter a gain. ");
        return false;
    }
    // Tìm Kiếm
    public void search(String mem, ArrayList<Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(mem.equals(arrayList.get(i).getPhoneName() ) || mem.equals(arrayList.get(i).getFullName())) {
                Contact a = arrayList.get(i);
                System.out.println(a);
            }
        }
    }
    public void searchIndex(int num, ArrayList <Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(i == num){
                Contact b = arrayList.get(i);
                System.out.println(b);
            }
        }
    }

}