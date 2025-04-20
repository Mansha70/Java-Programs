
import java.util.Scanner;

public class que99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        int[] freq = new int[256]; // Array to store character counts (supports ASCII characters)

        // Loop through the string and count occurrences
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Display the result
        System.out.println("Character occurrences:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}
