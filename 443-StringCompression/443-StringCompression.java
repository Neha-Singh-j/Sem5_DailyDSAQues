// Last updated: 8/1/2025, 10:36:55 PM
class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 0) return 0;

        ArrayList<Character> arr = new ArrayList<>();
        char prev = chars[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (chars[i] == prev) {
                count++;
            } else {
                arr.add(prev);
                if (count > 1) {
                    // Convert count to characters and add to the array list
                    char[] countChars = Integer.toString(count).toCharArray();
                    for (int k=0;k<countChars.length;k++) {
                        arr.add(countChars[k]);
                    }
                }
                prev = chars[i];
                count = 1;
            }
        }
        arr.add(prev);
        if (count > 1) {
            char[] countChars = Integer.toString(count).toCharArray();
             for (int k=0;k<countChars.length;k++) {
                        arr.add(countChars[k]);
                    }
        }
        for (int i = 0; i < arr.size(); i++) {
            chars[i] = arr.get(i);
        }

        return arr.size();
    }
}
