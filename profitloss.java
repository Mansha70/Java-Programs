import java.util.*;
class profitloss
{
 public static void main(String[] args)
 {
   Scanner move=new Scanner(System.in);
   int amount,mrp,net;
   System.out.print("Enter the amount of the product : ");
   amount=move.nextInt();
   System.out.print("Enter the mrp of the product : ");
   mrp=move.nextInt();
   net=mrp-amount;
   if (net>0)
   {
     System.out.print("There is profit of "+net);
   }
   else
   {
     System.out.print("There is loss of "+net);
   }
 }
}