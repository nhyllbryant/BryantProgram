package main.practice;

import java.util.Scanner;

public class CharacterClassification {

    public void clasifyChar(){
        Scanner scanner = new Scanner(System.in);
        int countLetter = 0;
        int countSpace = 0;
        int countNumber = 0;
        int countOthers = 0;
        String[] letterArray = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] numberArray = {"1","2","3","4","5","6","7","8","9","0"};

        System.out.print("Enter string: " );
        String[] strArray = scanner.nextLine().split("");

        for(String str: strArray){

            if(str.equalsIgnoreCase(" "))
                countSpace++;
            else{

                //Letter Checking
                for(String letter: letterArray){
                    if(str.equalsIgnoreCase(letter))
                        countLetter++;
                    else{
                        //Number Checking
                        for(String number: numberArray){
                            if(str.equalsIgnoreCase(number))
                                countNumber++;
                            else
                                countOthers++;
                        }
                    }
                }


            }
        }


        System.out.println("letter: " + countLetter + "\n" +
                "space: " + countSpace + "\n" +
                "number: " + countNumber + "\n" +
                "other: " + countOthers);
    }
}
