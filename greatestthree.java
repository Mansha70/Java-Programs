import java.util.*;

class greatestthree
{
 public static void main(String[] args)
 {
   int one,two,three,max;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the first value : ");
   one=move.nextInt();
   System.out.print("Enter the second value : ");
   two=move.nextInt();
   System.out.print("Enter the third value : ");
   three=move.nextInt();
   if (one>two && one>three)
   {
     max=one;
   }
   else if (two>one && two>three)
   {
     max=two;
   }
   else
   {
     max=three;
   }
   System.out.print("The greatest among all is : "+max);
 }
}