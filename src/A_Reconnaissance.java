import java.util.Scanner;

public class A_Reconnaissance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int d=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int i1 =i+1; i1 < n; i1++) {
                if(Math.abs(arr[i1]-arr[i])<=d){
                    count++;
                }
            }
        }
        System.out.println(count*2);
    }
}
