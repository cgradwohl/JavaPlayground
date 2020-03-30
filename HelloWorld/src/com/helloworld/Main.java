// what package this class belongs to!
package com.helloworld;

import java.awt.*;
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
    }
}
