import java.util.*;

class sumfirstlast
{
  public static void main(String[] args)
   {
     int num,first,last,add;
     Scanner r;
     r=new Scanner(System.in);
     System.out.print("Enter the number that you want : ");
     num=r.nextInt();
     last=num%10;
     num=num/10;
     num=num/10;
     first=num/10;
     add=first+last;
     System.out.println("The sum of first and last numbers is :"+add);
   }
}