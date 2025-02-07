import java.util.Scanner;
public class solution_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i=0;i<n;i++){
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
        
        scanner.close();
    }
}