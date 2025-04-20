import java.util.*;
class voworcon
{
 public static void main(String[] args)
 {
   char ch;
   int x;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the character that you want to check : ");
   ch=move.next().charAt(0);
   x=ch;
   if (x==65||x==69||x==73||x==79||x==85||x==97||x==101||x==105||x==111||x==117)
   {
     System.out.print("The charcater you have typed is a vowel");
   }
   else
   {
     System.out.print("The character you have typed is not a vowel");
   }
 }
}