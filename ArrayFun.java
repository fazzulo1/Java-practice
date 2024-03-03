public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 11;
        myArray[2] = 12;
        myArray[3] = 13;
        myArray[4] = 14;

        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        for( int num : myArray) System.out.println("This is number: " + num);
    }
}
