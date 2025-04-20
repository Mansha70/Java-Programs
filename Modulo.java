import java.util.*;

class Modulo
{
  public static void main(String[] args)
  {
    int a,b,c;
    Scanner Modulo;
    Modulo=new Scanner(System.in);
    System.out.println("Enter the first number that you want : ");
    a=Modulo.nextInt();
    System.out.println("Enter second number that you want : ");
    b=Modulo.nextInt();
    c=a%b;
    System.out.println("The Final Result we get is : "+c);
  }
}