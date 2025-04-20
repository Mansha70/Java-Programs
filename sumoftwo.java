import java.util.*;

class sumoftwo
{
  public static void main(String[] args)
  {
    int a,b,sum;
    Scanner point;
    point=new Scanner(System.in);
    System.out.print("Enter the first number that you want : ");
    a=point.nextInt();
    System.out.print("Enter the second number that you want : ");
    b=point.nextInt();
    sum=a+b;
    System.out.print("The sum of two numbers is : "+sum);
  }
}