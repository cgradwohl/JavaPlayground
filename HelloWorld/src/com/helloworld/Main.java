// what package this class belongs to!
package com.helloworld;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Primitive Types
        // ----------------
        // byte     1 byte
        // short    2 bytes
        // int      4 bytes
        // long     8 bytes
        // float    4 bytes
        // double   8 bytes
        // char     2 bytes
        // boolean  1 byte

        // Primitive types allocate memory for the value directly.
        // -------------------------------------------------------
        // immutable, cannot be changed by another pointer.
        // byte x = 1;
        // byte y = x;
        // x = 2;
        // variable y is not referencing x, since x and y are primitive types.
        // System.out.println(y);

//        byte age = 30;
//        int viewsCount = 123_456_978;
//        long anotherViewsType = 1_000_000_000L;
//        float price = 10.99F;
//        char letter = 'A'; // char with one char
//        boolean isEligible = false;


        // Reference Types
        // -----------------
        // ... lots, all complex types
//        Date now = new Date();
//        now.getTime();
//        System.out.println(now);


        // First, we you declare new Point() object, a new object is created at a memory address.
        // Second 'point1' points to the address of the new Point() object.
//        Point point1 = new Point(1, 1);
        // Now point2 points to the address that point2 is pointing too,
        // which is the memory address of the new Point() object ...
        // therefore point1 and point2 both point to the new Point() object.
        // they reference the same object.
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);
//
//        // print the mem address of each pointer.
//        int add1 = System.identityHashCode(point1);
//        System.out.println(add1);
//        int add2 = System.identityHashCode(point2);
//        System.out.println(add2);


        // ---------------------------------------------------------------
        // ------------------           Strings                 ---------------
        // ---------------------------------------------------------------
        //         String message = new String("Hello World");
//        String message = "hello world" + "!!";
//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.startsWith("!!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("e")); // 1
//        System.out.println(message.indexOf('l')); // 2
        // note target and replacement are paramters to the method
        // note that "!" and "*" are the arguments :)
//        System.out.println(message.replace("!", "*"));
//        System.out.println(message); // strings are immutable
//
//        System.out.println(message.trim());
//        System.out.println(message.toUpperCase());


        // escape characters
//        String name = "Chris \"Gradwohl\"";
//        System.out.println(name);
//
//        String path = "c:\\windows\\...";
//        System.out.println(path);
//
//        // \t tab and \n new line chars
//        System.out.println("\t" + name + "\n" );





        // ---------------------------------------------------------------
        // ------------------           Array                 ---------------
        // ---------------------------------------------------------------

        // create the array
//        int [] numbers = new int[4]; // declares and array of size 4 :)

        // initialize the array
//        numbers[0] = 300;
//        numbers[1] = 400;
//        numbers[2] = 500;
//        numbers[3] = 600;
//        // numbers[5] = 1000; // throws exception java.lang.ArrayIndexOutOfBoundsException
//
//        System.out.println(numbers); // prints mem address
//        System.out.println(Arrays.toString(numbers));
//        // note: the method Arrays.toString is 'overloaded' because it is implemented with different _parameters_ types
//
//
//        // create and initialize arrays in one step
//        // arrays hhave fixed length
//        int[] numbers2 = { 300, 200, 300, 400, 500  };
//        System.out.println(numbers2.length);
//        Arrays.sort(numbers2);
//        System.out.println(Arrays.toString(numbers2));
//
//
//
//        // Multi Dimensional Arrays
//        // create a 2D matrix size 2 X 3
//        int[][] matrix = new int[2][3];
//
//        // initial 2D matrix
//        matrix[0][0] = 400;
//        matrix[1][2] = 777;
//
//        System.out.println(Arrays.deepToString(matrix));
//
//
//        // create and initial 2D matrix of size 2X3
//        int[][] matrix2 = {{400, 0, 0}, {0, 0, 777}};
//        System.out.println(Arrays.deepToString(matrix2));


        // ---------------------------------------------------------------
        // ------------------           Constants                 ---------------
        // ---------------------------------------------------------------
