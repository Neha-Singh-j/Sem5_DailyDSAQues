import java.util.*;

class Solution {
    public int tupleSameProduct(int[] nums) {
        int c = 0;
        
        ArrayList<Integer> map = new ArrayList<>();
        ArrayList<Integer> key = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                map.add(nums[i] * nums[j]);
            }
        }
        
        Collections.sort(map); // Sorting was missing
        
        ArrayList<Integer> result = new ArrayList<>();
        int j = 0;

        while (j < map.size()) {
            int count = 1;
            int val = map.get(j);
            j++;

            while (j < map.size() && map.get(j).equals(val)) { // Fixed comparison issue
                count++;
                j++;
            }

            result.add(val);
            result.add(count);
        }

        // Calculate final count
        for (int i = 1; i < result.size(); i += 2) { // Iterate directly on frequency values
            int n = result.get(i);
            c += 8 * n * (n - 1) / 2;
        }
      
        return c;
    }
}
