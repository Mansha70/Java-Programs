import java.util.Scanner;

public class que67{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value n: ");
        int n = sc.nextInt();
        int sum =n*n;

        System.out.println("sum of n odd natural number: "+sum);
        sc.close();
    }
}

