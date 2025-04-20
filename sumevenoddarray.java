import java.util.*;

class sumevenoddarray
{
  public static void main(String[] args)
  {
    int arr[] = new int[10];
    int i,sumeven=0,sumodd=0;
    Scanner sc=new Scanner(System.in);
    for(i=0;i<10;i++)
    {
      System.out.print("Enter "+i+" array elements :");
      arr[i]=sc.nextInt();
    }
    for(i=0;i<10;i++)
    {
      if(arr[i]%2!=0){
      sumodd+=arr[i];}
      else{
      sumeven+=arr[i];}
    }
    System.out.println("Sum of odd number :"+sumodd);
    System.out.println("Sum of even number :"+sumeven);
  }
}