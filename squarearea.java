import java.util.*;

class squarearea
{
  public static void main(String[] args)
  {
    int side,area;
    Scanner move;
    move=new Scanner(System.in);
    System.out.print("Enter the value of side : ");
    side=move.nextInt();
    area=side*side;
    System.out.print("Area of square is : "+area); 
  }
}