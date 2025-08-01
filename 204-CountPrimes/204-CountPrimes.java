// Last updated: 8/1/2025, 10:38:46 PM
class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        return PrimeSieve(n);
    }
    public static int PrimeSieve(int n) {
		boolean[] ans=new boolean[n];
        for (int i = 2; i < n; i++) {  
           ans[i] = true;  
        } 
		ans[0]=ans[1]=false;
		for(int i=2;i*i<=ans.length;i++) {
			if(ans[i]) { // i is prime here and its factor 
				for(int j=2;i*j<ans.length;j++) {
					ans[i*j]=false;
				}
			}

		}
		int c=0;
		for(int i=0;i<ans.length;i++) {
			if(ans[i]) c++;
		}
		return c;
	}



}