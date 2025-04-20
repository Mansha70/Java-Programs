import java.util.*;

class parallelogram
{
 public static void main(String[] args)
 {
   int base,height,area;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the base of paralleloram that you want : ");
   base=move.nextInt();
   System.out.print("Enter the height of parallelogram that you want : ");
   height=move.nextInt();
   area=base*height;
   System.out.print("The area of the parallelogram is : "+area);
 }
}