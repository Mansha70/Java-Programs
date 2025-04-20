import java.util.*;

class rectanglearea
{
 public static void main(String[] args)
 {
   int len,bre,area;
   Scanner move;
   move = new Scanner(System.in);
   System.out.print("Enter the value of length that you want : ");
   len=move.nextInt();
   System.out.println("Enter the value of breadth that you want : ");
   bre=move.nextInt();
   area=bre*len;
   System.out.print("The area of rectangle is : "+area);
 }
}