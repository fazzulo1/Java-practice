public class Logical {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = true;
        boolean combined = isRaining && isWarm;
        System.out.println("Is it raining and warm? " + combined);
        combined = isRaining || isWarm;
        System.out.println("Is it eaining or warm? " + combined);
        combined = !isRaining;
        System.out.println("Is it not raining? " + combined);
    }
}
