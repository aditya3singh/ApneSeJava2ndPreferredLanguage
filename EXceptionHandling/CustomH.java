import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class CustomH {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be greater then 18");
        } else {
            System.out.println("Acces granted age is 18 o more");
        }
    }




    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        // Scanner sc = new Scanner(System.in);


        try {
            int age = 18;
            System.out.println("Enter the age "+ age);
            validateAge(age);

        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 

    }
}
