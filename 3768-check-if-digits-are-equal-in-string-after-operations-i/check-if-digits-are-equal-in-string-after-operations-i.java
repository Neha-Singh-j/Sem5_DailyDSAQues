class Solution {
    public boolean hasSameDigits(String s) {
        
        while(s.length()>2){
            StringBuilder curr=new StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int sum=((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10;
                curr.append(sum);
            }
            s=curr.toString();
        }
        if(s.length()==2){
            if(s.charAt(0)==s.charAt(1)) return true;
        }
        return false;
    }
}