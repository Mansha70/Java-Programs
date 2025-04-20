import java.util.Scanner;
public class que87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] matrix = new int[rows][cols];
        int sum = 0;

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] > 0) { // Only sum positive numbers
                    sum += matrix[i][j];
                }
            }
        }
        scanner.close();

        System.out.println("Sum of positive elements: " + sum);
    }
}
