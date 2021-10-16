import java.util.Scanner;

public class A_GCD_Sum {
    static long gcd(long a, long b) {
        if (b > a) {
            return gcd(b, a);
        }

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
    static int helper(Long n){
        int sum=0;
        Long temp=n;
        while(temp>0){
            sum+=temp%10;
            temp=temp/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if (gcd(n,helper(n)) != 1) {
                System.out.println(n);;
            } else if (gcd(n + 1,helper(n+1)) != 1) {
                System.out.println(n+1);;
            } else if (gcd(n + 2,helper(n+2)) != 1) {
                System.out.println(n+2);;
            }
        }
    }
}
