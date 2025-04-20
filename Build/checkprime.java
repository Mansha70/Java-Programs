import java.util.*;

public class checkprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a prime: ");
        int m = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i * i <= m; i++) {
            if (m % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && m > 1) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
        sc.close();
    }
}