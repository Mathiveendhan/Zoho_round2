package zoho_round3_Nov_2025;

import java.util.*;
public class problem1 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int amount=a;

            int[] arr=new int[20];
            int idx=0,z=0;

            int[] denominations={2000,500,200,100};
            int[] stock={1,3,2,5};

            for(int i=0;i<denominations.length;i++) {
                if(stock[i]>0 && amount>=denominations[i]){

                    amount = amount - denominations[i];
                    stock[i]--;

                    arr[idx] = denominations[i];
                    idx++;

                    if(stock[i] > 0 && amount >= denominations[i]){
                        i--;
                    }

                } else if(stock[i]==0 && amount!=0){
                    System.out.print("Not Possible");
                    z = 1;
                    break;
                }
            }

            int l=0, r=0;
            if(z==0){
                while(r<arr.length){
                    if(arr[r]==0) break;
                    if(arr[l] != arr[r]){
                        System.out.println(arr[l] + ":" + (r-l));
                        l = r;
                    }
                    r++;
                }
                System.out.println(arr[l] + ":" + (r-l));
            }
        }
}

//✔ Sample Input
//        2700

//✔ Output
//        2000:1
//        500:1
//        200:1