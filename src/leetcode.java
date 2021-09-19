class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int s=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].charAt(1)=='-'){
                s-=1;
            }
            else if (operations[i].charAt(1)=='+'){
                s+=1;
            }
        }
        return s;
    }
}
