// Last updated: 8/1/2025, 10:35:19 PM
class Solution {
private int[] ans;
private int sum;
 Random rand = new Random();
    public Solution(int[] w) {
       ans=new int[w.length];
     sum=0;
        for(int i=0;i<w.length;i++){
            sum+=w[i];
            ans[i]=sum;
        }
        

    }
    
    public int pickIndex() {
      int target=rand.nextInt(sum) + 1;
        int low=0;
        int high=ans.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(target>ans[mid]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */