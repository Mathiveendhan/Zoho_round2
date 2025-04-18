package Round2_in_zoho;

import java.util.*;

public class zoho_Q10 {

        public static void main(String[] args) {
            int[] arr={1,1,0,0,1,0,1,0,1,1,1,1};
            ArrayList<Integer> zero=new ArrayList<>();
            ArrayList<Integer> one=new ArrayList<>();
            int z=1;
            int o=1;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]==0 && arr[i+1]==0){
                    z++;
                    if(i+1==arr.length-1){
                        zero.add(z);
                    }
                }else if(z!=1 && arr[i]==1){
                    zero.add(z);
                    z=1;
                }
            }

            for(int j=0;j<arr.length-1;j++){
                if(arr[j]==1 && arr[j+1]==1){
                    o++;
                    if(j+1==arr.length-1){
                        one.add(o);
                    }
                }else if(o!=1 && arr[j]==0){
                    one.add(o);
                    o=1;
                }
            }
            System.out.print(Math.max(Collections.max(zero),Collections.max(one)));
        }
}
