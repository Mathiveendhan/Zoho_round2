//        1
//        2 4
//        3 5 7
//        6 8 10 12
//        9 11 13 15 17

package Set1_patterns;

import java.util.*;
public class pattern_3 {
    public static int call(ArrayList<Integer> arr){
        int i=1;
        while(arr.contains(i)){
            i++;
        }
        return i;
    }
    public static void print(int num,int n,ArrayList<Integer> arr){
        for(int i=0;i<n;i++){
            System.out.print(num+" ");
            arr.add(num);
            num+=2;
        }
    }
    public static void main(String[] args) {
        int n=5;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            int num=call(arr);
            print(num,i,arr);
            System.out.println(" ");
        }
    }
}
