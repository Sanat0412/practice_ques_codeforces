import java.util.*;
public class A_AB_Balance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int min=arr[0];
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]>min){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}