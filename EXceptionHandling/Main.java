1. Basic Exception Handling
Q1: Write a Java program that takes two integers as input and performs division. Handle the case where the denominator is zero using a try-catch block.

Expected Output:
Enter numerator: 10
Enter denominator: 0
Exception: Division by zero is not allowed.

/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
      

        try {
            int c = 1 / 1;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } 
    }
}

*/

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

2. Exception Propagation
Q2: Create a program with three methods: methodA(), methodB(), and main(). methodA() should throw an ArithmeticException, and the exception should propagate to main(), where it is caught and handled.

/*

import java.util.Scanner;

public class Main {
    public static void methodA(){
        System.out.println("Inside the methodA");
        int result = 10 / 1 ;
    }
    
    public static void methodB(){
        System.out.println("Inside the methodB");
        methodA();
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed." + e);
        } 
    }
}


*/

