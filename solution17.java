import java.util.Scanner;
public class solution17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();

        int [][] arr = new int[n][m];
        int [][] arr2 = new int[m][p];        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                arr2[i][j] = scanner.nextInt();
            }
        }
        int [][] result = new int[n][p];

        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                for(int k=0;k<m;k++){
                    result[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}