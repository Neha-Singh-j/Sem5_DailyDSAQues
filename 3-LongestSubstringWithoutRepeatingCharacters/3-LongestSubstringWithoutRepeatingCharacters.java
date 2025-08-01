// Last updated: 8/1/2025, 10:43:06 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> set = new HashSet<>();
        int res=0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch=s.charAt(end);
            while (set.contains(ch)) {
                set.remove(s.charAt(start));
               
                start++;
            }                      
            set.add(ch);
            
            res = Math.max(end-start+1, res);
        }

        return res;
        }
    }
