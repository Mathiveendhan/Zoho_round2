package Round2_in_zoho;

import java.util.*;

class zoho_Q1 {
    static void rev(int[] arr,Stack<Integer> st,int n,int i){
        while(n!=0){
            arr[i]=st.pop();
            i++;
            n--;
        }

    }
    public static void main(String[] args) {
        int[] arr={2,1,3,5,8,6,7,9,4,8};
        int k=3;
        int n=0;
        int count=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
            n++;
            count++;
            if(i==arr.length-1 && n<k){
                rev(arr,st,n,i-(count-1));
            }else if(n==k){
                rev(arr,st,n,i-(k-1));
                count=0;
                n=0;
            }
        }
        for(int j:arr){
            System.out.print(j+" ");
        }
    }
}