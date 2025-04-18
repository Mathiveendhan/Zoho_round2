package Round2_in_zoho;

import java.util.*;
public class zoho_Q15 {
        public static void f(Set<Character> set,ArrayList<Integer> arr,int i,String str){
            set.clear();
            while(i<str.length()){
                char c=str.charAt(i);
                if(!set.contains(c)){
                    set.add(c);
                    i++;
                }else{
                    break;
                }
            }
            arr.add(set.size());
        }
        public static void main(String[] args) {
            String str="pwwkew";
            //String str="abcabcbb";
            Set<Character> set=new HashSet<>();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<str.length();i++){
                f(set,arr,i,str);
            }
            System.out.println(Collections.max(arr));
        }
}
