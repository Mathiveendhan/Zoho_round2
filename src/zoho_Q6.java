public class zoho_Q6 {
        public static int call(String s){
            char[] array=s.toCharArray();
            int n=0;
            for(int i=0;i<array.length;i++){
                int d=array[i]-'0';
                n=n*10+d;
            }
            return n;
        }
        public static void main(String[] args) {
            String[] arr = {"1", "15", "35", "4", "202", "18"};
            int[] ans=new int[arr.length];
            int idx=0;
            for(String s:arr){
                ans[idx]=call(s);
                idx++;
            }

            //bubble sorting
            for(int i=0;i<ans.length;i++){
                for(int j=0;j<ans.length-1;j++){
                    if(ans[j]>ans[j+1]){
                        int temp=ans[j];
                        ans[j]=ans[j+1];
                        ans[j+1]=temp;
                    }
                }
            }

            for(int q:ans){
                System.out.print(q+" ");
            }
        }
}
