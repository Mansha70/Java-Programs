import java.util.*;

class smalltobig
{
 public static void main(String[] args)
 {
   char alpha;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter small alphabet that you want to convert : ");
   alpha=move.next().charAt(0);
   System.out.print("The converted character is : "+(char)(alpha-32));
 }
}