//    1          5
//       2    4
//          3
//        2   4
//    1          5

package Set1_patterns;
public class pattern_4 {
    public static void call(int l,int r,boolean[] vis,int[] num,int n){
        for(int i=0;i<n;i++){
            if(vis[i]){
                System.out.print(num[i]);
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=5;
        int[] num=new int[n];
        int w=1;
        while(w<=n){
            num[w-1]=w;
            w++;
        }
        boolean[] vis=new boolean[n];
        int l=0;
        int r=n-1;
        for(int i=0;i<=n/2;i++){
            vis[l]=true;
            vis[r]=true;
            call(l,r,vis,num,n);
            vis[l]=false;
            vis[r]=false;
            l++;
            r--;
        }
        l-=2;
        r+=2;
        for(int j=(n/2)-1;j>=0;j--){
            vis[l]=true;
            vis[r]=true;
            call(l,r,vis,num,n);
            vis[l]=false;
            vis[r]=false;
            l--;
            r++;
        }
    }
}
