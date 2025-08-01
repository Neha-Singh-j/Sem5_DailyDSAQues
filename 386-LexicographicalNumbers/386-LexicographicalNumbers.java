// Last updated: 8/1/2025, 10:37:23 PM
class Solution {
    public List<Integer> lexicalOrder(int n) {
   int curr=0;
		List<Integer> arr=new ArrayList<>();
		print(n,curr,arr);
		
		return arr;
	}
	public static void print(int n,int curr , List<Integer> arr) {
		if(curr>n) {
			return ;
		}
        if(curr!=0){
		arr.add(curr);
        }
		int i=0;
		if(curr==0) {
			i=1;
		}
		for( ;i<=9;i++) {
			print(n,curr*10+i,arr);
		}
        
	}

}
