package main.practice;

import java.util.Scanner;

public class AddNumbers {
    public void computeSum(){
        //Input:
        //First Number: 10
        //Second Number: 20

        //Output:
        //10 + 20 = 30

        Scanner scanner = new Scanner(System.in);

        System.out.print("First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Second Number: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
