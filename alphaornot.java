import java.util.*;
class alphaornot
{
 public static void main(String[] args)
 {
   char a;
   int x;
   Scanner move=new Scanner(System.in);
   System.out.print("Enter the character that you want : ");
   a=move.next().charAt(0);
   x=a;
   if((x>=65 && x<=90) || (x>=97 && x<=122))
   {
     System.out.print("The charcter you have typed is an alphabet ");
   }
   else
   {
     System.out.print("The character you have types is not an alphabet");
   }
 }
}