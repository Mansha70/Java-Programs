import java.util.*;
class max2
{
 public static void main(String[] args)
 {
   int one,two;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the first number : ");
   one=move.nextInt();
   System.out.print("Enter the second number : ");
   two=move.nextInt();
   if(one>two)
   {
     System.out.print("The greatest among two number is : "+one);
   }
   else
   {
     System.out.print("The greatest among two number is : "+two);
   }
 }
}