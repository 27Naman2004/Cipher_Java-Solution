import java.util.Scanner;
public class solution_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int freq=0;
        int ans = arr[0];

        for(int i=0;i<n;i++){
            if(freq==0){
                ans = arr[i];
            }
            if(arr[i]==ans) freq++;
            else freq--;
        }
        System.err.println("Majority Element: "+ans);
        
        scanner.close();
    }
}