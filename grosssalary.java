import java.util.*;

class grosssalary
{
 public static void main(String[] args)
 {
   int basic;
   double total;
   Scanner move = new Scanner(System.in);
   System.out.print("Enter the basic income : ");
   basic=move.nextInt();
   if (basic<=10000)
   {
     total=basic + (basic*(20/100)) + (basic*(80/100));
     System.out.print("The gross salary of the employee is : "+total);
   }
   else if(basic>10000 && basic<=20000)
   {
     total=basic + (basic*(25/100)) + (basic*(90/100));
     System.out.print("The gross salary of the employee is : "+total);
   }
   else if (basic>20000)
   {
     total=basic + (basic*(30/100)) + (basic*(90/100));
     System.out.print("The gross salary of the employee is : "+total);
   }
 }
}