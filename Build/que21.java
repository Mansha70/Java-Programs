public class que21 {
    public static void main(String[] args) {
        String name = "SidiS";
        String rev ="";
        for(int i = name.length()-1; i>=0; i--)
        {
            rev += name.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(name))
            System.out.println("the string "+name+" is palindrome");
        else
            System.out.println("not a palindrome string");
    }
}
