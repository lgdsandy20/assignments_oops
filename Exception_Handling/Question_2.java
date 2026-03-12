// Wirte a Java program that creates and array of size 3 and tries to access the 5th element. Handle the ArrayIndexOutOfBoundException
import java.util.*;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array of length 3");
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        try {
            System.out.println("The 5th element of the array is " + arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There was a error!! " + e.getMessage());
        }
    }
}