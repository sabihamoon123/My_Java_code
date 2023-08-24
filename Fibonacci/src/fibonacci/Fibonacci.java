/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereint 
        Scanner input = new Scanner(System.in) ;
        System.out.println("How many numbers = ") ;
        int n = input.nextInt() ;
        int first =0 ;
        int second = 1 ;
        int fibo = 0 ;
        System.out.print(first+" "+second) ;
        
        for(int i = 3 ; i<=n ;i++){
            fibo = first+second ;
            System.out.print(" "+fibo) ;
            first = second ;
            second = fibo ;
        }
        System.out.println();
        System.out.println("Your "+n+"th fibonacci number is = "+fibo) ;
    }
    
}
