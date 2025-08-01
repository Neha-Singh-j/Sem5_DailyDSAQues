// Last updated: 8/1/2025, 10:35:04 PM
class Solution {
    public int[] sortArray(int[] nums) {
        return sort(nums,0,nums.length-1);
        
     }
     
	public static int[] sort(int[] arr,int si,int ei) {
		//basecase
		if(si==ei) {
			int[] bs=new int[1];
			bs[0]=arr[si];
			return bs;
		}
		int mid=(si+ei)/2;
		int[] a=sort(arr,si,mid);
		int[] b=sort(arr,mid+1,ei);
		return mergeTSArray(a,b);
	}
public static int[] mergeTSArray(int[] arr1,int[] arr2) {
		int n=arr1.length;
		int m=arr2.length;
		int [] ans=new int [n+m];
		int i=0,j=0,k=0;
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				k++;
				i++;
			}else {
				ans[k]=arr2[j];
				k++;
				j++;
			}
			
		}
		while(i<n) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return ans;
		
	}
}