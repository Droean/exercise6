package com.mcfadden.exercise6;
//Ean McFadden
//Exercise 6
//February 20, 2018
import java.util.*;
public class Main {
    public static void main(String[] args){
        UserInput input = new UserInput();
        String aString = input.promptString("Enter a string.");
        int aNumber = input.promptInt("Enter an integer.");
        double aDouble = input.promptDouble("Enter a double.");
        System.out.println("Your string message is " + aString + ", your int message is " + aNumber + ", your double message is " + aDouble + ".");
    }

}
class UserInput {
    Scanner scanner = new Scanner(System.in);
    public String promptString(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();
        String userString = "";
        boolean isString = false;
        while (!isString) {
            try {
                userString = userInput;
                isString = true;
            }
             catch (Exception e) {
                System.out.println(userInput + " is not a string. " + message);
                userInput = scanner.nextLine();
            } finally {
                System.out.println("This line is always executed.");
            }
        }
        return userString;

    }
    public int promptInt(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();
        int userInt = 0;
        boolean isInt = false;
        while (!isInt){

                try {
                    userInt = Integer.parseInt(userInput);
                    isInt = true;
                } catch (NumberFormatException e) {
                    System.out.println(userInput + " is not a valid integer. " + message);
                    userInput = scanner.nextLine();
                } finally {
                    System.out.println("This line is always executed.");
                }

            }

        return userInt;
    }
    public double promptDouble(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();
        double userDouble = 0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a double. " + message);
                userInput = scanner.nextLine();
            }
            finally {
                System.out.println("This line is always executed.");
            }
        }

        return userDouble;

    }
}
