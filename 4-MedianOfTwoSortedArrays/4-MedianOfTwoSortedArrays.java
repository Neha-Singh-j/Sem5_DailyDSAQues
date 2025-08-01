// Last updated: 8/1/2025, 10:43:03 PM
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

        // Add remaining elements of nums1, if any
        while (ptr1 < nums1.length) {
            al.add(nums1[ptr1]);
            ptr1++;
        }

        // Add remaining elements of nums2, if any
        while (ptr2 < nums2.length) {
            al.add(nums2[ptr2]);
            ptr2++;
        }

        // Calculating the median
        int n = al.size();
        if (n % 2 == 1) {
            // Odd number of elements
            return al.get(n / 2);
        } else {
            // Even number of elements
            return (al.get(n / 2 - 1) + al.get(n / 2)) / 2.0;
        }
    }
}
