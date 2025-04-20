import java.util.Scanner;

public class que89{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the checkerboard (N): ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++) { // Rows
            for (int j = 0; j < n; j++) { // Columns
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }
}
