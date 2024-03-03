import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int diceVal;

        for (int i = 1; i < 11; i++) {
            diceVal = random.nextInt(6) + 1;
            System.out.println("Dice number " + i + " = " +  diceVal);
        }
    }
}
