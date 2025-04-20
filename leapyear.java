import java.util.*;

class leapyear
{
 public static void main(String[] args)
 {
   int year;
   Scanner move;
   move= new Scanner(System.in);
   System.out.print("Enter the year that you want to check : ");
   year=move.nextInt();
   if (year%4==0 && year%100==0 && year%400==0)
   {
     System.out.print("The year is leap year");
   }
   else
   {
     System.out.print("The year is not a leap year");
   }
 }
}