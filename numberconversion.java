import java.util.*;

class numberconversion
{
 public static void main(String[] args)
 {
   int num;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter that number that you want to convert : ");
   num=move.nextInt();
   System.out.print("The converted number is : "+(-num));
 }
}