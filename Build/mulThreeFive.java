public class mulThreeFive {
    public static void main(String[] args) {
        System.out.println("number 1 to 100 except multiple of 3 and 5: ");
        for(int i= 0; i<=100;i++)
        {
            if(i%5 == 0 && i%3 == 0)
                continue;
            else
                System.out.println(i+" ");
        }
    }
}
