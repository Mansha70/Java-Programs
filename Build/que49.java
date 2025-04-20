import java.util.Scanner;

public class que49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max,min;
        if(a<b)
        {
            min = a;
            max = b;
        }
        else
        {
            min = a;
            max = b;
        }
        System.out.println("factors of "+a+" and "+b+": ");
        for(int i = 1 ; i*i <= min; i++)
        {
            int j = min/i;
            if(i*i == min && max%i == 0)
                System.out.print(i+" ");
            else if(min%i == 0 && max%i == 0 && min%j == 0 && max%j==0)
                System.out.print(i+" "+j+" ");
        }
        sc.close();

    }
}
