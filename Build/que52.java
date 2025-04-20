import java.util.Scanner;

public class que52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        System.out.println("\nMultiplication table for "+num);
        for (int i = 10; i >0; i--)
        {
            System.out.println( num+" x "+i+" = "+(num*i));
        }
        sc.close();
    }
}
