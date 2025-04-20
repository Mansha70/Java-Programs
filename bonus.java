import java.util.*;

class bonus
{
 public static void main(String[] args)
 {
   int year;
   Scanner move= new Scanner(System.in);
   System.out.print("Enter in which year you joined the compnay : ");
   year=move.nextInt();
   year=2025-year;
   if(year>=3)
   {
     System.out.print("COngratulations you will get a bonus of 2500");
   }
 }
}