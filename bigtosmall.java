import java.util.*;

class bigtosmall
{
 public static void main(String[] args)
 {
   char cap;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the capital character to convert it into small : ");
   cap=move.next().charAt(0);
   System.out.print("Your converted charcter is : "+(char)(cap+32));
 }
}