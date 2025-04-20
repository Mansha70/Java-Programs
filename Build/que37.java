public class que37 {
    public static void main(String[] args) {
        String str = new String("Sidhaant").toLowerCase();
        int n = str.length();
        int vo =0, con =0;
        for(int i =0; i<n; i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vo++;
            else
                con++;
        }
        System.out.println("vowel in the string: "+vo);
        System.out.println("consonent in the string: "+con);
    }
}
