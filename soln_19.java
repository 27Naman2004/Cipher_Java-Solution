import java.util.Scanner;
public class soln_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        // 2nd largest element
        int a = arr[0];
        for (int i = 0; i < n; i++){
            if (arr[i] > a){
                a = arr[i];
            }
        }
        

        System.out.println("Second Largest number is: " + b);
        scanner.close();
    }
}