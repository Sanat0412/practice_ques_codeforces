import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C_Minimum_Extraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> arr=new
                    ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
           int  presum= arr.get(0);
           int sum=arr.get(0);
            for (int i = 1; i < n; i++) {
                sum=Math.max(sum,arr.get(i)-presum);
                presum+=(arr.get(i)-presum);
            }
            System.out.println(sum);
        }
    }
}
