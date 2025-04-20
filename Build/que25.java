public class que25 {
    public static void main(String[] args) {
        int num =153;
        int num2 = num;
        int digits = 0;
        while(num!=0)
        {
            num/=10;
            digits++;
        }
        num = num2;
        int sum =0;
        while(num!=0)
        {
            int temp = num%10;
            sum += Math.pow(temp, digits);
            num/=10;
        }
        num = num2;
        if(num==sum)
            System.out.println("armstrong number");
        else 
            System.out.println("not armstrong");
        

        
    }
    
}
