// Last updated: 8/1/2025, 10:40:34 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
        List<List<Integer>> ll=new ArrayList<>();
		sub(nums,new ArrayList<>(),ll,0);
       
        return ll;
	}
    
	public static void sub(int[] ques, List<Integer> ans,List<List<Integer>> ll,int i) {
		 if(i==ques.length) {
            if(!ll.contains(ans)){
			 ll.add(new ArrayList<>(ans));
            }
			 return;
		 }
		 int ch=ques[i];
		 sub(ques,ans,ll,i+1);
         ans.add(ch);
		 sub(ques,ans,ll,i+1); 
         ans.remove(ans.size()-1);
	}
}