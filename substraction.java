import java.util.*;
class substraction
{
  public static void main(String[] args)
  {
    int a,b,c;
    Scanner sub;
    sub=new Scanner(System.in);
    System.out.println("Enter the first number : ");
    a=sub.nextInt();
    System.out.println("Enter the second number : ");
    b=sub.nextInt();
    c=a-b;
    System.out.println("Final substracted value is : "+c);
  }
}