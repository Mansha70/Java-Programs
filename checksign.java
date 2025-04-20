import java.util.*;
class checksign
{
 public static void main(String[] args)
 {
   int num;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the number that want to check : ");
   num=move.nextInt();
   if(num>0)
   {
     System.out.print("The number is positive");
   }
   else if (num==0)
   {
     System.out.print("The number is zero");
   }
   else
   {
     System.out.print("The number is negative");
   }
 }
}