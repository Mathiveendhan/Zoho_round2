package zoho_round3_Nov_2025;

import java.util.*;
public class problem3{
    public static void rotate(ArrayList<String> arr){
        String str = arr.remove(0);
        arr.add(str);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int sum=0;
        ArrayList<String> arr=new ArrayList<>();

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                int n = c - '0';
                sum += n;
                arr.add((9-n)+"");
            } else {
                char ch = (char)(c + 3);
                arr.add(ch+"");
            }
        }

        for(int i=0;i<sum;i++){
            rotate(arr);
        }

        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i));
        }
    }
}

//✔ Sample Input
//a2b5

//✔ Explanation  (a+3)=d (9-2)=7  (b+3)=e  (9-5)=4
//Same transformations as Program 2 → d 7 e 4
//sum = 2 + 5 = 7 → rotate 7 times
//Final reversed after rotations → 7d4e

//✔ Output
//7d4e
