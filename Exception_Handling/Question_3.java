//Wrtie a Java program that converts a String to an Integer.parseInt() and handles NumberFormatException

import java.util.*;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        try {
            int a = Integer.parseInt(s);
            System.out.println("The Integer string is " + a);
        }
        catch (NumberFormatException e) {
            System.out.println("There is an error!! " + e.getMessage());
        }
        
    }
}