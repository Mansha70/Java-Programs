import java.util.*;

class ascii
{
  public static void main(String[] args)
  {
    char a;
    int x;
    System.out.println("Enter any character : ");
    Scanner sc =new Scanner(System.in);
    a=sc.next().charAt(0);
    x=a;
    System.out.print(a+"="+x);
  }
}