import java.util.Scanner;

public class que50 {
    public static void main(String[] args) {
        int first = 0, second = 1;
        System.out.println("Enter a value of N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 1 || N == 2)
        {
            System.out.println("sum: 1");
            sc.close();
            return;
        }
        int sum = 1;
        for(int i = 2; i<N;i++)
        {
            int temp = first + second;
            first = second;
            second = temp;
            sum+=temp;
        }
        System.out.println("sum of "+N+" fibonacci numbers is: "+ sum);
        sc.close();
    }
}
