// Last updated: 8/1/2025, 10:37:59 PM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
		int hi=n;
		int ans=0;
		while(l<=hi) {
		// int mid=(l+hi)/2;
        int mid=(l+(hi-l)/2);
		if(isBadVersion(mid)) {
			ans=mid;
            hi=mid-1;
		}else {
			l=mid+1;
		}
	}
    return ans;
    }
}