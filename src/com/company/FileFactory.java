package com.company;

import com.company.Contact;

import java.io.*;
import java.util.ArrayList;

public class FileFactory {
    public static ArrayList<Contact> readContact(String path) throws IOException {
        File file = new File(path);
        ArrayList<Contact> arrayList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try{
            if(!file.exists()){
            file.createNewFile();
            }
            if(file.length()>0){
                 fileInputStream = new  FileInputStream(file);
                 objectInputStream = new ObjectInputStream(fileInputStream);
                arrayList = (ArrayList<Contact>) objectInputStream.readObject();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (objectInputStream!=null){
                objectInputStream.close();
                fileInputStream.close();
            }
        }
        return arrayList;
    }

    public static void writeContact(String path, ArrayList<Contact> arrayList) throws Exception{
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayList);
    }
}
