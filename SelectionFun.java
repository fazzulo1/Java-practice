import  java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to this app");
        System.out.println("What is your age? ");
        age = keyboard.nextInt();
        if(age >= 21){
            System.out.println("You can drink");
        }
        else if(age >= 16){
            System.out.println("You can have 2 cokes");
        }
        else{
            System.out.println("You can have a coke");
        }
        System.out.println("Thanks for coming!");
    }
}
