import java.util.*;

class trapezium
{
 public static void main(String[] args)
 {
   int one,two,height;
   float area;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the first parallel side : ");
   one=move.nextInt();
   System.out.print("Enter the second paralle side : ");
   two=move.nextInt();
   System.out.println("Enter the height that you want : ");
   height=move.nextInt();
   area=0.5f*(one+two)*height;
   System.out.print("The area of the trapezium that you want is : "+area);
 }
}