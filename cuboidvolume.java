import java.util.*;

class cuboidvolume
{
 public static void main(String[] args)
 {
   int length,breadth,height,vol;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the value of length of cuboid : ");
   length = move.nextInt();
   System.out.print("Enter the breadth of cuboid : ");
   breadth=move.nextInt();
   System.out.print("Enter the height of cuboid : ");
   height=move.nextInt();
   vol=length*height*breadth;
   System.out.print("The volume of cuboid is : "+vol);
 }
}