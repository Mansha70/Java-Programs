public class que57 {
    public static void main(String[] args) {
        int arr[] = {1,34,653,92749708,45,22,335,2345,0,48927};
        for (int i = 0; i < arr.length; i++) {
            int count =0, temp = arr[i];
            while(temp!=0)
            {
                temp /=10;
                count++;
            }
            System.out.println("number of digits in element "+(i+1)+" of the array is: "+count);
        }
    }
}
