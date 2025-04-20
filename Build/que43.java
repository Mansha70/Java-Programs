import java.util.Scanner;

public class que43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row of array:");
        int row = sc.nextInt();
        System.out.println("enter column of array:");
        int col= sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i = 0; i<row; i++ )
        {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<row; i++ )
        {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
