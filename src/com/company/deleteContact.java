package com.company;

import java.util.ArrayList;

public class deleteContact {
    // Check Index cần xóa có trong Contact hay không
    public boolean testDeleteIndex(int index, ArrayList<Contact> arrayList){
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
}
