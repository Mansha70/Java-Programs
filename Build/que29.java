import java.util.Scanner;

public class que29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int average =0;
        System.out.println("enter elements in the array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            average+=i;
        }
        average /= arr.length;
        System.out.println("average of the list of array is: "+ average);
        sc.close();
    }
    
}
