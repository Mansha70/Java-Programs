import java.util.*;

class greatesttwo
{
 public static void main(String[] main)
 {
   int one,two;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the first number that you want : ");
   one=move.nextInt();
   System.out.print("Enter the second number that you want : ");
   two=move.nextInt();
   if(one>two)
   {
     System.out.print("The greatest number is : "+one);
   }
   else
   {
     System.out.print("The greatest number is : "+two);
   }
 }
}