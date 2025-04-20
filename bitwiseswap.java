import java.util.*;

class bitwiseswap
{
  public static void main(String[] args)
  {
    int a,b;
    Scanner move;
    move=new Scanner(System.in);
    System.out.print("Enter the first value : ");
    a=move.nextInt();
    System.out.print("Enter the second value : ");
    b=move.nextInt();
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("The swapped value of a is : "+a);
    System.out.println("The swapped value of b is : "+b);
  }
}