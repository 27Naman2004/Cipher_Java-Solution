import java.util.Scanner;
public class solution_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [][] arr1 = new int[n][m];
        int [][] arr2 = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j] = scanner.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j] = scanner.nextInt();
            }
        }

        int [][] multipliy  = new int [n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                multipliy[i][j] = arr1[i][j] * arr2[i][j] + arr1[i][j] * arr2[j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(multipliy[i][j] + " ");
            }

        }
        scanner.close();
    }
}