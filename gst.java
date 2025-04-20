import java.util.*;

class gst
{
 public static void main(String[] args)
 {
   float tax,amount,pay,finalpay,sgst,cgst;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the amount of material : ");
   amount=move.nextInt();
   System.out.print("Enter the tax applied on it : ");
   tax=move.nextInt();
   pay=amount*(tax/100);
   finalpay=pay+amount;
   sgst=pay/2;
   cgst=pay/2;
   finalpay=sgst+cgst+amount;
   System.out.print("The amount you have to pay is : "+finalpay);
 }
}