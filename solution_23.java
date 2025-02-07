import java.util.Scanner;
public class solution_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // pascal triangle
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        
        scanner.close();
    }
}