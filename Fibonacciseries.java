


import javax.sql.rowset.spi.SyncResolver;
public class Fibonacciseries {
    public static void main(String[] args) {
        int fn[] ;
        fn = new int [10] ;
         fn[0] = 0 ;
         fn[1] = 1 ;
        int fibo[] ;
        fibo = new int [50] ;
        System.out.println(" "+fn[0]) ;
        System.out.println(" "+fn[1]) ;
         for(int i = 2 ; i<10 ;i++){
            fibo[i] = fn[0] + fn[1] ;
            System.out.println(" "+fibo[i]);
            fn[0] = fn[1] ;
            fn[1] = fibo[i] ;
         }
        
        for (int i = 0 ; i<10 ;i++){
            System.out.println("fn "+fibo[i]) ;
        }

    }
}

