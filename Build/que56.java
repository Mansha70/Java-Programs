import java.util.Scanner;

public class que56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0;
        do
        {
            i++;
            System.out.println(i+" ");
        }while(i<N);
        sc.close();
    }
}
