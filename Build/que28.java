import java.util.Scanner;

public class que28 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int max1 =0, max2 =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements int the array: ");
        for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]>max1)
            {
                max2 = max1;
                max1 = arr[i];
            }
        }
       
        System.out.println("2nd largest element:"+max2);
        sc.close();
    }
}
