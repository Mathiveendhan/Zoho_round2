package Round2_in_zoho;

public class zoho_Q12 {
    public static void main(String[] args) {
        String str = "f, $d '  g,dmmd. gdf";
        //String str = "m'a ,d$a  m";
        int l = 0;
        int q = 0;
        int r = str.length() - 1;

        while (l < r) {
            char c = str.charAt(l);
            char d = str.charAt(r);
            if (c == ' ' || c == ',' || c == '$' || c == '.' || c == '\'' ) {
                l++;
            } else if (d == ' ' || d == ',' || d == '$' || d == '.' || d == '\'' ) {
                r--;
            } else if (Character.toLowerCase(c) != Character.toLowerCase(d)) {
                System.out.println("false");
                q++;
                break;
            } else {
                l++;
                r--;
            }
        }

        if (q == 0) {
            System.out.println("True");
        }
    }
}
