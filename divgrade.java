import java.util.*;

class divgrade
{
 public static void main(String[] args)
 {
  Scanner move=new Scanner(System.in);
  int sub,over=0;
  double total;
  for(int i=1;i<=5;i++)
  {
    System.out.print("Enter the subject "+i+" marks : ");
    sub=move.nextInt();
    over=over+sub;
  }
  System.out.print(""+over);
  total=over*(5/100);
  if(total>=60)
  {
    System.out.print("The overall grade is First Divison");
  }
  else if(total>=50 && total<=59)
  {
    System.out.print("The overall grase is Second Divison");
  }
  else if(total>=40 && total<=49)
  {
    System.out.print("The overall grade is Third Divison");
  }
  else
  {
    System.out.print("You failed in Exam");
  }
 }
}