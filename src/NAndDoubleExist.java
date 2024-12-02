package src;

public class NAndDoubleExist {
    public static void main(String[] args) {
        int []arr={2,3,5,0,9};
        System.out.println(checkIfExist(arr));
    }
        public static boolean checkIfExist(int[] arr) {
            for(int i=0;i<arr.length;i++){
                float t=(float)arr[i]/2;
                int x=search(arr,t);
                if(x!=i && x!=-1)return true;
            }
            return false;
        }
        public  static int search(int []arr,float target){
            for(int i=0;i<arr.length;i++){
                if((float)arr[i]==target){
                    return i;
                }
            }
            return -1;
        }
    }

