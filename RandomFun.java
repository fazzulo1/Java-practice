import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {

        Random random = new Random();
        int myrandomNum = random.nextInt();
        System.out.println(myrandomNum); // o to 2^8

        myrandomNum = random.nextInt(10); // 0 to 10
        System.out.println(myrandomNum);

        myrandomNum = random.nextInt(10) + 1;
        System.out.println(myrandomNum);

    }
}
