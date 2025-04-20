import java.util.*;
class electricity
{
 public static void main(String[] args)
 {
   int unit;
   double total=0,tax;
   Scanner move=new Scanner(System.in);
   System.out.print("Enter the total unit consumed ");
   unit=move.nextInt();
   if(unit<=50)
   {
     total=unit*(0.50);
   }
   else if(unit<=150 && unit>50)
   {
     total=0.75*unit;
   }
   else if(unit<=250 && unit>150)
   {
     total=1.20*unit;
   }
   else if(unit>250)
   {
     total=1.50f*unit;
     tax=(20/100)*total;
     total=total+tax;
   }
   System.out.print("Your Total tax is : "+total);
   
 }
}