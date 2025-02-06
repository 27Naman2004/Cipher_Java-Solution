import java.util.Scanner;
public class soln_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for(int i=0;i<=a;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz\n");
            }else if(i%5==0){
                System.out.println("Buzz\n");
            }else if(i%3==0){
                System.out.println("Fizz\n");
            }
            else{
                System.out.println(i+"\n");
            }

        }

        
        
        scanner.close();
    }
}