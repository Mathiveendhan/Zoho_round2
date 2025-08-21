package Round2_in_zoho_Aug_2025;

import java.util.*;
public class section_2_1Q {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            int i=0,j=0;
            ArrayList<Character> arr=new ArrayList<>();
            arr.add('a');
            arr.add('e');
            arr.add('i');
            arr.add('o');
            arr.add('u');

            String str="";
            // System.out.println(str.length());
            ArrayList<String> ans=new ArrayList<>();
            while(j<s.length()){
                if(arr.contains(s.charAt(j))){
                    if(arr.contains(s.charAt(i))){
                        String q=s.substring(i,j);
                        if(q.length()>=str.length()){
                            str=q;
                            ans.add(q);
                            // String x=str.substring(1,str.length());
                            // System.out.println(x);
                        }
                    }
                    i=j;
                }
                j++;
            }

            for(String w:ans){
                for(int e=1;e<w.length();e++){
                    System.out.print(""+w.charAt(e));
                }
                System.out.println();

            }

            // System.out.println(str.substring(1,str.length()));
        }
}
