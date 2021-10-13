import java.util.Scanner;

public class A_Elections {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int xx = Math.max(a, b);
            int yy= Math.max(a, c);
            int zz= Math.max(b, c);

            if (a > zz) {
                System.out.print("0 ");
            } else {
                System.out.print((zz - a + 1) + " ");
            }

            if (b > yy) {
                System.out.print("0 ");
            } else {
                System.out.print((yy - b + 1) + " ");
            }

            if (c > xx) {
                System.out.print("0\n");
            } else {
                System.out.print((xx - c + 1) + "\n");
            }
        }
    }
}
