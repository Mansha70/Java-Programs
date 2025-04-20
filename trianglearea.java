import java.util.*;

class trianglearea
{
  public static void main(String[] args)
  {
    int height,base;
    float area;
    Scanner move;
    move=new Scanner(System.in);
    System.out.print("Enter the base value of triangle : ");
    base=move.nextInt();
    System.out.print("Enter the height value of triangle : ");
    height=move.nextInt();
    area=0.5f*base*height;
    System.out.println("The area of traingle is : "+area);
  }
}