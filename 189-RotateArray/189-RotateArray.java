// Last updated: 8/1/2025, 10:38:56 PM
class Solution {
    public void rotate(int[] nums, int k) {
        Rotate(nums,k);
    }
    public static void Rotate(int[] nums,int k){
        int n=nums.length;
//        starting n-k rever
 k=k%n;
       reverse(nums,0,n-k-1);
//last ke k reverse kro
       reverse(nums,n-k,n-1);
//       all element reverse
       reverse(nums,0,n-1);
        }
	public static void reverse(int[] arr,int i,int j) {
		 
        
		// int j=range;
		while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		}
	}
}