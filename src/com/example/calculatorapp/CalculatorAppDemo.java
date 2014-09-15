package com.example.calculatorapp;

import java.util.Scanner;
/**
 * Created by kyleofori on 9/14/14.
 */
public class CalculatorAppDemo {
    public static void main(String[] args) {
        double var1;
        double var2;
//        int choice = 1;
        Scanner repeatCalc = new Scanner(System.in);
        String anotherCalc = "";

        do {
            System.out.println("Welcome to your calculator! ");
            System.out.println("Which operation would you like to perform? Please enter the appropriate number:");

            CalculatorApp.checkMainScreenInput();


                System.out.println("Would you like to perform another calculation? Press Y for yes or N for no.");
            do {
                if (repeatCalc.hasNextLine()) {
                    anotherCalc = repeatCalc.nextLine();
                    System.out.println(anotherCalc);
                    System.out.println(!(anotherCalc.equals("Y")));
                    //This isn't accepting my answer for some reason.
                    //As long as it's not N or Y....
                    if (!anotherCalc.equals("N") && !anotherCalc.equals("Y")) {
                        System.out.println("Please press Y for yes or N for no.");
                    }
                }
            } while (!anotherCalc.equals("N") && !anotherCalc.equals("Y"));

        } while(anotherCalc.equals("Y"));

        System.out.println("OK, we're done here. Thank you!");

    }
}
