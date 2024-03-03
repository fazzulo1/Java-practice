import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double average;

        System.out.println("Enter three number in a row: ");
        num1 = keyboard.nextDouble();
        num2 = keyboard.nextDouble();
        num3 = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Your numbers are: ");
        System.out.println(num1 + num2 + num3);

        average = (num1 + num2 + num3)/3.0;
        System.out.println(average);
    }
}
