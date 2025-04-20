import java.util.*;

class circle
{
  public static void main(String[] args)
  {
    double radius;
    double area;
    Scanner rad;
    rad=new Scanner(System.in);
    System.out.print("Enter the radius of circle to find area : ");
    radius=rad.nextInt();
    area=3.14*radius*radius;
    System.out.print("The area of the circle is : "+area);
  }
}