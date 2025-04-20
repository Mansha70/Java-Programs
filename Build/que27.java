import java.util.Scanner;

public class que27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int even =0, odd= 0;
        System.out.println("enter elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
            if(arr[i]%2 == 0)
                even+=arr[i];
            else
                odd+=arr[i];
        }
        System.out.println("sum of odd number of the array is: "+odd+" and even numbers of array is: "+even);
        sc.close();
    }
}
