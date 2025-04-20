import java.util.Scanner;

public class que91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.next();
        scanner.close();

        int sum = 0;
        int length = num.length();

        for (int i = 0; i < length; i += 2) { // Checking even indexes
            sum += num.charAt(i) - '0'; // Convert char to int
        }

        System.out.println("Sum of digits at even indexes: " + sum);
    }
}
