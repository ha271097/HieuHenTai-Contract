package com.company;

import java.util.ArrayList;

public class SortContact {
    public void sortContact(ArrayList <Contact> arrayList){
        for (int i = 0 ; i < arrayList.size() - 1 ; i++) {
            for (int j = arrayList.size() - 1 ; j > i ; j--) {
                if(arrayList.get(j).getFullName().compareToIgnoreCase(arrayList.get(j -1).getFullName()) < 0){
                    Contact temp = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j -1));
                    arrayList.set(j - 1, temp);

                }
            }
        }
    }
}
