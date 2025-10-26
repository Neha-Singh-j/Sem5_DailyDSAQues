// Last updated: 10/26/2025, 10:04:48 PM
class Solution {
    public String majorityFrequencyGroup(String s) {
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char c : s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        
        HashMap<Integer, List<Character>> map2 = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            int frq = entry.getValue();
            char ch = entry.getKey();
            if (!map2.containsKey(frq)) {
                map2.put(frq, new ArrayList<>());
            }
            map2.get(frq).add(ch);
        }

        int maxS = 0; //max size
        int maxf = 0; // max freq
        List<Character> res = new ArrayList<>();

        for (Map.Entry<Integer, List<Character>> entry : map2.entrySet()) {
            int frq = entry.getKey();
            List<Character> chars = entry.getValue();
            int size = chars.size();

            if (size > maxS || (size == maxS && frq > maxf)) {
                maxS = size;
                maxf = frq;
                res = chars;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : res) {
           sb.append(c);
        }

        return sb.toString();
    }
}