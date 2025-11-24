package Round2_zoho_Nov_2025;

import java.util.*;
public class problem1 {
    public static void main(String[] args) {
       int[] arr={10,5,5,11,14,2,3,5,4,5,2,5};
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int q:arr){
           if(!map.containsKey(q)){
           map.put(q,1);
           }else{
           map.put(q,map.get(q)+1);
           }
       }
       int max=-1;
       for(int i:arr){
           if(i==map.get(i)){
               if(max<i){
                   max=i;
               }
           }
       }
       System.out.println(max);
    }
}
