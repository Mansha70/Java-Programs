import java.util.*;

class div511
{
 public static void main(String[] args)
 {
   int num;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the number to check : ");
   num=move.nextInt();
   if (num%5==0 && num%11==0)
   {
     System.out.print("The number is divisible by 11 and 5");
   }
   else
   {
     System.out.print("THe number is not divisible by 11 and 5");
   }
 }
}