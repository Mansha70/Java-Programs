import java.util.*;

class checktriangle
{
 public static void main(String[] args)
 {
   int a,b,c;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the sides of triangle : ");
   a=move.nextInt();
   System.out.print("Enter the sides of triangle : ");
   b=move.nextInt();
   System.out.print("Enter the sides of triangle : ");
   c=move.nextInt();
   if (a==b && b==c && c==a)
   {
     System.out.print("Equilateral traingle");
   }
   else if((a==b && a==c) || (a==c && b==c) || (b==c && a==b))
   {
     System.out.print("Isosceles traingle");
   }
   else
   {
     System.out.print("The traingle is scalene traingle");
   }
 }
}