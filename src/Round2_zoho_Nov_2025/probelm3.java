package Round2_zoho_Nov_2025;
import java.util.*;
public class probelm3{
   public static int forw(int x,int y){
       if(x==y){
           return 0;
       }
       int ans=0;
       while(x!=y){
           if(x==9) x=-1;
           ans++;
           x++;
       }
       return ans;
   }
   public static int back(int x,int y){
       if(x==y) return 0;
       int ans=0;
       while(y!=x){
           if(y==9) y=-1;
           ans++;
           y++;
       }
       return ans;
   }
   public static void main(String[] args) {
       int[] current={1,2,3,4};
       int[] target={4,5,6,7};

       int count=0;


       for(int i=0;i<current.length;i++){
           count+=Math.min(forw(current[i],target[i]),back(current[i],target[i]));
       }
       System.out.println(count);

   }
}

