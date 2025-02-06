import java.util.Scanner;
public class soln_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.next();

        
        String b = new StringBuilder(a).reverse().toString();
        if(a.equals(b)){
            System.out.println("Yes, it is a pallindrome");
        }else{
            System.out.println("No, it is not a pallindrome");
        }
        scanner.close();
    }
}