
package excep1;


public class Excep1 {

   
    public static void main(String[] args) {
       try{
        int x=10 ;
        int y=0 ;
        int r = x/y ;
        System.out.println("result  " +r) ;
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Exception "+e) ;
       }
       finally{
       System.out.println("Last line of the program") ;
    }
    
}
}
