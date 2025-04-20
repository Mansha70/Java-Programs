// Find the sum of squares of the first N natural numbers

import java.util.Scanner;

public class que23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num: ");
        int n = sc.nextInt();
        int sum = (n*(n+1)*(2*n + 1))/6;
        System.out.println("sum of first "+n+" number is: "+sum);
        sc.close();
    }
}
