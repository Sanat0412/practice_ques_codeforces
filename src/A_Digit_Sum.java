import java.util.Scanner;

public class A_Digit_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n= sc.nextLong();
            long a=(n+1)/10;
            System.out.println(a);
        }
    }
}
