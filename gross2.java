import java.util.*;

class gross2
{
 public static void main(String[] args)
 {
   int basic;
   double gross;
   Scanner move= new Scanner(System.in);
   System.out.print("Enter the basic salary : ");
   basic=move.nextInt();
   if (basic<1500)
   {
     gross=basic+(basic*0.1)+(basic*0.9);
   }
   else
   {
     gross=basic+500+(basic*0.98);
   }
   System.out.print("The gross salary is : "+gross);
 }
}