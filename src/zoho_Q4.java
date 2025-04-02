 import java.util.*;

class zoho_Q4 {
    public static void main(String[] args) {
        String s = "12345*+-+";

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Character> op = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                arr.add(c - '0');
            } else {
                op.add(c);
            }
        }

        int ans = arr.get(0);
        int j = 0;
        for (int i = 1; i < arr.size(); i++) {
            char operator = op.get(j);

            switch (operator) {
                case '+':
                    ans += arr.get(i);
                    break;
                case '-':
                    ans -= arr.get(i);
                    break;
                case '*':
                    ans *= arr.get(i);
                    break;
                case '/':
                    ans /= arr.get(i);
                    break;
            }

            j++;
        }
        System.out.println(ans);
    }
}

