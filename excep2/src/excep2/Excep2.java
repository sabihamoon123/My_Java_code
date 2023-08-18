
package excep2;

import java.util.Scanner ;
public class Excep2 {

    
    public static void main(String[] args) {
        
        while(true){
          try{
            Scanner sc = new Scanner(System.in) ;
            System.out.print("Enter the num1 : ");
            int num1 = sc.nextInt() ;
            System.out.print("Enter the num2 : ") ;
            int num2 = sc.nextInt() ;
            int result = num1/num2 ;
            System.out.println("Result :"+num1 + "/" +num2 +"= "+result);
        }catch(Exception e){
            System.out.println("Exception :"+e);
            System.out.println("You must enter integer.. Try again :");
            
        }  
        
    }
    
}
}
