import java.util.Scanner;

public class Project_2_2MadLib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adj1;
        String girlsName;
        String adj2;
        String occupation1;
        String place1;
        String clothing;
        String hobby;
        String adj3;
        String occupation2;
        String boysName;
        String mansName;
        System.out.println("Enter an adjective\t");
        adj1 = scanner.nextLine();
        System.out.println("Enter a girl's name\t");
        girlsName = scanner.nextLine();
        System.out.println("Enter another adjective\t");
        adj2 = scanner.nextLine();
        System.out.println("Enter an occupation\t");
        occupation1 = scanner.nextLine();
        System.out.println("Enter the name of a place\t");
        place1 = scanner.nextLine();
        System.out.println("Enter the name of a piece of clothing\t");
        clothing = scanner.nextLine();
        System.out.println("Enter the name of a hobby\t");
        hobby = scanner.nextLine();
        System.out.println("Enter another adjective\t");
        adj3 = scanner.nextLine();
        System.out.println("Enter an occupation\t");
        occupation2 = scanner.nextLine();
        System.out.println("Enter a boy's name\t");
        boysName = scanner.nextLine();
        System.out.println("Enter a man's name\t");
        mansName = scanner.nextLine();

        System.out.println("There once was a " + adj1 + " girl named " + girlsName + " who was a " +
                        adj2 + " " + occupation1 + " in the kingdom of " + place1);
        System.out.println("She loved to wear " + clothing + " and to play " + hobby + ". She wanted to marry the " +
                adj3 + " " + occupation2 + " named " + boysName +  " but her father, King " + mansName +
                " forbid her from seeing him.");
    }
}
