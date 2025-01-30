import java.util.Scanner;
public class solution1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>=90){
            System.out.println("Grade: A");
        }
        else if(a>=80 && a<90){
            System.out.println("Grade: B");
        }
        else if(a>=70 && a<80){
            System.out.println("Grade: C");
        }
        else if(a>=60 && a<70){
            System.out.println("Grade: D");
        }
        else if(a<60){
            System.out.println("Grade: F");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}