// Last updated: 8/1/2025, 10:31:52 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                arr.add(i);
            }
        }
        return arr;
    }
}
