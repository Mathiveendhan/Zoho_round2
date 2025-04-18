package Round2_in_zoho;

public class zoho_Q11 {
    public static void main(String[] args) {
        int[] arr={2,3,4,4,5,6,7};
        int fMax=arr[0];
        int sMax=arr[0];
        for(int i:arr){
            if(fMax<i){
                sMax=fMax;
                fMax=i;
            }
        }
        System.out.println(sMax);
    }
}
