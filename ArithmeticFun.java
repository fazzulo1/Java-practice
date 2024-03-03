public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int result = a + b;
        int diff = a -b;
        int prod = a * b;
        float div = (float) a / b;
        int mod = a % b;
        System.out.println("The result is " + result);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(div);
        System.out.println(mod);
        result += 20;
        System.out.println("The result is " + result);
        result++;
        System.out.println("The ++ result is " + result);
        prod *= 2;
        System.out.println("Final value of prod is " + prod);
    }
}
