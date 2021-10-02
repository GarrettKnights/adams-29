/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solutions
 *  Copyright 2021 Garrett Adams
 */

package Exercise29;

//Imports all java util
import java.util.*;

public class Solution29 {

    public static void main(String[] args) {
        //Sets up the variables that we will be using
        boolean NumberCheck = false;
        char[] DigitCheck;
        String UserRateOfReturn;

        //Sets up the scanner
        Scanner ScanWord = new Scanner(System.in);

        //Loops until satisfied
        while (true) {
            //Prompts user for input
            System.out.print("What is the rate of return? ");
            //Scans the users input to UserRateofReturn
            UserRateOfReturn = ScanWord.next();
            //Converts UserRateOfReturn to a character array stored in DigitCheck
            DigitCheck = UserRateOfReturn.toCharArray();
            //For loop that goes through each element in DigitCheck to see if all digits
            for (char i : DigitCheck) {
                //If all digits, sets NumberCheck to true
                if (Character.isDigit(i))
                    NumberCheck = true;
                //If not all digits sets NumberCheck to false
                else{
                    NumberCheck = false;
                }
            }

            //Uses try to handle exception
            try{
                //Converts Users input from a string to an integer stored in IntValue
                int IntValue = Integer.parseInt(UserRateOfReturn);
                //If all conditions are met
                if (IntValue >= 1 && IntValue <= 72 && NumberCheck == true) {
                    //Calculates the years to double investment and prints
                    System.out.println("It will take " + (72 / IntValue) + " years to double your initial investment.");
                    //Breaks the while loop
                    break;
                }
                //If conditions are not met
                else {
                    //Prints out error message
                    System.out.println("Sorry. That's not a valid input.");
                }
                //Handles exception, if the user didnt enter a number
            }catch (NumberFormatException ex) {
                //Prints out error message
                System.out.println("Sorry. That's not a valid input.");
            }
        }
    }
}

