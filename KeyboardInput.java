import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        String lastname;
        float height;
        boolean relatives;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("What is your lastname?");
        lastname = keyboard.nextLine();

        System.out.println("What is your height?");
        height = keyboard.nextFloat();
        keyboard.nextLine();

        System.out.println("Do you have relatives?");
        relatives = keyboard.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("My age is " + age);
        System.out.println("Your last name is " + lastname);
        System.out.println("Your height is " + height);
        System.out.println("Do you have relatives? " + relatives);

    }
}
