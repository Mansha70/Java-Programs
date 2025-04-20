import java.util.*;
class weeknum
{
 public static void main(String[] args)
 {
   int num;
   Scanner move=new Scanner(System.in);
   System.out.print("Enter the week number that you want to see : ");
   num=move.nextInt();
   if (num==1)
   {
     System.out.print("The Week Day is : Monday");
   }
   else if (num==2)
   {
     System.out.print("The Week Day is : Tuesday");
   }
   else if(num==3)
   {
     System.out.print("The Week Day is : Wednesday");
   }
   else if (num==4)
   {
     System.out.print("The Week Day is : Thrusday");
   }
   else if (num==5)
   {
     System.out.print("The Week Day is : Friday");
   }
   else if (num==6)
   {
     System.out.print("The Week Day is : Saturday");
   }
   else if (num==7)
   {
     System.out.print("The Week Day is : Sunday");
   }
   else
   {
     System.out.print("You have entered wrong number please enter number between 1-7");
   }
 }
}