//        float pi = 3.14F;
//        pi = 1; // float is mutable!
//
//        final float PI = 3.14F; // final makes it immutable
//        //        PI = 1;  <-- cannot reassign final variables
//        System.out.println(PI);



        // ---------------------------------------------------------------
        // ------------------           Arithmatic Expressions      ---------------
        // ---------------------------------------------------------------

        // we need to cast 10 and 3 as doubles and therefore result must also be of type double
//        double result = (double)10 / (double)3;
//        System.out.println(result);
//
//        int val1 = 1;
//        int val2 = val1++; // increments AFTER the assignment expression
//
//        int anotherval = ++val1; // increments BEFORE the assignment expression
//
//        System.out.println(val1);
//        System.out.println(val2);
//        System.out.println(anotherval);
//
//
//        // augmented assignment operators
//        int a = 4;
//        //        a = a + 2;  Same as below
//        a += 2;
//        System.out.println(a); // 6



        // ---------------------------------------------------------------
        // ------------------    Order of Operations      ---------------
        // ---------------------------------------------------------------
//        int b = 10 + 3 * 2;
//        System.out.println(b); // what will it print?


        // ---------------------------------------------------------------
        // ------------------        Casting               ---------------
        // ---------------------------------------------------------------
//        short n = 1;
//        int m = n + 2;
//        System.out.println("CAST ING");
//        System.out.println(m);
        /**
         * because we are adding aa short type and an int type what happens under the hood ?
         *
         * short n = 1;
         * int m = n + 2;
         *
         *
         * Implicit Casting
         * Java Compiler will implicitly cast whenever there is no chance of data loss.
         * 1. java compiler looks at the value of n, 1
         * 2. allocates an anonymous memory address of type int and then
         *      copy the value of n at that memory address
         * 3. then jc will add 2 to that anonymous memory address
         * short is 2 bytes, and an int is 4 bytes so any short can fit in an int,
         * therefore we can implicitly cast a short to an int
         *
         * compatible types
         * byte > short > int > long > float > double
         *
         * // implicit casting for this will work because an int cannot fit into a short.
         * int c = 3;
         * short d = c + 2;
         */

        // here we want too explicitly cast to a type
//        double c = 1.1;
//
//        // we explicitly cast the variable c to an int
//        // then we will add 2
//        int d = (int) c + 2;
//
//        String e = "10";
//        int f = Integer.parseInt(e) + 2;
//        System.out.println(f);

        /**
         * types recap
         * -----------
         * byte, 1
         * short, 2
         * int, 4
         * double, 8
         * long, 8
         * float, 4
         * char, 2
         * boolean, 1
         */


        // Math Class
        // -------------------------
//        int rounded = Math.round(1.1F);
//        System.out.println(rounded);
//
//        int ceil = (int) Math.ceil(1.7);
//        int floor = (int) Math.floor(1.7);
//        System.out.println(ceil);
//        System.out.println(floor);
//        int min = Math.min(2, 4);
//        int max = Math.max(2, 4);
//        System.out.println(min);
//        System.out.println(max);
//
//        // double with lots of decimals
//        double rand = Math.random() * 100;
//        System.out.println(rand);
//
//        // rounding the double to  whole number but we still have fraction
//        double rando = Math.round(Math.random() * 100);
//        System.out.println(rando);
//
//        int randomWholeNumber = (int) Math.round(Math.random() * 100); // Math.round() returns long so explicit cast
//        System.out.println(randomWholeNumber);
//
//        int alwaysZero = (int) Math.random() * 100;
//        System.out.println(alwaysZero);
//
//        int anotherRandomWholeNumber = (int) (Math.random() * 100);
//        System.out.println(anotherRandomWholeNumber);


        // FORMATTING NUMBERS
        // 1234567 => $1,234,567
        // 0.10 => 10%
