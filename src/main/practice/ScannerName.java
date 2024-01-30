package main.practice;

import java.util.Scanner;

public class ScannerName {

    public void askName(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last Name: ");
        String lname = scanner.nextLine();

        System.out.println("First Name: ");
        String fname = scanner.nextLine();

        System.out.println("Middle Name: ");
        String  sname = scanner.nextLine();



        System.out.println("Hello " + lname + ", " + fname + " " + sname + " ");
    }
}
