//        12345
//        23451
//        34512
//        45123
//        51234

package Set1_patterns;
public class pattern_5 {
    public static void main(String[] args) {
        int n=5;
        int[] arr=new int[n];
        int w=0;
        while(w<n){
            arr[w]=w+1;
            w++;
        }
        for(int i=1;i<=n;i++){
            int num=i;
            for(int j=1;j<=n;j++){
                System.out.print(num);
                if((num++)==n){
                    num=1;
                }
            }
            System.out.println();
        }

    }
}
