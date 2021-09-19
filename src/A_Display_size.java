import java.util.Scanner;

public class A_Display_size {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=(int)Math.sqrt(n);
        int a=0,b=0;
        int mi=Integer.MAX_VALUE;
        for (int i = 1; i <=s; i++) {
           if(n%i==0 && mi>Math.abs(i-n/i)){
               mi=Math.abs(i-n/i);
               a=i;
               b=n/i;
           }
        }
        System.out.println(a+" "+b);
    }
}
