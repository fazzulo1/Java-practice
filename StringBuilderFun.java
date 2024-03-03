public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("John Baugh");
        sb.append(" is great");
        System.out.println(sb);

        sb.insert(5, "Phillip ");
        System.out.println(sb);

        sb.replace(22, 27, "nicer");
        System.out.println(sb);

        sb.delete(5, 13);
        System.out.println(sb);

        // replace first name with "Dr."

        sb.replace(0, 4, "Dr.");
        System.out.println(sb);
    }
}
