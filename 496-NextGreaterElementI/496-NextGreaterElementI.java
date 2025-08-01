// Last updated: 8/1/2025, 10:36:39 PM
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int n = nums2.length;
        int[] nextG = new int[n];
        Map<Integer, Integer> indexMap = new HashMap<>();

         for (int i = 0; i < n; i++) {
            indexMap.put(nums2[i], i);
        }

        
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && nums2[s.peek()] <= nums2[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextG[i] = -1;
            } else {
                nextG[i] = nums2[s.peek()];
            }
            s.push(i);
        }

        
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int index = indexMap.get(nums1[i]);
            res[i] = nextG[index];
        }

        return res;
    }
}
