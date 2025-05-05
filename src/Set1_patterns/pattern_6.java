//
//        1   3    6    10  15
//        2   5    9    14  19
//        4   8    13   18  22
//        7   12   17   21  24
//        11  16   20   23  25
package Set1_patterns;

public class pattern_6 {
    public static void main(String[] args) {
        int n=5;
        int[][] mat=new int[n][n];
        int c=0;
        for(int i=0;i<n-1;i++){
            c=2+i;
            for(int j=1;j<n;j++){
                if(c==n){
                    mat[i][j]=n;
                }else{
                    mat[i][j]=(c++);
                }
            }
        }
        int element=n;
        for(int q=1;q<n;q++){
            mat[n-1][q]=element--;
        }

        int count=1;
        for(int a=0;a<n;a++){
            count+=a;
            int d=count;
            for(int b=0;b<n;b++){
                count+=mat[a][b];
                System.out.print(count);
                if(count<10){
                    System.out.print("   ");
                }else if(count<100){
                    System.out.print("  ");
                }else{
                    System.out.print(" ");
                }
            }
            count=d;
            System.out.println();
        }
    }
}
