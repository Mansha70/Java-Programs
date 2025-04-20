public class que51 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++)
        {
            int c = 1; // First value in a row is always 1
            for (int i = 1; i <= row; i++) 
            {
                System.out.print(c + " ");
                c = c * (row - i) / i; 
                System.out.println(c);
            }
            System.out.println(); 
        }
    }
}
