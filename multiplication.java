import java.util.*;

class multiplication
{
  public static void main(String[] args)
  {
    int a,b,c;
    Scanner mul;
    mul= new Scanner(System.in);
    System.out.println("Enter the first number : ");
    a=mul.nextInt();
    System.out.println("Enter the second number : ");
    b=mul.nextInt();
    c=a*b;
    System.out.println("The result of mulitplication is : "+c);
  }
}