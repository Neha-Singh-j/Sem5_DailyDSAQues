// Last updated: 8/1/2025, 10:40:55 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
  List<List<Integer>> res=new ArrayList<>();
		
        List<List<Integer>> arr=new ArrayList<>();
       
		List<Integer> curr=new ArrayList<>();
		Permutation(k,1,n,curr,arr);
        return arr;
}
	public static  void Permutation(int k,int indx,int n,List<Integer> curr, List<List<Integer>> arr) {
		if( curr.size()==k) {
			arr.add(new ArrayList<>(curr)); 
			return;
		}
		for(int i=indx;i<=n;i++) {
			if( curr.size()<k) {
                curr.add(i);
				Permutation(k,i+1,n,curr,arr);
             
                 curr.remove(curr.size() - 1);
			}
		}
	}
}