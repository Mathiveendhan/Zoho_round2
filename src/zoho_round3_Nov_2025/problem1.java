package zoho_round3_Nov_2025;

import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt(); // total amount to withdraw

        int[] denominations = {2000, 500, 200, 100};
        int[] stock = {1, 3, 2, 5};
        int[] used = new int[denominations.length]; // to store how many notes of each denomination used

        int remaining = amount;

        for (int i = 0; i < denominations.length; i++) {
            while (stock[i] > 0 && remaining >= denominations[i]) {
                remaining -= denominations[i];
                stock[i]--;
                used[i]++;
            }
        }

        if (remaining != 0) {
            System.out.println("Not Possible");
        } else {
            // print notes used
            for (int i = 0; i < denominations.length; i++) {
                if (used[i] > 0) {
                    System.out.println(denominations[i] + ":" + used[i]);
                }
            }
        }
    }
}


//✔ Sample Input
//        2700

//✔ Output
//        2000:1
//        500:1
//        200:1