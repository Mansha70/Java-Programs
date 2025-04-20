import java.util.Scanner;

public class que31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int count =0 ;
        while(num!=0)
        {
            count++;
            num/=10;
        }
        System.out.println("number of digits in the number is: "+count);
        sc.close();
    }
}
