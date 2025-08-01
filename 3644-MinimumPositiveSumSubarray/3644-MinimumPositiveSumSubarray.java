// Last updated: 8/1/2025, 10:31:29 PM
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
       
        int min=-1;
        for(int i=l;i<=r;i++){
            for(int j=0;j<=nums.size()-i;j++){
                int sum=0;
                
                for(int k=j;k<j+i;k++){
                    sum+=nums.get(k);
                
                }
                if(sum>0){
                    if(min==-1|| min>sum){
                        min=sum;
                    }
                }
            }
            
        }
        
            return min;
        
    }
}