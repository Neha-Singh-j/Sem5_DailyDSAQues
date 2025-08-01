// Last updated: 8/1/2025, 10:39:08 PM
class Solution {
    public int majorityElement(int[] nums) {
      return mooreVoting(nums);
        // mooore voting
        
    }
   public static int mooreVoting(int[] arr) {
		int e=arr[0];
        int n=arr.length;
		int v=1;
		for(int i=1;i<n;i++) {
			if(arr[i]==e) {
				v++;
			}
			else {
				v--;
				if(v==0) {
					e=arr[i];
					v=1;
				}
			}
		}
		return e;

   }
}