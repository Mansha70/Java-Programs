import java.util.*;
class speccheck
{
 public static void main(String[] args)
 {
   char a;
   int x;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the character that you want to check : ");
   a=move.next().charAt(0);
   x=a;
   if((x>=65 && x<=90) || (x>=97 && x<=122))
   {
     System.out.print("The character you have entered is a alphabet");
   }
   else if (x>=30 || x<=39)
   {
     System.out.print("The charcter you have entered is a digit");
   }
   else
   {
     System.out.print("The charcter may be special character");
   }
 }
}