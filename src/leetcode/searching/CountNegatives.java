package src.leetcode.searching;

public class CountNegatives {
    public static void main(String[] args) {
        int [][]matrix={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(matrix));
    }
        public static int countNegatives(int[][] grid) {
            int count=0;
            for(int []row:grid){
                count+=binarySearch(row);
            }
            return count;
        }
        public static int binarySearch(int []arr){

            if(arr.length==0 ||arr[arr.length-1]>0){
                return 0;
            }
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]<0){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return arr.length-start;
        }
    }

