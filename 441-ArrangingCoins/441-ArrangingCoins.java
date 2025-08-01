// Last updated: 8/1/2025, 10:37:01 PM
class Solution {
    public int arrangeCoins(int n) {
        return check( n);
    }
    public static int check(int n){
	int l=0;
	int hi=n;
	int ans=0;
	while(l<=hi) {
	long mid=(l)+(hi-l)/2;
	if(n==(long)mid*(mid+1)/2) {
		
        return (int)mid;

	}else if(n>(long)mid*(mid+1)/2){
                l=(int)mid+1;
    }
    else {
		hi=(int)mid-1;

	}
  
}
return (int)(hi);
}

    
}