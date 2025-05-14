package src.recursion.mazeProblems;

import java.util.ArrayList;
import java.util.List;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean [][]maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println(printDirectionsWithoutObstacle("",0,0,maze));
    }

    private static List<String> printDirectionsWithoutObstacle(String p, int row, int col, boolean[][] maze) {
        if(row== maze.length-1 && col==maze[0].length-1){
            List<String>array=new ArrayList<>();
            array.add(p);
            return array;
        }
        List<String>ans=new ArrayList<>();
        if(row< maze.length-1 &&col<maze[0].length-1&& maze[row][col]){
            ans.addAll(printDirectionsWithoutObstacle(p+"D",row+1,col+1,maze));
        }
        if(row< maze.length-1 && maze[row][col]){
            ans.addAll(printDirectionsWithoutObstacle(p+"V",row+1,col,maze));
        }
        if(col< maze[0].length-1 && maze[row][col]){
            ans.addAll(printDirectionsWithoutObstacle(p+"H",row,col+1,maze));
        }
        return ans;
    }
}
