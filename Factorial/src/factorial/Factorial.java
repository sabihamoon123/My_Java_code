/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Factorial {

    public static void main(String[] args) {
        int n , fact = 1 ;
        Scanner input = new Scanner (System.in) ;
        System.out.println("Enter the number = ") ;
        n = input.nextInt() ;
        for (int i = 1 ; i<=n ; i++){
            fact = fact*i ;
        }
        //System.out.println(n) ;
        System.out.println("Factorial of "+n+ " = " +fact) ;
        
    }
    
}
