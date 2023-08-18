/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package product2;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Product2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int num1, num2, Result ;
        
        System.out.print("Enter first number: ");
        num1= input.nextInt() ;
        
        System.out.print("Enter second number: ");
        num2 = input.nextInt() ;
        
        Result= num1+num2 ;
        System.out.println("Result : " +Result);
        
        Result= num1-num2 ;
       System.out.println("Result : " +Result);
       
       double Result2 = (double) num1/num2 ;
       System.out.println("Result : " +Result2);
       
       Result = num1*num2 ;
       System.out.println("Result : " +Result);
       
       Result = num1%num2 ;
       System.out.println("Result : " +Result);
    }
    
}
