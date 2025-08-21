package Round2_in_zoho_Aug_2025;

import java.util.*;
public class section_2_2Q {
        public static int rem(int[] ans, int ansIdx, int idx, int[] a, ArrayList<Integer> list) {
            while (idx < a.length) {
                if (!list.contains(a[idx])) {
                    ans[ansIdx] = a[idx];
                    list.add(a[idx]);
                    ansIdx++;
                }
                idx++;
            }
            return ansIdx;
        }

        public static int[] call(int[] arr) {
            int i = 0, j = arr.length - 1;
            while (i < j && i != j) {
                int x = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
                i++;
                j--;
            }
            return arr;
        }

        public static void main(String[] args) {
            int[] a = {9, 6, 3};  // descending
            int[] b = {5, 7, 8};  // ascending

            int[] ans = new int[a.length + b.length];
            ArrayList<Integer> list = new ArrayList<>();

            // Normalize order to ascending
            if (a[0] > a[1]) {
                a = call(a);
            }
            if (b[0] > b[1]) {
                b = call(b);
            }

            int aidx = 0, bidx = 0, ansIdx = 0;

            while (aidx < a.length && bidx < b.length) {
                if (a[aidx] < b[bidx]) {
                    if (!list.contains(a[aidx])) {
                        ans[ansIdx] = a[aidx];
                        list.add(a[aidx]);
                        ansIdx++;
                    }
                    aidx++;
                } else {
                    if (!list.contains(b[bidx])) {
                        ans[ansIdx] = b[bidx];
                        list.add(b[bidx]);
                        ansIdx++;
                    }
                    bidx++;
                }
            }

            if (aidx >= a.length) {
                ansIdx = rem(ans, ansIdx, bidx, b, list);
            }
            if (bidx >= b.length) {
                ansIdx = rem(ans, ansIdx, aidx, a, list);
            }

            for (int i = 0; i < ansIdx; i++) {
                System.out.print(ans[i] + " ");
            }
        }
}






//class Main{
//
//    public static void rem(int[] ans,int ansIdx,int idx,int[] a){
//        while(idx<a.length){
//            ans[ansIdx]=a[idx];
//            idx++;
//        }
//    }
//
//
//    public static int[] call(int[] arr){
//        int i=0,j=arr.length-1;
//        while(i<j && i!=j){
//            int x=arr[i];
//            arr[i]=arr[j];
//            arr[j]=x;
//            i++;
//            j--;
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        int[] a={3,6,9};
//        int[] b={8,7,5};
//        int[] ans=new int[(a.length+b.length)];
//        if(a[0]>a[1]){
//            a=call(a);
//        }
//
//        if(b[0]>b[1]){
//            b=call(b);
//        }
//
//
//        int aidx=0,bidx=0,ansIdx=0;
//        while(aidx<a.length && bidx<b.length){
//            if(a[aidx]<b[bidx]){
//                ans[ansIdx]=a[aidx];
//                ansIdx++;
//                aidx++;
//            }else{
//                ans[ansIdx]=b[bidx];
//                ansIdx++;
//                bidx++;
//            }
//
//            if(aidx>=a.length){
//                rem(ans,ansIdx,bidx,b);
//            }
//            if(bidx>=b.length){
//                rem(ans,ansIdx,aidx,a);
//            }
//        }
//
//
//
//        for(int q:ans){
//            System.out.print(q+" ");
//        }
//
//    }
//}
//

// while(i<j && i<a.length && j<a.length && i!=j){
//     if(a[i]>a[j]){
//         a=call(a);
//         break;
//     }
//     i++;
//     j++;
// }
// i=0;
// j=1;

// while(i<j && i<b.length && j<b.length && i!=j){
//     if(b[i]>b[j]){
//         b=call(b);
//         break;
//     }
//     i++;
//     j++;
// }