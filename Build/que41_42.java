import java.util.Scanner;

public class que41_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num: ");
        int num = sc.nextInt();
        int i =0;
        while(num!= 0)
        {
            if(i%2 != 0)
                System.out.println("even place number: "+num%10+" ");
            else
                System.out.println("odd place number: "+num%10+" ");
            i++;
            num /= 10;
        }
        sc.close();
    }
}
