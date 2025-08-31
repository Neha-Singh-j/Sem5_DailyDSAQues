// Last updated: 8/31/2025, 4:24:11 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
    ArrayList<Integer> sub = new ArrayList<>();

        for (int num : nums) {
            int idx = binarySearch(sub, num);
            if (idx < sub.size()) {
                sub.set(idx, num); // replace
            } else {
                sub.add(num); // append
            }
        }

        return sub.size();
    }

    private int binarySearch(ArrayList<Integer> sub, int target) {
        int left = 0, right = sub.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sub.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left; 
    }
}
