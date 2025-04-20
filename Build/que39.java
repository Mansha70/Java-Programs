import java.util.Scanner;

public class que39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i*i <= n; i++)
        {
            if(i*i == n)
                System.out.print(i+" ");
            else if(n%i == 0)
                System.out.print(i+" "+n/i+" ");
        }
        sc.close();
    }
}
