package src.leetcode.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int []nums1={4,9,5};
        int []nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        // use two pointer approach
        List<Integer>ans=new ArrayList<>();
        int i=0;
        int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        int k=0;
        int []mainAns=new int[ans.size()];
        while(k<ans.size()){
            mainAns[k]=ans.get(k);
            k++;
        }
        return mainAns;
    }

    }

