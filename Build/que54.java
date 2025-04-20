public class que54 {
    public static void main(String[] args) {
        String str = new String("1234567890");
        boolean cond = true;
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if(ch < '0' || ch > '9')
                cond = false;
        }
        if(cond == true)
        {
            System.out.println("String has only numbers");
        }
        else
            System.out.println("String contains Character");
    }
}
