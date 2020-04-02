// what package this class belongs to!
package com.helloworld;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

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

        byte age = 30;
        int viewsCount = 123_456_978;
        long anotherViewsType = 1_000_000_000L;
        float price = 10.99F;
        char letter = 'A'; // char with one char
        boolean isEligible = false;


        // Reference Types
        // -----------------
        // ... lots, all complex types
        Date now = new Date();
        now.getTime();
        System.out.println(now);


        // First, we you declare new Point() object, a new object is created at a memory address.
        // Second 'point1' points to the address of the new Point() object.
        Point point1 = new Point(1, 1);
        // Now point2 points to the address that point2 is pointing too,
        // which is the memory address of the new Point() object ...
        // therefore point1 and point2 both point to the new Point() object.
        // they reference the same object.
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        // print the mem address of each pointer.
        int add1 = System.identityHashCode(point1);
        System.out.println(add1);
        int add2 = System.identityHashCode(point2);
        System.out.println(add2);


        // ---------------------------------------------------------------
        // ------------------           Strings                 ---------------
        // ---------------------------------------------------------------
        //         String message = new String("Hello World");
        String message = "hello world" + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e")); // 1
        System.out.println(message.indexOf('l')); // 2
        // note target and replacement are paramters to the method
        // note that "!" and "*" are the arguments :)
        System.out.println(message.replace("!", "*"));
        System.out.println(message); // strings are immutable

        System.out.println(message.trim());
        System.out.println(message.toUpperCase());


        // escape characters
        String name = "Chris \"Gradwohl\"";
        System.out.println(name);

        String path = "c:\\windows\\...";
        System.out.println(path);

        // \t tab and \n new line chars
        System.out.println("\t" + name + "\n" );





        // ---------------------------------------------------------------
        // ------------------           Array                 ---------------
        // ---------------------------------------------------------------

        // create the array
        int [] numbers = new int[4]; // declares and array of size 4 :)

        // initialize the array
        numbers[0] = 300;
        numbers[1] = 400;
        numbers[2] = 500;
        numbers[3] = 600;
        // numbers[5] = 1000; // throws exception java.lang.ArrayIndexOutOfBoundsException

        System.out.println(numbers); // prints mem address
        System.out.println(Arrays.toString(numbers));
        // note: the method Arrays.toString is 'overloaded' because it is implemented with different _parameters_ types


        // create and initialize arrays in one step
        // arrays hhave fixed length
        int[] numbers2 = { 300, 200, 300, 400, 500  };
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));



        // Multi Dimensional Arrays
        // create a 2D matrix size 2 X 3
        int[][] matrix = new int[2][3];

        // initial 2D matrix
        matrix[0][0] = 400;
        matrix[1][2] = 777;

        System.out.println(Arrays.deepToString(matrix));


        // create and initial 2D matrix of size 2X3
        int[][] matrix2 = {{400, 0, 0}, {0, 0, 777}};
        System.out.println(Arrays.deepToString(matrix2));


        // ---------------------------------------------------------------
        // ------------------           Constants                 ---------------
        // ---------------------------------------------------------------
        float pi = 3.14F;
        pi = 1; // float is mutable!

        final float PI = 3.14F; // final makes it immutable
        //        PI = 1;  <-- cannot reassign final variables
        System.out.println(PI);



        // ---------------------------------------------------------------
        // ------------------           Arithmatic Expressions      ---------------
        // ---------------------------------------------------------------

        // we need to cast 10 and 3 as doubles and therefore result must also be of type double
        double result = (double)10 / (double)3;
        System.out.println(result);

        int val1 = 1;
        int val2 = val1++; // increments AFTER the assignment expression

        int anotherval = ++val1; // increments BEFORE the assignment expression

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(anotherval);


        // augmented assignment operators
        int a = 4;
        //        a = a + 2;  Same as below
        a += 2;
        System.out.println(a); // 6



        // ---------------------------------------------------------------
        // ------------------    Order of Operations      ---------------
        // ---------------------------------------------------------------
        int b = 10 + 3 * 2;
        System.out.println(b); // what will it print?


        // ---------------------------------------------------------------
        // ------------------        Casting               ---------------
        // ---------------------------------------------------------------
        short n = 1;
        int m = n + 2;
        System.out.println("CAST ING");
        System.out.println(m);
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
        double c = 1.1;

        // we explicitly cast the variable c to an int
        // then we will add 2
        int d = (int) c + 2;

        String e = "10";
        int f = Integer.parseInt(e) + 2;
        System.out.println(f);

























    }
}
