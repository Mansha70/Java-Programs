import java.util.Scanner;

public class que65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n = sc.nextInt();
        int num = n*n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
        sc.close();
    }
}

