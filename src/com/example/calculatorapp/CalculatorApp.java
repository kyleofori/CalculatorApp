package com.example.calculatorapp;

import java.util.Scanner;
/**
 * Created by kyleofori on 9/13/14.
 */
public class CalculatorApp {
    public static void main(String[] args) {

        double var1;
        double var2;

        Scanner calculator = new Scanner(System.in);

        //The following lines can be used for addition through division calculators.
        System.out.println("Please enter first addend, followed by ENTER: ");
        //calculator takes in first value, assigns to var1
        //ready to print error message, go into error loop if a double isn't entered
        System.out.println("Please enter second addend, followed by ENTER: ");
        //calculator takes in second value, assigns to var2
        //ready to print error message if double isn't entered

        //ADDITION
        System.out.println("The sum of "+var1+" and "+var2+" is "+(var1+var2)+".");
        //SUBTRACTION
        System.out.println("The difference of "+var1+" and "+var2+" is "+(var1-var2)+".");
        //MULTIPLICATION
        System.out.println("The sum of "+var1+" and "+var2+" is "+(var1*var2)+".");
        //DIVISION
        System.out.println("The sum of "+var1+" and "+var2+" is "+(var1/var2)+".");
        //SQUARE ROOT
        System.out.println("The square root of "+var1+" is "+(Math.sqrt(var1))+".");

        //Needs to go back to main menu
        System.out.println("Would you like to make another calculation? Enter Y for yes or N for no.");
        //ready to print error message, go into error loop if a string Y or N is not entered. Or...char?
        //ready to break the whole calculations loop if N is entered.

    }
}
