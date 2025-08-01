// Last updated: 8/1/2025, 10:34:30 PM

class Solution {
    public int shipWithinDays(int[] weight, int days) {
		int lo = 0;
		int hi = 0;
		int ans = 0;
		for (int i = 0; i < weight.length; i++) {
			hi = hi + weight[i];
		}
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(weight, days, mid) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] weight, int days, int mid) {
		int ship = 1;
		int capacity = 0;
		int i=0;
		while(i<weight.length) {
			if(capacity+weight[i]<=mid) {
				capacity+=weight[i];
				i++;
			}
			else {
				ship++;
				capacity=0;
			}
			if(ship>days) {
				return false;
			}
			
		}
		return true;
	}
}
