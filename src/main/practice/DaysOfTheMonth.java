package main.practice;

import java.util.Scanner;

public class DaysOfTheMonth {

    public void checkMonthDays(){

        //Input month: OCT

        //Output: OCT has 30 days.

        System.out.println("If you are typing write down the 3 starting letters of the following questions!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Month: ");
        String name = scanner.nextLine();

        if(name.equalsIgnoreCase("JAN") || name.equalsIgnoreCase("MAR") || name.equalsIgnoreCase("OCT") || name.equalsIgnoreCase("MAY") || name.equalsIgnoreCase("JUL") || name.equalsIgnoreCase("AUG") || name.equalsIgnoreCase("DEC"))
            System.out.println(name + " " + "has 31 days.");
        else if(name.equalsIgnoreCase("FEB") || name.equalsIgnoreCase("FEBRUARY"))
            System.out.println(name + " " + "has 29 days");
        else
            System.out.println(name + " " + "has 30 days");

    }
}
