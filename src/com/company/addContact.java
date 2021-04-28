package com.company;
import java.util.ArrayList;


public class addContact {

    // Check Phone
    public static  boolean testCheckPhone(String test, ArrayList<Contact> arrayList){
        for (Contact contact : arrayList) {
            if (test.equals(contact.getPhone()) || test.equals(contact.getFullName())) {
                System.out.println("Please enter again: ");
                return false;
            }
        }
        return true;
    }
    // Check định dạng phone
    public static boolean checkInvalidPhone(String phone){
        String phonePattenrn = "\\+\\d{2}-\\d{9}";
        if(phone.matches(phonePattenrn)){
            return true;
        }
        System.out.println(" Invalid data!!!!");
        return false;
    }
    // Check xem email đúng hay sai
    public static boolean checkMail(String mail ){
        String mailPattenr =  "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        if(mail.matches(mailPattenr)){
            return true;
        }
        System.out.println("Email fail -- Please enter again.");
        return false;
    }

    // Thêm phần tử trong mảng
    public void add(ArrayList<Contact> arrayList){
        Contact newMem = new Contact();

        do {
            newMem.setFullName(InputInformation.inputMem());
        }while (!testCheckPhone(newMem.getFullName(), arrayList));

        do {
            newMem.setPhone(InputInformation.inputPhone());
        }while (!testCheckPhone(newMem.getFullName(), arrayList) || !checkInvalidPhone(newMem.getPhone()));

        newMem.setGroup(InputInformation.inputGroup());
        newMem.setGender(InputInformation.inputGender());
        newMem.setAddress(InputInformation.inputAddress());

        do {
            newMem.setMail(InputInformation.inputEmail());
        }while (!checkMail(newMem.getMail()));

        newMem.setDateBirth(InputInformation.inputBirth());
        newMem.setNote(InputInformation.inputNote());

        arrayList.add(newMem);

        try {
            FileFactory.writeContact("Contact.txt",arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
