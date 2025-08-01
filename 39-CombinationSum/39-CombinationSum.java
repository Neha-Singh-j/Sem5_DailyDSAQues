// Last updated: 8/1/2025, 10:41:51 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr=new ArrayList<>();
		List<Integer> curr=new ArrayList<>();
		Permutation(candidates,target,curr,arr,0);
        return arr;
}
	public static  void Permutation(int[] coin,int amount,List<Integer> curr, List<List<Integer>> arr,int indx) {
		if(amount==0) {
			arr.add(new ArrayList<>(curr)); 
			return;
		}
		for(int i=indx;i<coin.length;i++) {
			if(amount>=coin[i]) {
                curr.add(coin[i]);
				Permutation(coin,amount-coin[i],curr,arr,i);
                 curr.remove(curr.size() - 1);
			}
		}
	}
}