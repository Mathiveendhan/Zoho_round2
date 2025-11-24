package Round2_zoho_Nov_2025;

public class problem5 {

    public static void print(int count, int element) {
        for (int i = 0; i < count; i++) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 7, 13, 4, 5, 5, 5, 5, 6, 4, 4, 13, 4, 6};

        int arrMax = 0;
        for(int q:arr){
            if(arrMax<q){
                arrMax=q;
            }
        }

        int[] freq = new int[arrMax + 1];

        for (int num : arr) {
            freq[num]++;
        }

        int maxFreq = 0;
        for (int i = 0; i <= arrMax; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }

        for (int i = maxFreq; i > 0; i--) {
            for (int j = 0; j <= arrMax; j++) {
                if (freq[j] == i) {
                    print(i, j);
                }
            }
        }
    }
}

