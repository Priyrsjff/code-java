import java.util.Scanner;

public class magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d=sc.nextInt();
        int sum =0;
        int Sum=0;
        while(d>0){
            int a =d%10;
           
            sum=sum+a;
            d/=10;

        }
        int b=sum%10;
            
            Sum+=b;
            sum/=10;
        
        
        System.out.println(Sum);
        String c;
        c=(Sum==1)? "It is a magic number":"It is not a magic number" ;
        System.out.println(c);
        sc.close();
    
    }
    
}
