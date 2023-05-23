
package array2;
import java.util.Scanner ;

public class Array2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in) ;
        
        double[] number = new double[5] ;
        double sum =0 ;
        System.out.print("Please enter the 5 numbers = ");
        
        for(int i = 0 ; i<5 ; i++){ // array.length use korleo hobe
             number[i] = input.nextDouble() ;
        }
        
         for(int i = 0 ; i<5 ; i++){
            sum = sum + number[i] ;
        }
        
        
       
        System.out.println(sum);
        System.out.println(sum/5);  //avg ber korar jonno double diye age avg kore then print korleo hbe
        
    }
    
    
}
