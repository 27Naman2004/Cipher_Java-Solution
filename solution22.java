import java.util.*;

public class solution22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        // scanner.nextLine();
        String a = scanner.nextLine();
        char [] caheSet = s.toCharArray();
        char [] caheSet2 = a.toCharArray();
        Arrays.sort(caheSet);
        Arrays.sort(caheSet2);
        s = new String(caheSet);
        a = new String(caheSet2);
        
        if(s.equals(a)){
            System.out.println("YES");
        }else{ 
            System.out.println("NO");
        }



        
        
        scanner.close();
    }
}