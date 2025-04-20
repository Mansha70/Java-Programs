import java.util.Scanner;

public class que33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int sum =0 ;
        while(num!=0)
        {
            if((num%10)%2!=0)
                sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of odd digits in the number is: "+sum);
        sc.close();
    }
}
