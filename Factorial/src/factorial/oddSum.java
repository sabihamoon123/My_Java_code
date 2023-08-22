/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class oddSum {
    public static void main(String []args){
       int n , m ;
        Scanner input = new Scanner (System.in) ;
        System.out.println("Enter the first number = ") ;
        n = input.nextInt() ;
        System.out.println("Enter the last number = ") ;
        m = input.nextInt() ;
        int sum = 0 ;
       // int oddNum = 0 ;
        for (int i =n ; i<=m ; i++){
            if (i%2 == 0){
                sum = sum+i ;
                System.out.print("  "+i) ;
            }
            
            
        }
        System.out.println() ;
        System.out.println("The sum is = " +sum) ;
       
    }
            
}
