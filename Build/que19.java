import java.util.Scanner;

public class que19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num: ");
        int n = sc.nextInt();
        int first = 1, second = 1;
        System.out.println("fibonacci sequence till "+n+ ":");
        if(n==1)
            System.out.print(1);
        else if(n==2)
            System.out.print(1+" "+1);
        else
        {
            System.out.print(1+" "+1+" ");
            for(int i = 2; i<n; i++)
            {
                int sum = first + second;
                first = second;
                second = sum;
                System.out.print(sum+" ");
            }
        }   
        sc.close();
    }
}   
