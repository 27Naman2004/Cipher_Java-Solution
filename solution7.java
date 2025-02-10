import java.util.Arrays;
import java.util.Scanner;
public class solution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String a = scanner.nextLine();

        char[] s1 = s.toCharArray();
        char[] a1 = a.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(a1);

        s = new String(s1);
        a = new String(a1);
        if(s.equals(a)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        
        scanner.close();
    }
}