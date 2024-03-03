import java.util.Scanner;

public class RepetitionFun {
    public static void main(String[] args) {
//        int count = 0;
//        while(count < 10) {
//            System.out.println(count + 1);
//            count++;
//        }

//
//        int count2 = 0;
//          do{
//              System.out.println(count2);
//              count2++;
//          }
//          while(count2 < 10);


//        for(int i =0; i < 10; i++){
//            System.out.println(i);
//        }

        Scanner keyboard = new Scanner(System.in);
        int input;
        System.out.println("Enter a positive number");
        System.out.println("OR Enter a negative number to exit");
        input = keyboard.nextInt();

        while(input > 0){
            System.out.println(input);

            System.out.println("Enter a positive number");
            System.out.println("OR Enter a negative number to exit");
            input = keyboard.nextInt();

        }
        System.out.println("You entered a negative number to EXIT");


    }
}
