// Last updated: 8/1/2025, 10:34:02 PM
import java.util.ArrayList;

class Solution {
    public int maximumTop(int[] nums, int k) {
        if (nums.length == 1) {
            return (k % 2 == 1) ? -1 : nums[0];
        }

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }

        while (arr.size() != 0 && k > 1) {
            arr2.add(arr.get(0));
            arr.remove(0);
            k--;
        }

        int max = -1;
        for (int value : arr2) {
            max = Math.max(value, max);
        }

        if (k == 0 && !arr.isEmpty()) {
            max = Math.max(arr.get(0), max);
        } else if (k == 1 && arr.size() > 1) {
            max = Math.max(arr.get(1), max);
        }

        return max;
    }
}
