import java.util.*;
class sidetrianglecheck
{
 public static void main(String[] args)
 {
   int first,second,third;
   Scanner move;
   move= new Scanner(System.in);
   System.out.print("Enter the first side of triangle : ");
   first=move.nextInt();
   System.out.print("Enter the second side of triangle : ");
   second=move.nextInt();
   System.out.print("Enter the third side of triangle : ");
   third=move.nextInt();
   if((first+second>third) || (second+third>first) || (third+first>second))
   {
     System.out.print("These are the sides of a triangle ");
   }
   else
   {
     System.out.print("These are not sides of a traingle");
   }
 }
}