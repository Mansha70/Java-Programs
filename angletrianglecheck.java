import java.util.*;
class angletrianglecheck
{
 public static void main(String[] args)
 {
   int first,second,third;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the first angle of triangle : ");
   first=move.nextInt();
   System.out.print("Enter the second angle of triangle :");
   second=move.nextInt();
   System.out.print("Enter the third angle of triangle : ");
   third=move.nextInt();
   if (first+second+third==180)
   {
     System.out.print("It is an angle of triangle");
   }
   else
   {
     System.out.print("These are not angle of triangle");
   }
 }
}