import java.util.Scanner;

public class A_Special_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print((i+1)%n+1+" ");
            }
        }
    }
}
