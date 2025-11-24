package zoho_round3_Nov_2025;

import java.util.*;
public class problem2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();

        int sum = 0;
        char[] out = new char[s.length()];

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                int n = c - '0';
                sum += n;
                out[i] = (char)('0' + (9 - n));   // digit → (9-digit)
            } else {
                out[i] = (char)(c + 3);           // letter → shift by +3
            }
        }

        // Print reversed
        for(int i=out.length-1;i>=0;i--){
            System.out.print(out[i]);
        }
    }
}

//✔ Sample Input
//a2b5

//✔ Explanation
//a → d
//2 → (9-2)=7
//b → e
//5 → (9-5)=4
//Final string = d7e4 → reversed → 4e7d

//✔ Output
//4e7d

