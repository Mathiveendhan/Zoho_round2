public class zoho_Q3 {
  public static void even(int n){
            for(int i=0;i<n/2;i++){
                StringBuilder sb=new StringBuilder("");
                for(int j=0;j<=i;j++){
                    sb.append("* ");
                }
                System.out.println(sb.toString());
                System.out.println(" "+sb.toString());
            }
            for(int x=n/2-1;x>=0;x--){
                StringBuilder s=new StringBuilder("");
                for(int y=x;y>=0;y--){
                    s.append("* ");
                }
                if(x!=((n/2)-1)){
                    System.out.println(" "+s.toString());
                }
                System.out.println(s.toString());
            }

        }
        public static void odd(int n){
            for(int i=0;i<n/2;i++){
                StringBuilder sb=new StringBuilder("");
                for(int j=0;j<=i;j++){
                    sb.append("* ");
                }
                System.out.println(sb.toString());
                System.out.println(" "+sb.toString());
            }
            StringBuilder sbb=new StringBuilder("");
            if(n%2!=0){
                for(int a=0;a<=n/2;a++){
                    sbb.append("* ");
                }
                System.out.println(sbb.toString());
            }
            for(int x=n/2-1;x>=0;x--){
                StringBuilder s=new StringBuilder("");
                for(int y=x;y>=0;y--){
                    s.append("* ");
                }
                System.out.println(" "+s.toString());
                System.out.println(s.toString());
            }
        }
        public static void main(String[] args) {

            int n=4;
            if(n%2!=0){
                odd(n);
            }else{
                even(n);
            }
        }
}
