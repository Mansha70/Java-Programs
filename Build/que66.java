import java.util.Scanner;

//11 -> 5
//2,4,6,8,10
public class que66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value n: ");
        int n = sc.nextInt();
        int sum =n*(n+1);

        System.out.println("sum of n even natural number: "+sum);
        sc.close();
    }
}
