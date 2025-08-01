// Last updated: 8/1/2025, 10:32:18 PM
class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] res={-1,-1};
        ArrayList<Integer> arr=new ArrayList<>();
       
        int[] prime=PrimeSieve(right);
        int i= Math.max(left, 2);
        while(i<=right){
            if(prime[i]==0){
                arr.add(i);
            }
            i++;
        }
        int min=Integer.MAX_VALUE;
       for(i=0;i<arr.size()-1;i++){
                    if(min>arr.get(i+1)-arr.get(i)){
                    min=arr.get(i+1)-arr.get(i);
                    res[0]=arr.get(i);
                    res[1]=arr.get(i+1);
                }
            }
        
        // System.out.print(arr);
        return res;
    }
    public static int[] PrimeSieve(int n) {
		int[] ans=new int[n+1];
         Arrays.fill(ans, 0);
		ans[0]=ans[1]=1;
		for(int i=2;i*i<=ans.length;i++) {
			if(ans[i]==0) { // i is prime here and its factor 
				for(int j=2;i*j<ans.length;j++) {
					ans[i*j]=1;
				}
			}
		}
		
		return ans;
	}

}