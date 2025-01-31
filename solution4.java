public class solution4 {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the amount: ");
        int a = sc.nextInt();
        if(a>=5000){
            float b  = a*20/100;
            System.out.printf("Discount: %.2f\n",b);
            System.out.println("Final Amount: " + (a-b));

        }
        else if(a>=3000  && a<5000){
            float c = a*10/100;
            System.out.printf("Discount: %.2f\n",c);
            System.out.println("Final Amount: " + (a-c));
        }
    }
}
