// Last updated: 8/1/2025, 10:31:11 PM
import java.util.*;

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        Map<Integer, List<Integer>> indexMap = new HashMap<>();

         for (int i = 0; i < n; i++) {
            indexMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> result = new ArrayList<>();

        for (int idx : queries) {
            int num = nums[idx];
            List<Integer> indices = indexMap.get(num);

          if (indices.size() == 1) {
                result.add(-1);
                continue;
            }
            int pos = binarySearch(indices, idx);
            if (pos < 0) {
                pos = -pos - 1; 
            }

            int minDist = Integer.MAX_VALUE;

             if (pos > 0) {
                minDist = Math.min(minDist,cdis(n, idx, indices.get(pos - 1)));
            }

             if (pos < indices.size() - 1) {
                minDist = Math.min(minDist, cdis(n, idx, indices.get(pos + 1)));
            }

            if (pos == 0) {
                minDist = Math.min(minDist, cdis(n, idx, indices.get(indices.size() - 1)));
            }
            if (pos == indices.size() - 1) {
                minDist = Math.min(minDist, cdis(n, idx, indices.get(0)));
            }

            result.add(minDist);
        }

        return result;
    }
private int binarySearch(List<Integer> indices, int target) {
        int left = 0, right = indices.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (indices.get(mid) == target) {
                return mid;
            } else if (indices.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left; // Insertion point
    }
    private int cdis(int n, int x, int y) {
        return Math.min(Math.abs(x - y), n - Math.abs(x - y));
    }
}