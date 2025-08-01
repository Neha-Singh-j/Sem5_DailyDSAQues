// Last updated: 8/1/2025, 10:36:42 PM
import java.util.*;

class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        double[] ans = new double[n - k + 1];
        
        ArrayList<Integer> curr = new ArrayList<>();
        ArrayList<Integer> copy = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            curr.add(nums[i]);
            insertSorted(copy, nums[i]);
        }

        ans[0] = getMedian(copy, k);
        int j = 1;

        for (int i = k; i < n; i++) {
            int removeVal = nums[i - k];
            curr.remove(Integer.valueOf(removeVal));
            removeSorted(copy, removeVal);  // O(log k) remove

            curr.add(nums[i]);
            insertSorted(copy, nums[i]);     // O(log k) insert

            ans[j++] = getMedian(copy, k);
        }

        return ans;
    }

    private void insertSorted(ArrayList<Integer> list, int val) {
        int idx = Collections.binarySearch(list, val);
        if (idx < 0) idx = -idx - 1;
        list.add(idx, val);
    }

    private void removeSorted(ArrayList<Integer> list, int val) {
        int idx = Collections.binarySearch(list, val);
        if (idx >= 0) {
            list.remove(idx);
        }
    }

    private double getMedian(ArrayList<Integer> list, int k) {
        if (k % 2 == 1) {
            return list.get(k / 2);
        } else {
            return ((double) list.get(k / 2 - 1) + list.get(k / 2)) / 2.0;
        }
    }
}
