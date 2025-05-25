package Set1_patterns;

public class pattern_8 {
    public static void main(String[] args) {
            int n = 4;
            int x = 1;
            for (int a = 0; a < n; a++) {
                for (int space = n - a - 1; space > 0; space--) {
                    System.out.print(" ");
                }
                for (int i = a; i >= 0; i--) {
                    System.out.print(i);
                }
                for (int j = 1; j <= a; j++) {
                    System.out.print(j);
                }
                System.out.println();
                x += 2;
            }
        }
}
