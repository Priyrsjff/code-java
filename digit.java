import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc= new Scanner (System.in);
        int d=sc.nextInt();
        int sum =0;
        while(d>0){
            int a =d%10;
           
            sum=sum+a;
            d/=10;

        }
        int Sum=0;
        while(sum>0){
            int b=sum%10;
            
            Sum+=b;
            sum/=10;

        }
        System.out.println(Sum);
        String c;
        c=(Sum==1)? "It is a magic number":"It is not a magic number" ;
        System.out.println(c);
        sc.close();
    }
    
}
