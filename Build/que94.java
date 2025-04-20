import java.util.Scanner;

public class que94{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int count = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit != 0) {
                count++; 
            }
            num /= 10;
        }

        System.out.println("Number of non-zero digits: " + count);
    }
}
