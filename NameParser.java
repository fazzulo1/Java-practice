import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName;
        String firstName;
        String lastName;
        int indexOfSpace;

        System.out.println("Enter your full name: ");
        fullName = scanner.nextLine();
        indexOfSpace = fullName.indexOf(" ");
//        System.out.println(indexOfSpace);

        firstName = fullName.substring(0, indexOfSpace);
        System.out.println("First name: " + firstName);

        lastName = fullName.substring(indexOfSpace + 1);
        System.out.println("Last name: " + lastName);
    }
}
