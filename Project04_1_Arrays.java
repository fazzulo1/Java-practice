import java.util.Enumeration;
import java.util.Scanner;

public class Project04_1_Arrays {
    public static void main(String[] args) {
        int[] myIntArray = new int[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        myIntArray[0] = scanner.nextInt();
        myIntArray[1] = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Print each number from the array");
        for(int number : myIntArray){
        System.out.println(number * 2);
    }
}}
