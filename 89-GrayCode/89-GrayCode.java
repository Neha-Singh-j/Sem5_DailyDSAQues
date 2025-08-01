// Last updated: 8/1/2025, 10:40:35 PM
class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        rec(n, arr, "", false);
        return arr;
    }

    public static void rec(int n, ArrayList<Integer> arr, String s, boolean flip) {
        if (n == 0) {
            arr.add(Integer.parseInt(s, 2));
            return;
        }

        if (!flip) {
            rec(n - 1, arr, s + "0", false); // keep order
            rec(n - 1, arr, s + "1", true);  // flip next level
        } else {
            rec(n - 1, arr, s + "1", false); // flip back
            rec(n - 1, arr, s + "0", true);  // keep flipped
        }
    }
}
