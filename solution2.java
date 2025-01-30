import java.util.Scanner;

public class solution2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 45;
        double b = 45.0;
        char c = 'A';
        boolean d = true;

        System.out.println("Before Type Conversion");
        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + d);

        System.out.println("After Type Conversion");
        System.out.println("Integer to Double: " + (double)a);
        System.out.println("Double to Integer: " + (int)b);
        System.out.println("Character to Integer: " + (int)c);
        System.out.println("Boolean to String: " + String.valueOf(d));


        
        

    }
}
