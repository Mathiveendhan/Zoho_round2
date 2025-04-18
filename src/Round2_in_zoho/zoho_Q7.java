package Round2_in_zoho;

class zoho_Q7 {
    //find the len of the grid
    public static void main(String[] args) {
        String str="packets";
        int len=str.length();
        int g=0;
        for(int i=0;i<=str.length()/2;i++){
            if(((i*3)-2)<=len){
                g=(i*3)-2;
            }
        }
        if(g!=str.length()){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }
    }

}

//print the pattern

//public class Main {
//    public static void main(String[] args) {
//        String str = "zohocorporationteam";
//        int g = 7; // Given g = 3
//
//        // Initialize a g x g matrix
//        char[][] matrix = new char[g][g];
//        int q = 0;
//
//        // Fill the first row with characters from the string
//        for (int i = 0; i < g; i++) {
//            matrix[0][i] = str.charAt(i);
//            q++;
//        }
//
//        // Fill the diagonal from top-right to bottom-left
//        int r = 1; // Start from second row to fill diagonal
//        int c = g - 2; // Start from second last column to fill diagonal
//        while (r < g - 1 && c > 0) {
//            matrix[r][c] = str.charAt(q);
//            q++;
//            r++;
//            c--;
//        }
//
//        // Fill the last row with characters from the string
//        for (int j = 0; j < g; j++) {
//            matrix[g - 1][j] = str.charAt(q);
//            q++;
//        }
//
//        // Print the Z pattern
//        for (int a = 0; a < g; a++) {
//            for (int b = 0; b < g; b++) {
//                if (matrix[a][b] != 0) {
//                    System.out.print(matrix[a][b]);
//                } else {
//                    System.out.print(" "); // Print space for unfilled positions
//                }
//            }
//            System.out.println();
//        }
//    }
//}













//overall code,but it has some issue


//public class zoho_Q7{
//    public static int g=0;
//    public static boolean check(String str){
//
//        int len=str.length();
//        int g=0;
//        for(int i=0;i<=str.length()/2;i++){
//            if(((i*3)-2)<=len){
//                g=(i*3)-2;
//            }
//        }
//        return g == str.length();
//    }
//        public static void main(String[] args) {
//            String str="zohocorporationteam";
//            if(check(str)){
//
//                char[][] matrix=new char[g][g];
//                int q=0;
//                for(int i=0;i<g;i++){
//                    matrix[0][i]=str.charAt(q);
//                    q++;
//                }
//                int c=(g-1)-1;
//                int r=1;
//                //q++;
//                while(r<g && c>=0){
//                    matrix[r][c]=str.charAt(q);
//                    q++;
//                    r++;
//                    c--;
//                }
//                for(int j=0;j<g;j++){
//                    matrix[g-1][j]=str.charAt(q);
//                    q++;
//                }
//
//                for(int a=0;a<g;a++){
//                    for(int b=0;b<g;b++){
//                        System.out.println(matrix[a][b]);
//                    }
//                    System.out.println();
//                }
//            }
//        }
//
//    }
