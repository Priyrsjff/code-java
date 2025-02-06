import java.util.Scanner;

public class Fact {
    int f(int a){
        if(a==0){
        return 1;
        }
        else{
    return a*f(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        Fact b = new Fact();
        int result= b.f(a);
        System.out.println(result);
}

    
}
