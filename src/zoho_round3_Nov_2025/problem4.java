package zoho_round3_Nov_2025;

import java.util.*;
public class problem4{
    public static class Pair{
        int a, b;
        Pair(int x,int y){ a=x; b=y; }
    }

    public static void sort(ArrayList<Pair> arr){
        int n=arr.size();
        for(int j=0;j<n;j++){
            for(int i=1;i<n;i++){
                if(arr.get(i-1).a > arr.get(i).a){
                    Pair tmp = arr.get(i);
                    arr.set(i, arr.get(i-1));
                    arr.set(i-1, tmp);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] inp={{1,3},{2,5},{8,10},{9,16}};
        ArrayList<Pair> arr=new ArrayList<>();

        for(int[] q:inp){
            arr.add(new Pair(q[0], q[1]));
        }

        sort(arr);

        for(int i=1;i<arr.size();i++){
            if(arr.get(i).a < arr.get(i-1).b){
                arr.get(i-1).b = Math.max(arr.get(i).b, arr.get(i-1).b);
                arr.remove(i);
                i--;
            }
        }

        for(Pair p : arr){
            System.out.println(p.a + " " + p.b);
        }
    }
}

//✔ Input (hard-coded)
//{{1,3},{2,5},{8,10},{9,16}}

//✔ Output
//(1 5),(8 16)

