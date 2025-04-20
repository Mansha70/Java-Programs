import java.util.*;

class reverse
{
 
   public static void main(String[] args)
   {
      int num,rev=1,rem;
      Scanner reverse;
      reverse=new Scanner(System.in);
      System.out.print("Enter your four digit number : ");
      num=reverse.nextInt();
      rem=num%10;
      rev=rem*10;
      num=num/10;
      rem=num%10;
      rev=(rev+rem)*10;
      num=num/10;
      rem=num%10;
      rev=(rev+rem)*10;
      num=num/10;
      rem=num%10;
      rev=rev+rem;
      System.out.print("The reverse of the digit is : "+rev);
   }
 
}