import java.util.Scanner;

public class A_Kids_Seating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int res=2*n;
            for (int i = 0; i < n; i++) {
                System.out.print(res+" ");
                res+=2;
            }
            System.out.println();
        }
    }
}