//            NumberFormat currency = new NumberFormat();   NOTE: abstract classes vs regular classes
//        NumberFormat sscacs = NumberFormat.getCurrencyInstance(); // Factory Method :)
//
//        String resss = sscacs.format(123456.891);
//        System.out.println(resss);
//
//
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String rea = percent.format(.1034);
//        System.out.println(rea);
//
//        String r = NumberFormat.getPercentInstance().format(.7529);
//        System.out.println(r);

        // =================================================
        // MORTGAGE CALCULATOR
        // =================================================
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter Principal Amount: ");
//        int principal = scanner.nextInt();
//
//        System.out.print("Enter Annual Interest Rate: ");
//        double monthlyInterestRate = scanner.nextDouble() / 1200;
//
//        System.out.print("Enter Mortgage Length (Years): ");
//        int n = scanner.nextInt() * 12;
//
//        double constant = Math.pow((1 + monthlyInterestRate), n);
//
//        double result = principal
//                * (monthlyInterestRate * constant)
//                / (constant - 1);
//
//        String monthlyPayment = NumberFormat.getCurrencyInstance().format(result);
//
//        System.out.print("Your monthly payments: " + monthlyPayment);

//        ==========================================================
//        CONTROL FLOW
//        ==========================================================
//        int x = 1;
//        int y = 1;
//        boolean result = x <= y;
//        System.out.println(result);
//        int temp = 31;
//        boolean isWarm = temp > 20 && temp < 30;
//        System.out.println(isWarm);
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = false;
//        boolean hasCriminal = false;
//        boolean valid = (hasGoodCredit || hasHighIncome) && !hasCriminal;
//        System.out.println(valid);

//        boolean yes = true;
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("ENTER AGE: ");
//        int age = scanner.nextInt();
//
//        if(yes && age >= 21) {
//            System.out.println("BOOBS");
//        } else {
//            System.out.println("NAH BRUH");
//        }

        // ternary :)
//        int income = 120_000;
//        String rank = income > 100_000 ? "HIGH SALARY" : "LOW SALARY";
//        System.out.println(rank);
//
//
//        String role = "ajdcnoandc";
//        switch (role) {
//            case "admin":
//                System.out.println("Admin ROle");
//                break;
//            case "boobhead":
//                System.out.println("BOOBHEAD");
//                break;
//            default:
//                System.out.println("GUEST ROLE");
//        }

//        System.out.print("ENTER FIZZBUZZ NUMBER: ");
//        int number = scanner.nextInt();
//        boolean divisibleByFive = number % 5 == 0;
//        boolean divisibleByThree = number % 3 == 0;
//
//
//        if (divisibleByFive && divisibleByThree) {
//            System.out.println("FizzBuzz");
//        } else if (divisibleByThree) {
//            System.out.println("Buzz");
//        } else if (divisibleByFive) {
//            System.out.println("Fizz");
//        } else {
//            System.out.println(number);
//        }
//        for (int i = 5; i >= 1; i--) {
//            System.out.println("WEEEEEEEEEEEEEE!" + i);
//        }
//
//        int i = 1;
//        while (i <= 5) {
//            System.out.println("WWOOOOOOOOWWWWWW" + i);
//            i++;
//        }

//        String input = "";
//        while (!input.equals("quit")) {
//            System.out.print("Enter Commands: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass")) {
//                continue;
//            }
//            if (input.equals("quit")) {
//                break;
//            }
//            System.out.println(input);
//        }
//
//        do {
//            System.out.print("Enter Commands For Second Loop: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));





        // allocate and initialize
        String[] fruits = {"apple", "bannana", "pinapple"};

        // allocate
        String[] dudes = new String[3];
        // and initialize
        dudes[0] = "chris";
        dudes[1] = "ben";
        dudes[2] = "kai";

        for(int j = 0; j <= 2; j++) {
            System.out.println(fruits[j]);
        }

        // For Each loop! always go forward :)
        // dont have access to each item
        for(String fruit: fruits) {
            System.out.println(fruit);
        }



        int[] things = new int[3];
        things[0] = 2;
        things[1] = 4;
        things[2] = 8;

        for(int i = 0; i < things.length; i++) {
            System.out.println("YO: ");
            System.out.println(things[i]);
        }









    }
}
























