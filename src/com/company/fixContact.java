package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class fixContact {
//    addContact checkMail = new addContact();

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
                do {
                    newMem.setFullName(InputInformation.inputMem());
                }while (!addContact.testCheckPhone(newMem.getFullName(), arrayList));

                do {
                    newMem.setPhone(InputInformation.inputPhone());
                }while (!addContact.testCheckPhone(newMem.getFullName(), arrayList) || !addContact.checkInvalidPhone(newMem.getPhone()));

                newMem.setGroup(InputInformation.inputGroup());
                newMem.setGender(InputInformation.inputGender());
                newMem.setAddress(InputInformation.inputAddress());

                do {
                    newMem.setMail(InputInformation.inputEmail());
                }while (!addContact.checkMail(newMem.getMail()));

                newMem.setDateBirth(InputInformation.inputBirth());
                newMem.setNote(InputInformation.inputNote());

                arrayList.set(i,newMem);

                try {
                    FileFactory.writeContact("Contact.txt",arrayList);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void updateName(String name, ArrayList <Contact> arrayList){
        Contact newMem = new Contact();
        for (int i = 0 ; i < arrayList.size() ; i++) {
            if(name.equals(arrayList.get(i).getFullName())){
                do {
                    newMem.setFullName(InputInformation.inputMem());
                }while (!addContact.testCheckPhone(newMem.getFullName(), arrayList));

                do {
                    newMem.setPhone(InputInformation.inputPhone());
                }while (!addContact.testCheckPhone(newMem.getFullName(), arrayList) || !addContact.checkInvalidPhone(newMem.getPhone()));

                newMem.setGroup(InputInformation.inputGroup());
                newMem.setGender(InputInformation.inputGender());
                newMem.setAddress(InputInformation.inputAddress());

                do {
                    newMem.setMail(InputInformation.inputEmail());
                }while (!addContact.checkMail(newMem.getMail()));

                newMem.setDateBirth(InputInformation.inputBirth());
                newMem.setNote(InputInformation.inputNote());

                arrayList.set(i,newMem);

                try {
                    FileFactory.writeContact("Contact.txt",arrayList);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
