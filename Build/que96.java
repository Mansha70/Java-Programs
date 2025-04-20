import java.util.Scanner;

public class que96{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int col= scanner.nextInt();
        scanner.close();

        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++) {
                array[i][j] = i*j;
            }
        }

        // Print the array
        System.out.println("Random 2D Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]+" "); // Formatting for alignment
            }
            System.out.println();
        }
    }
}

