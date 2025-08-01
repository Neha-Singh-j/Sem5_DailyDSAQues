// Last updated: 8/1/2025, 10:38:11 PM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        // Initial window
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ans[0] = pq.peek();

        int st = 0;
        int i = 1;
        for (int end = k; end < n; end++) {
            int out = nums[st];
            st++;
            map.put(out, map.get(out) - 1); 

            int in = nums[end];
            pq.add(in);
            map.put(in, map.getOrDefault(in, 0) + 1);

            while (!pq.isEmpty() && map.get(pq.peek()) == 0) {
                pq.poll();
            }

            ans[i] = pq.peek();
            i++;
        }

        return ans;
    }
}
