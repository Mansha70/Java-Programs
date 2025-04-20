import java.util.Scanner;

public class que68_69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n =  sc.nextInt();
        int arr[] = new int[n];
        int l = 0, s=Integer.MAX_VALUE;
        System.out.println("enter element in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > l)
                l = arr[i];
            if(arr[i]<s)
                s = arr[i];
        }
        System.out.println("largest element: "+l+" and smallest element: "+s);
    }
}
