package com.company;

import java.util.Scanner;

public class InputInformation {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static String inputMem() {
        System.out.println("Enter new Mem: ");
        return SCANNER.nextLine();
    }
    public static String inputPhone(){
        System.out.println("Enter new Phone");
        System.out.println("// +xx - xxxxxxxxx");
        return SCANNER.nextLine();
    }
    public static String inputGroup(){
        System.out.println("Enter group: ");
        return SCANNER.nextLine();
    }
    public static String inputGender(){
        System.out.println("Enter gender: ");
        return SCANNER.nextLine();
    }
    public static String inputAddress(){
        System.out.println("Enter address: ");
        return SCANNER.nextLine();
    }

    public static String inputEmail(){
        System.out.println("Enter email: ");
        return SCANNER.nextLine();
    }

    public static String inputBirth(){
        System.out.println("Enter Date Birth: ");
        return SCANNER.nextLine();
    }

    public static String inputNote(){
        System.out.println("Note: ");
        return SCANNER.nextLine();
    }

}
