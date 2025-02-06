import java.util.Scanner;
public class soln_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("before swapping a: " + a + " b: " + b);

        b = a+b;
        a = b-a;
        b = b-a;

        System.out.println("after swapping a: " + a + " b: " + b);
        
        
        scanner.close();
    }
}