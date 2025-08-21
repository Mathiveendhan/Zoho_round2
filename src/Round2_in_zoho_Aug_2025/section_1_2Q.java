package Round2_in_zoho_Aug_2025;

public class section_1_2Q {
        public static void rev(int i,int j,int[] arr){
            while(i<=j && i!=j){
                int x=arr[j];
                arr[j]=arr[i];
                arr[i]=x;
                i++;
                j--;
            }
        }
        public static void main(String[] args) {
            int[] arr={2,1,3,5,8,6,7,9};
            int k=9;
            int i=0,j=k-1;
            // while(k<=((arr.length)-j)){
            while(arr.length>j){
                rev(i,j,arr);
                i=j+1;
                j=j+k;
            }
            if(j>=arr.length){
                rev(i,arr.length-1,arr);
            }
            for(int q:arr){
                System.out.print(q+" ");
            }
        }
    }
