// Last updated: 8/1/2025, 10:37:33 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        return check(num);
    }

    public static boolean check(int n){
int l=1;
		int hi=n;
		int ans=0;
		while(l<=hi) {
		int mid=(l+hi)/2;
        long sq=(long)mid*mid;
		if(sq==n) {
			return true;
			
		}else if(sq>n) {

			hi=mid-1;
		}else{
            l=mid+1;
        }
}
 return false;
}
}