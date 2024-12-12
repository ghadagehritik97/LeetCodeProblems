package src.binarySearchOn1DArray;
//https://leetcode.com/problems/minimum-common-value/
public class FindCommonInTwoArrays {
//    [1,2,3,6], nums2 = [2,3,4,5]
public static void main(String[] args) {
    int []nums1={1,2};
    int []nums2={2,4};

    System.out.println(findCommon(nums1,nums2));
}

    private static int findCommon(int[] nums1, int[] nums2) {

        if(nums1[0] > nums2[nums2.length-1]) return -1;
        if(nums2[0] > nums1[nums1.length-1]) return -1;
        int start1=0;
        int start2=0;
        int end1=nums1.length;
        int end2= nums2.length;
        while(start1<end1 && start2<end2){

            if(nums1[start1]==nums2[start2]){
                return nums1[start1];
            }
            else if(nums1[start1]>nums2[start2]){
                start2++;
            }
            else{
                start1++;
            }
        }

        return -1;
    }
}
