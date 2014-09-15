package com.example.calculatorapp;

import java.util.Scanner;
/**
 * Created by kyleofori on 9/13/14.
 */
public class CalculatorApp {
    public static void checkMainScreenInput() {
        //This section is for the main screen--defining variables, and making sure that
        //the choices are appropriate for the initial rounds of calculation.
        boolean inMistakeLoop = true;
        String mainScreenQuestions = "1 - addition\n2 - subtraction\n3 - addition\n4 - division\n5 - square root";
        String wrongMainScreen = "Sorry, you need to enter a number between 1 and 5.";
        String wrongNumber = "Sorry, you need to enter a double.";
        Scanner calculator = new Scanner(System.in);
        int choice = 1;
        double var1 = 0, var2 = 0;
        String wordChoice1, wordChoice2;

        do {
            System.out.println(mainScreenQuestions);
            if (calculator.hasNextInt()) {
                choice = calculator.nextInt();
                if (choice >= 1 && choice <= 5) {
                    inMistakeLoop = false;
                } else {
                    System.out.println(wrongMainScreen);
                    calculator.nextLine();
                }
            } else {
                System.out.println(wrongMainScreen);
                calculator.nextLine();
            }
        } while (inMistakeLoop);
        System.out.println(choice);

        //The following section is for each of the operations.
        //It should really use the choice from the previous do-while loop as an input.
        //I want it to be in a switch, if that's possible...
        //...but there are so many steps needed after a switch, it would be hard to read unless
        //I made a separate method for each operation.

        //How do I simplify the following to avoid repeating myself? A method that just takes numbers?
        if(choice >= 1 && choice <=4) {
            do {
                inMistakeLoop = true;
                System.out.println("Please enter first number: ");
                if (calculator.hasNextDouble()) {
                    var1 = calculator.nextDouble();
                    System.out.println("first number: " + var1);
                    inMistakeLoop = false;
                } else {
                    System.out.println(wrongNumber);
                }
            } while (inMistakeLoop);

            do {
                inMistakeLoop = true;
                System.out.println("Please enter second number: ");
                if (calculator.hasNextDouble()) {
                    var2 = calculator.nextDouble();
                    System.out.println("second number: " + var2);
                    inMistakeLoop = false;
                } else {
                    System.out.println(wrongNumber);
                }
            } while (inMistakeLoop);
        }

        if (choice == 5) {
            do {
                inMistakeLoop = true;
                System.out.println("Please enter radicand: ");
                if (calculator.hasNextDouble()) {
                    var1 = calculator.nextDouble();
                    System.out.println("radicand: " + var1);
                    inMistakeLoop = false;
                } else {
                    System.out.println(wrongNumber);
                }
            } while (inMistakeLoop);
        }
        switch (choice) {

            case 1:    //ADDITION:
            System.out.println("The sum of " + var1 + " and " + var2 + " is " + (var1 + var2) + ".");
                break;
            case 2:     //SUBTRACTION:
            System.out.println("The difference of " + var1 + " and " + var2 + " is " + (var1 - var2) + ".");
                break;
            case 3:     //MULTIPLICATION
            System.out.println("The product of " + var1 + " and " + var2 + " is " + (var1 * var2) + ".");
                break;
            case 4:     //DIVISION
            if(var2!=0) {
                System.out.println("The quotient of "+ var1 + " and " + var2 + " is " + (var1/var2) + ".");
            } else {
                System.out.println("The quotient of "+ var1 + " and " + var2 + " is undefined.");
            }
                break;
            case 5:     //SQUARE ROOT
                System.out.println("The square root of " + var1 + "is " + Math.sqrt(var1) + ".");

//        Still need: to return to main menu, MAYBE changing the numbers.

        }
    }
}
//        CalculatorApp.asmdInput();

//        switch(choice) {
//            case 1: {
//                String wordChoice = "addend";
////                CalculatorApp.asmdInput();
//            }
//            //addition OR two variables
//            break;
//            case 2: //subtraction OR two variables
//                break;
//            case 3: //multiplication OR two variables
//                break;
//            case 4: //division OR two variables
//                break;
//            case 5: //square root OR one variable
//                break;





//        switch(choice) {
//            case 1: {
//                wordChoice1 = "addend";
//                wordChoice2 = "addend";
//            }
//            case 2: {
//                wordChoice1 = "subtrahend";
//                wordChoice2 = "minuend";
//            }
//            case 3: {
//                wordChoice1 = "multiplicand";
//                wordChoice2 = "multiplier";
//            }
//            case 4: {
//                wordChoice1 = "dividend";
//                wordChoice2 = "divisor";
//            }
//            case 5: {
//                wordChoice1 = "radicand";
//            }
//        }
//
//        System.out.println("Please enter "+wordChoice1+":");
//        System.out.println("Please enter "+wordChoice2+":");



//    public static int asmdInput() {
//        boolean inMistakeLoop = true;
//        String wordChoice1, wordChoice2;
//
//    }


//        //This method is used for when wrong information is entered into the calculators.
//        //questionList is the list of questions that's displayed to the user before they input info (calcInput).
//        //calcInput is the number that the user puts in to the calculator.


//
//
//
//    public static double checkCalcInput (String questionList, double CalcInput) {
//        String wrongDigitsInCalc = ("Sorry, you need to enter a number the calculator can work with. ");
//
//    }


        //calculator takes in number
        //ready to go into error loop if an int isn't entered

//        switch(choice) {
//        case 1:
//    }


//        //The following lines can be used for addition through division calculators.
//        //It would be neat to customize this to each operation: "addend", "subtrahend/minuend", etc.
//        System.out.println("Please enter first number, followed by ENTER: ");
//        if(calculator.hasNextInt()) {
//            var1 = calculator.nextInt();
//            calculator.nextLine();
//        }
//        //calculator takes in first value, assigns to var1
//        //ready to print error message, go into error loop if a double isn't entered
//        System.out.println("Please enter second number, followed by ENTER: ");
//        //calculator takes in second value, assigns to var2
//        //ready to print error message if double isn't entered
//
//
//
//        //ADDITION
//        System.out.println("The sum of "+var1+" and "+var2+" is "+(var1+var2)+".");
//        //SUBTRACTION
//        System.out.println("The difference of "+var1+" and "+var2+" is "+(var1-var2)+".");
//        //MULTIPLICATION
//        System.out.println("The sum of "+var1+" and "+var2+" is "+(var1*var2)+".");
//        //DIVISION
//        if(var2!=0) {
//            System.out.println("The sum of "+var1+" and "+var2+" is "+(var1/var2)+".");
//        } else {
//            System.out.println("The quotient of "+var1+" and 0 is undefined.");
//        }
//        //SQUARE ROOT
//        System.out.println("The square root of "+var1+" is "+(Math.sqrt(var1))+".");
//
//        //Needs to go back to main menu
//        System.out.println("Would you like to make another calculation? Enter Y for yes or N for no.");
//        //ready to print error message, go into error loop if a string Y or N is not entered. Or...char?
//        //ready to break the whole calculations loop if N is entered.

