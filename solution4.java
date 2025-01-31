public class solution4 {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter age: "+a);
        int b = sc.nextInt();
        System.out.println("Enter Salary: " + b);
        boolean c = sc.nextBoolean();
        System.out.println("Any due: " + c);
        if(a>=18){
            if(b>=30000){
                if(c == false){
                    System.out.println("You are eligible for premium membership"); //                              
                }else{
                    System.out.println("Not Eligible for Membership");
                }
            }
        }else{
            System.out.println("Not eligible");
        }
    }
}
