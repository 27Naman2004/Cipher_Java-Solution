import java.util.Scanner;
public class solution_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a<2){
            System.out.println("Invalid Input");
        }else{
            System.out.println("Prime numbers between 1 and " + a + " are: ");
        }
        for (int i = 2; i < a; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
        }
        scanner.close();
    }
}