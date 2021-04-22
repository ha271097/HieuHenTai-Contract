package com.company;

import java.util.ArrayList;

public class searchContact {
    // Check name or phone có trong Contact không
    public boolean testName(String name, ArrayList<Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(name.equals(arrayList.get(i).getFullName()) || name.equals(arrayList.get(i).getPhone())){
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
            if(mem.equals(arrayList.get(i).getPhone() ) || mem.equals(arrayList.get(i).getFullName())) {
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
