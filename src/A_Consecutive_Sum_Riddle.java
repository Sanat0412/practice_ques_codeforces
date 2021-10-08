import java.util.Scanner;

public class A_Consecutive_Sum_Riddle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            System.out.println(((n-1)*-1)+" "+n);

        }
    }
}
