//                1
//              2 1
//            3 2 1
//          4 3 2 1
//        5 4 3 2 1

package Set1_patterns;

import java.util.ArrayList;

public class pattern_2 {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int x=i;x>0;x--){
                System.out.print(x);
            }
            System.out.println("");
        }
    }
}
