import java.util.Scanner;

public class B_Odd_Grasshopper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long b=sc.nextLong();
            long a= sc.nextLong();
            if (a % 4 == 0) {
                System.out.println(b);
                            } else {
                if (a % 4 == 1) {
                    if (b % 2 == 0) {
                        System.out.println(b - a);
                    } else {
                        System.out.println(a + b);
                    }
                } else if (a % 4 == 2) {
                    if (b % 2 == 0) {
                        System.out.println(b + 1);
                    } else {
                        System.out.println(b - 1);
                    }
                } else if (a % 4 == 3) {
                    if (b % 2 == 0) {
                        System.out.println(b + 1 + a);
                    } else {
                        System.out.println(b - 1 - a);
                    }
                }
            }  } }}
