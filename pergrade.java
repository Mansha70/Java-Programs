import java.util.*;

class pergrade
{
 public static void main(String[] args)
 {
   int ph,ch,bio,math,co,total;
   float per;
   Scanner move=new Scanner(System.in);
   System.out.print("Enter the marks of physics : " );
   ph=move.nextInt();
   System.out.print("Enter the marks of chemistry : ");
   ch=move.nextInt();
   System.out.print("Enter the marks of Biology : ");
   bio=move.nextInt();
   System.out.print("Enter the marks of Maths : ");
   math=move.nextInt();
   System.out.print("Enter the marks of computer : ");
   co=move.nextInt();
   total=ph+ch+bio+math+co;
   per=(5/100)*total;
   if (per>90)
   {
     System.out.print("Your Grade is A");
   }
   else if(per>=80 && per<90)
   {
     System.out.print("Your Grade is B");
   }
   else if(per>=70 && per<80)
   {
     System.out.print("Your Grade is C");
   }
   else if(per>=60 && per<70)
   {
     System.out.print("Your Grade is D");
   }
   else if (per>=40 && per<60)
   {
     System.out.print("YOur Grade is E");
   }
   else if(per<40)
   {
     System.out.print("Your Grade is F");
   }
   else
   {
     System.out.print("Sorry you fail and can't be graded");
   }
 }
}