package src.recursion.mazeProblems;

import java.util.ArrayList;
import java.util.List;

//Straight maze problem
public class StraightMaze {
    public static void main(String[] args) {
        // System.out.println(getStepCount(3,3));
//        System.out.println(printStraightPathOfMaze("",3,3));
        System.out.println(includeAllPaths("",3,3));
    }
    static int getStepCount(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        int right=getStepCount(row, col-1);
        int down=getStepCount(row-1, col);
        return right+down;
    }
    static List<String> printStraightPathOfMaze(String p, int row, int col){
        if(row==1 && col==1){
            List<String>array=new ArrayList<>();
            array.add(p);
            return array;
        }
        List<String>ans=new ArrayList<>();
        if(row>1){
            ans.addAll(printStraightPathOfMaze(p+"D", row-1, col));
        }
        if(col>1){
            ans.addAll(printStraightPathOfMaze(p+"R", row, col-1));
        }
        return ans;
    }
    static List<String>includeAllPaths(String p,int row,int col){
        if(row==1 && col==1){
            List<String>array=new ArrayList<>();
            array.add(p);
            return array;
        }

        List<String>ans=new ArrayList<>();
        if(row >1 && col>1){
            ans.addAll(includeAllPaths(p+"D",row-1,col-1));
        }
        if(row>1){
            ans.addAll(includeAllPaths(p+"V",row-1,col));
        }
        if(col>1){
            ans.addAll(includeAllPaths(p+"H",row,col-1));
        }

        return ans;
    }
    
}
