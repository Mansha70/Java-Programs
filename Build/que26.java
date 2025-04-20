public class que26 {
    public static void main(String[] args) {
        String str = new String("Sidhaant");
        int n = str.length();
        String str2 ="";

        for (int i = n-1; i >=0; i--) {
            char ch = str.charAt(i);
            str2 += ch; 
        }
        
        System.out.println("reversed String: "+ str2);
    }
}
