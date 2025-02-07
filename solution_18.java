import java.util.Scanner;
public class solution_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        if((n%4==0 && n%100!=0) || (n%400==0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
        
        scanner.close();
    }
}