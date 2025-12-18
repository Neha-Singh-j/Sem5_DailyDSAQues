import java.util.ArrayList;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        int ptr1 = 0;
        int ptr2 = 0;

        // Merging two sorted arrays
        while (ptr1 < nums1.length && ptr2 < nums2.length) {
            if (nums1[ptr1] < nums2[ptr2]) {
                al.add(nums1[ptr1]);
                ptr1++;
            } else {
                al.add(nums2[ptr2]);
                ptr2++;
            }
        }

        while (ptr1 < nums1.length) {
            al.add(nums1[ptr1]);
            ptr1++;
        }

        while (ptr2 < nums2.length) {
            al.add(nums2[ptr2]);
            ptr2++;
        }

        int n = al.size();
        if (n % 2 == 1) {
             return al.get(n / 2);
        } else {
            return (al.get(n / 2 - 1) + al.get(n / 2)) / 2.0;
        }
    } 
}
