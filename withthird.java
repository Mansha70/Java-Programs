import java.util.*;

class withthird
{
  public static void main(String[] args)
  {
    int a,b,c;
    Scanner change;
    change=new Scanner(System.in);
    System.out.print("Enter the first Value of a that you want : ");
    a=change.nextInt();
    System.out.print("Enter the value of b : ");
    b=change.nextInt();
    c=a;
    a=b;
    b=c;
    System.out.println("The swapped value of a is : "+a);
    System.out.print("The swapped value of b is : "+b);
  }
}