import javax.swing.JOptionPane;
public class HelloWorld {
    public static void main(String [] args){
        System.out.println("Hello world!");
        System.out.println("Hi there!");
        JOptionPane.showMessageDialog(null, "Think about a number");
        JOptionPane.showMessageDialog(null,"The number is "+
                (1 + (int)(Math.random() * 10)));
    }
}
