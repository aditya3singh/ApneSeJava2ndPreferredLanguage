import java.util.Scanner;

public class AssertionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        // Assertion to check if the number is positive
        assert num > 0 : "Error: Number must be positive!";

        System.out.println("Valid input! You entered: " + num);

        sc.close();
    }
}
