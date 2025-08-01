// Last updated: 8/1/2025, 10:41:35 PM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        backtrack(nums, 0, res,set);
        return res;    
    }

    private void backtrack(int[] nums, int start, List<List<Integer>> res, HashSet<List<Integer>> set) {
        if (start == nums.length) {
            List<Integer> curr=arrayToList(nums);
            if(!set.contains(curr))
            res.add(curr);
            set.add(curr);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(nums, start + 1, res,set);
            swap(nums, start, i);
        }
    }
    
    private List<Integer> arrayToList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }    
}