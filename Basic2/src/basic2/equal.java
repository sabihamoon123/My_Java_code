/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic2;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class equal {
   public static void main(String[] args){
       
       Scanner input = new Scanner (System.in) ;
       System.out.println("Input first number = ") ;
       int a = input.nextInt() ;
       System.out.println("Input second number = ") ;
       int b = input.nextInt() ;
       System.out.println("Input third number = ") ;
       int c = input.nextInt() ;
       System.out.println("Input fourth number  = ") ;
       int d = input.nextInt() ;
       
       System.out.println("Input first number = "+a);
       System.out.println("Input first number = "+b);
       System.out.println("Input first number = "+c);
       System.out.println("Input first number = "+d);
       if(a==b && b==c && c==d ){
           System.out.println("Numbers are equal") ;
       }
       else{
           System.out.println("Numbers are not equal!");
       }
       
   } 
}
