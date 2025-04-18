package Round2_in_zoho;

import java.util.ArrayList;

public class zoho_Q9 {
        public static void main(String[] args) {
            String s1="schoollifeisusefull";
            String s2="schoollongofuselike";
            ArrayList<String> ans=new ArrayList<>();
            int l=-1;
            int r=-1;
            for(int i=0;i<s1.length();i++){
                if(l==-1 && r==-1 && s1.charAt(i)!=s2.charAt(i)){
                    l=i;
                    r=i;
                }else if(l!=-1 && r!=-1 && s1.charAt(i)!=s2.charAt(i)){
                    r=i;
                }else if(l!=-1 && r!=-1 && s1.charAt(i)==s2.charAt(i)){
                    ans.add(s1.substring(l,r+1));
                    ans.add(s2.substring(l,r+1));
                    l=-1;
                    r=-1;
                }
            }

            if(l!=-1 && r!=-1){
                ans.add(s1.substring(l,r+1));
                ans.add(s2.substring(l,r+1));
            }

            for(String s:ans){
                System.out.println(s);
            }

        }
}
