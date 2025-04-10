package src.arrays.leetCode;
// https://leetcode.com/problems/median-of-two-sorted-arrays/description/?envType=problem-list-v2&envId=array
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int []nums1={1,2};
        int [] nums2={3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = mergeArrays(nums1, nums2);
        if (arr.length % 2 == 0) {
            int first = arr[arr.length / 2];
            int sec = arr[(arr.length / 2) - 1];
            return (double) (first + sec) / 2;
        }

        return arr[arr.length / 2];

    }

    private static int[] mergeArrays(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
}


