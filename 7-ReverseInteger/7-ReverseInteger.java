// Last updated: 8/1/2025, 10:42:59 PM
class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        char[] arr = s.toCharArray();
        
        if (arr[0] != '-') {
            int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        } else {
            int i = 1;
            int j = arr.length - 1;
            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        String s2 = new String(arr);
        try {
            int ans = Integer.parseInt(s2);
            return ans;
        } catch (NumberFormatException e) {
            return 0; // Handle overflow case
        }
    }
}
