package Round2_in_zoho;

public class zoho_Q5 {
    public static void call(int[] arr,int l,int r,int e){
        for(int i=l;i<=r;i++){
            arr[i]=e;
        }
    }
    public static void print(int[] num){
        for(int i:num){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void rCall(int[] arr,int l,int r,int e){
        for(int i=l;i<=r;i++){
            arr[i]=e;
        }
    }
    public static void main(String[] args) {
        int n=6;
        //int[][] grid=new int[(n*2)-1][(n*2)-1];
        int[] arr=new int[(n*2)-1];
        int l=0;
        int r=arr.length-1;
        int e=n;
        for(int i=0;i<=arr.length/2;i++){
            call(arr,l,r,e);
            e--;
            l++;
            r--;
            print(arr);
        }
        l--;
        r++;
        e++;
        while(l>=0 && r<arr.length){
            rCall(arr,l,r,e);
            l--;
            r++;
            print(arr);
            e+=1;
        }

    }
}
