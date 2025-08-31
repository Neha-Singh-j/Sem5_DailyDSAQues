// Last updated: 8/31/2025, 4:12:40 PM
class Solution {
    public int getLeastFrequentDigit(int n) {
        
        String s = String.valueOf(n);
        int min = Integer.MAX_VALUE;
        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - '0']++;
        }

        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < min) {
                min = arr[i];
                ans = i;
            }
        }
        return ans;
    }
}
