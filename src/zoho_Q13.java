import java.util.*;
public class zoho_Q13 {
    //    public static void main(String[] args) {
//        int[] num={0,2,1,3};
//        ArrayList<Integer> arr=new ArrayList<>();
//        Collections.sort(arr);
//        for(int q:num){
//            arr.add(q);
//        }
//        int n=0;
//        int x=0;
//        for(int i=0;i<num.length;i++){
//            if(!arr.contains(i)){
//                System.out.println("missing element is "+i);
//                x++;
//                break;
//            }
//        }
//        if(x==0){
//            System.out.println("no missing element...");
//        }
//  }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }
        int q = 0;
        for (int j = 0; j < temp.length; j++) {
            if (j == arr.length) {
                System.out.print(j);
                q++;
                break;
            }
            if (arr[j] != temp[j]) {
                System.out.println(temp[j]);
                q++;
                break;
            }
        }
        if (q == 0) {
            System.out.print("No element is missing");
        }
    }
}

