import java.util.*;

class prime
{
 public static void main(String[] args)
 {
   int num,flag=0;
   Scanner move=new Scanner(System.in);
   System.out.print("Enter the number that you want to check :");
   num=move.nextInt();
   for(int i=2;i<=num/2;i++)
   {
     if(num%i==0)
     {
       flag=1;
       break;
     }
     else
     {
       flag=0;
     }
   }
   if (flag==0)
   {
     System.out.print("The number you have typed is a prime number");
   }
   else
   {
     System.out.print("The number you have typed is not a prime number");
   }
 }
}