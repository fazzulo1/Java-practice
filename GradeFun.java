
import java.util.Scanner;
public class GradeFun {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        char grade;
        System.out.println("Enter a grade ");
        grade = keyboard.next().charAt(0);

        switch (grade){
            case 'A':
            case 'a':
                System.out.println("Great job!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good job");
                break;
            default:
                System.out.println("You failed!");

        }
    }

}
