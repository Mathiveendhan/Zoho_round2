package Round2_zoho_Nov_2025;

import java.util.*;
public class problem4{
   public static  void path(int[][] maze,int r,int c,String ans,ArrayList<Integer> ds){
       int n=maze.length;
       int m=maze[0].length;
       if(r==n-1 && c==m-1){
           ds.add(ans.length());
           return;
       }

       if(r>=n || c>=n || maze[r][c]==1) return;

       path(maze,r+1,c,ans+"H",ds);
       path(maze,r,c+1,ans+"V",ds);
   }
    public static void main(String[] args) {
       int[][] maze={{0,0,0,1},{1,0,1,0},{1,1,1,0}};
       ArrayList<Integer> ds=new ArrayList<>();
       path(maze,0,0,"",ds);
       int min=Integer.MAX_VALUE;
       for(int i:ds){
           //System.out.println(i);
           if(min>i){
               min=i;
           }
       }
       if(min==Integer.MAX_VALUE){
           System.out.println(-1);
       }else{
           System.out.println(min);
       }

   }
}

