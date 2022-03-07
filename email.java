import java.util.*;

public class email{
    public static void main(String args[]){
        String email;
        System.out.println("enter email");
        Scanner sc=new Scanner(System.in);
        email=sc.nextLine();
        int el=email.length();
        int in=email.indexOf("@");

        if(email.indexOf("@")<=0){
            System.out.println("invalid");
        } 
        else if(email.indexOf("@")==(el-1)){
            System.out.println("invalid");
        }
        else
        {
            String after;
            after=email.substring(email.indexOf('@')+1,el-1);
            if(after.indexOf('.')<=0)
            {
                System.out.println("invalid");
            }
            else if(after.indexOf('.')==(el-1))
            {
                System.out.println("invalid");
            }
            else{
                System.out.println(" valid");
            }

            
        }
    }


}
