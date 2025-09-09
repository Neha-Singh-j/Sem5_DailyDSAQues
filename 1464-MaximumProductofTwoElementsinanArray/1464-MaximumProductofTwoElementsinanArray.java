// Last updated: 9/9/2025, 4:47:04 PM
class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i :nums){
            pq.add(i);
        }
        return (pq.poll()-1)*(pq.poll()-1);
    }
}