// Last updated: 8/1/2025, 10:38:58 PM
public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String substring = s.substring(i, i + 10);
            if (seen.contains(substring)) {
                repeated.add(substring);
            } else {
                seen.add(substring);
            }
        }
        result.addAll(repeated);
        return result;
    }
}