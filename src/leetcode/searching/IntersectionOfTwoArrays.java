package src.leetcode.searching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int []nums1={4,9,5};
        int []nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
        public static int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> myAns = new HashSet<>();
            if(nums1.length>nums2.length){
                for(int num:nums2){
                    boolean ans=binarySearch(num,nums1);
                    if(ans){
                        myAns.add(num);
                    }
                }
            }
            else{
                for(int num:nums1){
                    boolean ans=binarySearch(num,nums2);
                    if(ans){
                        myAns.add(num);
                    }
                }
            }
            Integer [] myArray = myAns.toArray(new Integer[0]);
            int[] intArray = java.util.Arrays.stream(myArray)
                    .mapToInt(Integer::intValue)
                    .toArray();
            return intArray;
        }

        public static boolean binarySearch(int target, int[] arr){
            int start=0;
            int end=arr.length-1;
            Arrays.sort(arr);
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target){
                    return true;
                }
                if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return false;
        }
    }

