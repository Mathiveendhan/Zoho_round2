package Round2_in_zoho_Aug_2025;

import java.util.*;
public class section_1_1Q {
        public static void call(int i,int j,int[] arr){
            int num=arr[i]-1;
            for(int a=i+1;a<j;a++){
                arr[a]=num;
            }
            for(int b:arr){
                System.out.print(b);
            }
            System.out.println();
        }
        public static void call1(int i,int j,int[] arr){
            int num1=arr[i];
            for(int c=i;c<=j;c++){
                arr[c]=num1;
            }
            for(int r:arr){
                System.out.print(r);
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n+(n-1)];
            for(int q=0;q<arr.length;q++){
                arr[q]=n;
            }
            for(int w:arr){
                System.out.print(w);
            }
            System.out.println();

            int i=0,j=arr.length-1;
            while(i!=j){
                call(i,j,arr);
                i++;
                j--;
            }
            // arr[i]=arr[i]+1;
            // for(int e:arr){
            //     System.out.print(e);
            // }
            // System.out.println();
            i--;
            j++;
            while(i>0 && j<arr.length){
                call1(i,j,arr);
                i--;
                j++;
            }
            int nn=arr[0];
            for(int z=0;z<arr.length;z++){
                arr[z]=nn;
            }

            for(int v:arr){
                System.out.print(v);
            }
        }
}
