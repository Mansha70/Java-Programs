import java.util.*;

class cubevolume
{
 public static void main(String[] args)
 {
   int side,vol;
   Scanner move;
   move=new Scanner(System.in);
   System.out.print("Enter the value of side : ");
   side=move.nextInt();
   vol=side*side*side;
   System.out.print("The volume of the cube is : "+vol);
 }
}