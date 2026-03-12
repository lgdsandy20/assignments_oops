// Write a Java program that divide two integers and handles ArithmeticExpression when division by zero occurs.

import java.util.*;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers for divide");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int result = a / b;
            System.out.println("The answer is " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("There was a error!! " + e.getMessage());
        }
    }
}