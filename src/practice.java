import java.util.*;
public class practice{
    static class Solution {
        public int[] maxSubsequence(int[] nums, int k) {
            int n=nums.length;
            HashMap<Integer,Integer> mp=new HashMap<>();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=nums[i];
            }
            Arrays.sort(arr);
            int[] temp=new int[k];
            int j=n-1;
            for (int i = n-k; i < n; i++) {
                if(mp.containsKey(arr[i])==true){
                    mp.put(arr[i],mp.get(arr[i])+1);
                }
                else{
                    mp.put(arr[i],1);
                }
            }
            int pk=0;
            for(int i: nums){
                if(mp.containsKey(i)){
                    temp[pk++]=i;
                    if(mp.get(i)==1){
                        mp.remove(i);
                    }
                    else{
                        mp.put(i,mp.get(i)-1);
                    }
                }
            }
            return temp;

        }
    }
    public static void main(String[] args) {
        Solution s= new Solution();
        int [] maxi= {2,1,3,3};
        int[] ans= s.maxSubsequence(maxi,2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]+" ");
        }
        System.out.println();

    }
}