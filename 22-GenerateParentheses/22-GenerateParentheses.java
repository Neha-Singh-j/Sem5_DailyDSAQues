// Last updated: 8/12/2025, 10:09:25 PM
class Solution {
    public List<String> generateParenthesis(int n) {
     
		List<String> arr=new ArrayList<>();
		Parentheses(n,0,0,"",arr);
		return arr;
	}
	public static void Parentheses(int n, int closed,int open,String ans,List<String> arr) {
		if(open==n && closed==n) {

			arr.add(ans);
			return;
		}
		if(open>n || closed>open) {
			return;
		}
		Parentheses(n,closed,open+1,ans+"(",arr);
		Parentheses(n,closed+1,open,ans+")",arr);
		
	}
	

}
