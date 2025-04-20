public class que38 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int n = arr.length;
        int min = arr[0], max = 0;
        for (int i = 0; i < n; i++)
        {
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("max element: "+ max);
        System.out.println("min element: "+ min);
    }
}
