/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pak;
import java.util.Scanner ;

/**
 *
 * @author ASUS
 */
public class Pak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num ;
        
        Scanner input = new Scanner(System.in) ;
        
        System.out.println("Enter any number = ") ;
        num = input.nextInt() ;
        
        if (num>0){
            System.out.println("Positive") ;
        }
        else if(num<0){
            System.out.println("Negative") ;
        }
        else{
            System.out.println("Equal to Zero") ;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        int x= 25 ;
        int y ;
        
        y=--x ; //post-increment
        System.out.println("y = " +y) ;
        
        y = x-- ;
        System.out.println("y = " +y) ;
        
         y = ++x ;
        System.out.println("y = " +y) ;
        
         y = x++ ;
        System.out.println("y = " +y) ;
    }
    
}
