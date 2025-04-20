import java.util.*;

class withoutthird
{
  public static void main(String[] args)
  {
    int a,b;
    Scanner change;
    change = new Scanner(System.in);
    System.out.print("Enter the value of a : ");
    a=change.nextInt();
    System.out.print("Enter the value of b : ");
    b=change.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("The swapped value of a is : "+a);
    System.out.println("The swapped value of b is : "+b);
  }
}
