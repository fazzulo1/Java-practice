public class RelationalOperators {
    public static void main(String[] args) {
        int myAge = 3;
        int yourAge = 5;
        boolean myBool = true;
        boolean yourBool = false;
        System.out.println("My bool is " + myBool);
        System.out.println("Your bool is " + yourBool);
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge is " + ageComparison);
        ageComparison = myAge < yourAge;
        System.out.println("myAge < yourAge is " + ageComparison);
        ageComparison = myAge == yourAge;
        System.out.println("myAge = yourAge is " + ageComparison);
        String myName = "John";
        String yourName = "Jade";
        boolean nameComparison = myName.equals(yourName);
        System.out.println("Is my name equal to yours? " + nameComparison);
        boolean isGreaterThan21 = myAge > 21;
        System.out.println("21? " + false);
    }
}
