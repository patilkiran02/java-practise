import java.util.*;

public class sumofarray {
    public static void main(String args[]) {
        int ar []= new int[5]; 
        int sum=0;      
        Random r=new Random();
        for(int i=0;i<5;i++){
            ar[i]=r.nextInt(10);

        }

        for(int i=0;i<5;i++){
            System.out.println(ar[i]);

        }
        for(int i:ar){
            sum=sum+i;
        }
        System.out.println("sum =>"+sum);
        
        
        


        
    }
    
}
