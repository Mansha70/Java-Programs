import java.util.Scanner;

public class que16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second number: ");
        int b= sc.nextInt();
        System.out.print("gcd of "+a+" "+b+" is: ");
        do{
            int rem = a%b;
            a =  b;
            b = rem;
        }while(b!=0);
        System.out.println(a);
        sc.close();
    }
}
