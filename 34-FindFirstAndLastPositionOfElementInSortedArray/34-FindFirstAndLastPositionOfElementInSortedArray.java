// Last updated: 8/1/2025, 10:42:01 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0;

        int j = nums.length - 1;
        int[] arr = { -1, -1 };
        while (i < nums.length) {

            if (nums[i] == target) {
                arr[0] = i;
                break;
            }

            i++;
        }

        while (j >= 0) {
            if (i < j) {
                if (nums[j] == target) {
                    arr[1] = j;
                    break;
                }
            } else {
                if (arr[0] != -1) {
                    arr[1] = arr[0];
                }
            }
            j--;
        }

        return arr;
    }
}