import java.util.Scanner;
public class que97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        scanner.close();

        // Generate and print the multiplication matrix
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j); // Print with spacing
            }
            System.out.println(); // Move to the next line
        }
    }
}
