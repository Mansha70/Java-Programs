import java.util.*;

class eqlipsearea
{
  public static void main(String[] args)
  {
    int a,b;
    float major,minor,area;
    Scanner move;
    move=new Scanner(System.in);
    System.out.print("Enter the length of first line : ");
    a=move.nextInt();
    System.out.print("Enter the length of second line : ");
    b=move.nextInt();
    major=a/2;
    minor=b/2;
    area=3.14f*major*minor;
    System.out.print("The area of eqlipse is : "+area);
  }
}