import java.util.*;

class Arithmatic
{
  public static void main(String[] args)
  {
    int a,b,sum,sub,mul,div,mod;
    Scanner Arith;
    Arith=new Scanner(System.in);
    System.out.print("Enter the first number : ");
    a=Arith.nextInt();
    System.out.println("Enter second number : ");
    b=Arith.nextInt();
    sum=a+b;
    sub=a-b;
    mul=a*b;
    div=a/b;
    mod=a%b;
    System.out.println("The addition of two numbers is : "+sum);
    System.out.println("The Substraction of two numbers is : "+sub);
    System.out.println("The multiplication of two numbers is : "+mul);
    System.out.println("The Divison of two numbers is : "+div);
    System.out.println("The Modulus of two numbers is : "+mod);
  }
}