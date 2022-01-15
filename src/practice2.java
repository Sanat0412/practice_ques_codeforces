import java.util.*;
public class practice2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        int left=0;
            int right=n-1;
            int[] res=new int[n];
            for(int i=0;i<n;i++){
                if(i%2==0){
                    res[i]=arr[left++];
                }
                else{
                    res[i]=arr[right--];
                }
            }
            for(int i:res){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}