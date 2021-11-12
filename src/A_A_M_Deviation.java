import java.util.Scanner;

public class A_A_M_Deviation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int x = Math.abs(a + b - 2 * c);
            int y = Math.abs(a + c - 2 * b);
            int z = Math.abs(c + b - 2 * a);
            System.out.println(Math.min(x % 3, Math.min(y % 3, z % 3)));
        }
    }
}
