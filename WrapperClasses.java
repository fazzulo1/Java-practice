import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        ArrayList<Integer> myIntAL = new ArrayList<>();
        myIntAL.add(10);
        myIntAL.add(20);

        for(int i = 0; i < myIntAL.size(); i++){
            System.out.println(myIntAL.get(i));
        }
        String num = "1.1";
        Double numd = Double.parseDouble(num);
        System.out.println(numd);
        numd += 10;
        System.out.println(numd);
    }
}
