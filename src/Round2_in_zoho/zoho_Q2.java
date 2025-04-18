package Round2_in_zoho;

class zoho_Q2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int q:arr){
            System.out.print(q);
        }
        System.out.println();

        for(int i=0;i<arr.length-1;i++){
            int f=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=f;
            for(int w:arr){
                System.out.print(w);
            }
            System.out.println();
        }
    }
}