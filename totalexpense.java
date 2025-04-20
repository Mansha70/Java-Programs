import java.util.*;

class totalexpense
{
 public static void main(String[] args)
 {
   int item,price;
   double amount;
   Scanner move=new Scanner(System.in);
   System.out.print("Enter the quantity of the item : ");
   item=move.nextInt();
   System.out.print("Enter the price of the item : ");
   price=move.nextInt();
   if (item>100)
   {
     price=price*item;
     amount=price*(10/100);
     System.out.print("The total amouint to be paid is : "+amount);
   }
   else
   {
     price=price*item;
     System.out.print("The total amount to be paid is : "+price);
   }
 }
}