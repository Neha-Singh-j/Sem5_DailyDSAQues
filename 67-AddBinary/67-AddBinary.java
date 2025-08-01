// Last updated: 8/1/2025, 10:41:06 PM
class Solution {
    public String addBinary(String a, String b) {
        StringBuffer finalRes=new StringBuffer();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0||j>=0|| carry!=0){
           int res=carry;
            if(i>=0){
                res+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                res+=b.charAt(j)-'0';
                j--;
            }
            finalRes.append(res%2);
            carry=res/2;

            

        }
        return finalRes.reverse().toString();
    }
}