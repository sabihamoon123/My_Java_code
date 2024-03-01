import javax.security.auth.kerberos.ServicePermission;

public class factoddsum {
    public static void main(String[] args) {
        int i , fact = 1 ;
        int n = 9 , sum=0 ;
        for(i = 1 ; i<=n ;i++){
           
            if(i%2!=0){
                sum=sum+i ;
                //System.out.println(" " +i ) ;
                System.out.println("summation of " +i+ " is= "+sum);
            }
          //  System.out.println("= "+sum);
        }
        
    }
}

    

