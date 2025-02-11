import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int b = 0;
        while(n!=0){
            int c = n%10;
            b = b*10 + c;
            n = n/10; 
        }
        System.out.println(b);
        scanner.close();
    }
}