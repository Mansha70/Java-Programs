import java.util.Scanner;

public class que88{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();
        scanner.close();

        int count = 0;
        for (int i = 1; i * i <= N; i++) { // Check perfect squares
            count++;
        }

        System.out.println("Number of perfect squares up to " + N + ": " + count);
    }
}
