// Last updated: 8/1/2025, 10:39:27 PM
class Solution {
  public String reverseWords(String s) {
    s=s.trim();
String[] arr=s.split(" +");

		
		StringBuilder ans=new StringBuilder();
        //  ans="";
		for(int i=arr.length-1;i>=0;i--) {
			ans.append(arr[i]).append(" ");
            
		}
        return ans.toString().trim();
  }
}

