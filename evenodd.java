import java.util.*;
class evenodd
{
 public static void main(String[] args)
 {
   int num;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the number that you want to check : ");
   num=move.nextInt();
   if(num%2==0)
   {
     System.out.print("The number you entered is even");
   }
   else
   {
     System.out.print("The number you entered is odd");
   }
 }
}