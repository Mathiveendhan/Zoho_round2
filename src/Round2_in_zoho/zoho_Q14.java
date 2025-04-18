package Round2_in_zoho;

import java.util.*;
public class zoho_Q14 {
        public static void f(int[] num, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans, Set<Integer> set, int k, int size, int i){
            if(size==k){
                if(!ans.contains(arr)){
                    ans.add(new ArrayList<>(arr));
                }
            }
            if(i==num.length){
                return;
            }
            arr.add(num[i]);
            set.add(num[i]);
            f(num,arr,ans,set,k,set.size(),i+1);
            arr.clear();
            set.clear();
            f(num,arr,ans,set,k,set.size(),i+1);
        }
        public static void main(String[] args) {
            int[] num={1,2,1,3,4};
            int k=3;
            ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
            ArrayList<Integer> arr=new ArrayList<>();
            Set<Integer> set=new HashSet<>();
            f(num,arr,ans,set,k,set.size(),0);
            for(ArrayList<Integer> q:ans){
                System.out.println(q);
            }
        }
    }
