import java.util.*;
class max3
{
 public static void main(String[] args)
 {
   int one,two,three;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the first number : ");
   one=move.nextInt();
   System.out.print("Enter the second number : ");
   two=move.nextInt();
   System.out.print("Enter the third number : ");
   three=move.nextInt();
   if (one>two && one>three)
   {
     System.out.print("The greatest among three is : "+one);
   }
   else if (two>one && two>three)
   {
     System.out.print("The greatest among three is : "+two);
   }
   else
   {
     System.out.print("The greatest among three is : "+three);
   }
 }
}