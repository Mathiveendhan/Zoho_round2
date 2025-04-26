//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15


package Set1_patterns;
public class pattern_1 {
    public static void main(String[] args) {
        int n=5;
        int[] sub=new int[n];
        int q=n;
        int w=0;
        while(q!=0){
            sub[w]=--q;
            w++;
        }
        int num=1;
        for(int i=0;i<n;i++){
            int num2=num;
            for(int j=0;j<=i;j++){
                System.out.print(num2+" ");
                num2+=sub[j];
            }
            System.out.println();
            num++;
        }
    }
}