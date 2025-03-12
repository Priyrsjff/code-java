import java.util.Scanner;

public class Small {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d=a/1000;
        int e=b/100;
        int f=e%10;
        int d1 = c % 10;
        int d2 = (c / 10) % 10;
        int d3 = (c / 100) % 10;
        int d4 = (c / 1000) % 10; 
            int s1 = (d1 < d2) ? (d1 < d3 ? (d1 < d4 ? d1 : d4) : (d3 < d4 ? d3 : d4)) 
            : (d2 < d3 ? (d2 < d4 ? d2 : d4) : (d3 < d4 ? d3 : d4));
        int g=(d*f)+s1;
        System.out.println("the number is"+g);
        sc.close();


    }
}