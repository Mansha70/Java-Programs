import java.util.Scanner;

public class que17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second number: ");
        int b= sc.nextInt();
        int lcm = a*b;
        // System.out.print("gcd of "+a+" "+b+" is: ");
        do{
            int rem = a%b;
            a =  b;
            b = rem;
        }while(b!=0);
        int gcd = a;
        lcm = lcm/gcd;
        System.out.println("lcm would be: "+lcm);
        sc.close();
    }
}
