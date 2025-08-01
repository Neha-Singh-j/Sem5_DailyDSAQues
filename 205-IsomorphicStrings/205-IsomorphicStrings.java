// Last updated: 8/1/2025, 10:38:44 PM
import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {  
                if (map.get(ch) != t.charAt(i)) return false; 
            } else {
                if (map.containsValue(t.charAt(i))) return false; 
                map.put(ch, t.charAt(i));
            }
        }
        return true;
    }
}
