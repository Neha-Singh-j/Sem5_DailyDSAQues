// Last updated: 8/1/2025, 10:38:37 PM
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
    
        List<List<Integer>> arr=new ArrayList<>();
       
		List<Integer> curr=new ArrayList<>();
		Permutation(k,1,n,curr,arr);
        return arr;
}
	public static  void Permutation(int k,int indx,int amount,List<Integer> curr, List<List<Integer>> arr) {
		if(amount==0 && curr.size()==k) {
			arr.add(new ArrayList<>(curr)); 
			return;
		}
		for(int i=indx;i<=9;i++) {
			if(amount>=i && curr.size()<k) {
                curr.add(i);
				Permutation(k,i+1,amount-i,curr,arr);
             
                 curr.remove(curr.size() - 1);
			}
		}
	}
}