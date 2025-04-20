// Find the sum of the elements in a 2D matrix

import java.util.Scanner;

public class que62{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row of a matrix");
        int r = sc.nextInt();
        
        System.out.println("enter column of a matrix");
        int c = sc.nextInt();

        int sum =0;

        int arr[][] = new int[r][c];

        System.out.println("enter elements in the 2-D array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println("sum of elements of the matrix is: "+sum);
        sc.close();
    }
}