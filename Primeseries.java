import java.util.*;
class TestPrime
{
 int i;
 Scanner sc=new Scanner(System.in);
 public void prime(int el)
 {
  for(i=2;i<el;i++)
  {
    if (el%i==0)
    {
      break;
    }
  }
  if (i==el)
  {
    System.out.println(i);
  }
 }
}
class Primeseries
{
  public static void main(String[] args)
  {
    TestPrime tp=new TestPrime();
    int sp,ep,p;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the start point : ");
    sp=sc.nextInt();
    System.out.print("Enter the end point : ");
    ep=sc.nextInt();
    for(int i=sp;i<=ep;i++)
    {
      tp.prime(i);
    }
  }
}