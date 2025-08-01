// Last updated: 8/1/2025, 10:32:59 PM
import java.util.*;

class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long lo = -10000000000L, hi = 10000000000L;

        while (lo < hi) { // Fix 1: use < not <= to prevent infinite loop
            long mid = lo + (hi - lo) / 2; // Fix 2: safer mid formula
            if (count(nums1, nums2, mid) >= k) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo; // Fix 3: don't cast to int
    }

    private long count(int[] nums1, int[] nums2, long target) {
        long c = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                if (target >= 0) c += nums2.length;
            } else if (nums1[i] > 0) {
                int lo = 0, hi = nums2.length - 1;
                while (lo <= hi) {
                    int mid = lo + (hi - lo) / 2;
                    if ((long) nums1[i] * nums2[mid] <= target) { // Fix 4: cast to long
                        lo = mid + 1;
                    } else {
                        hi = mid - 1;
                    }
                }
                c += lo;
            } else {
                int lo = 0, hi = nums2.length - 1;
                while (lo <= hi) {
                    int mid = lo + (hi - lo) / 2;
                    if ((long) nums1[i] * nums2[mid] <= target) {
                        hi = mid - 1;
                    } else {
                        lo = mid + 1;
                    }
                }
                c += nums2.length - lo; // Fix 5: not nums2.length - 1
            }
        }
        return c;
    }
}
