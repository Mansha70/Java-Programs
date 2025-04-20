import java.util.Scanner;

public class que22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a range to finf prime number");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++)
        {
            if(isPrime(i)==true)
                System.out.println(i+" ");
        }
        sc.close();
    }

    public static boolean isPrime(int n)
    {
        if(n == 1)
            return false;
        for(int i =2 ; i*i<=n; i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
