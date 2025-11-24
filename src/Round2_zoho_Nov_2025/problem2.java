package Round2_zoho_Nov_2025;

import java.util.*;
public class problem2 {

    public static boolean call(String s1, String s2) {
        int r = 0;

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (r >= s2.length() || ch != s2.charAt(r))
                return false;

            while (r < s2.length() && s2.charAt(r) == ch) {
                r++;
            }
        }

        return r == s2.length();
    }

    public static void main(String[] args) {

        // ***** INPUT HERE *****
        String str1 = "abcc";
        String str2 = "aaabcccc";
        // **********************

//        String str1 = "abc";
//        String str2 = "aaabcccc";

        System.out.println(call(str1, str2));
    }
}
