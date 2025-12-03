class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int st=0;
        int end=0;
        int size=0;
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                size=Math.max(end-st,size);
            }else{
                while(st<=end && s.charAt(st)!=s.charAt(end)){
                    set.remove(s.charAt(st));
                    st++;
                }
                set.remove(s.charAt(st));
                st++;
            }
        }
        return size;
    }
}