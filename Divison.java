import java.util.*;

class Divison
{
  public static void main(String[] args)
   {
     Scanner Divison;
     Divison= new Scanner(System.in);
     int a,b,c;
     System.out.print("Enter the first number : ");
     a=Divison.nextInt();
     System.out.print("Enter the second number : ");
     b=Divison.nextInt();
     c=a/b;
     System.out.println("The reult we get after divison is : "+c);
   }
}