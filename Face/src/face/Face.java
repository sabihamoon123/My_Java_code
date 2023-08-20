/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package face;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Face {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int s, n ;
        Scanner input= new Scanner(System.in) ;
        System.out.println("Input the length of the polygon = ") ;
        s = input .nextInt() ;
        System.out.println("Input the one side of polygon = ") ;
        n = input.nextInt() ;
        
       float polygonArea = (float) ((n*(s*s))/(4*Math.tan(Math.PI/n))) ;
        System.out.println(polygonArea) ;
         
        float area = (float) ((6* (s*s))/(4*Math.tan(Math.PI/6))) ; 
        System.out.println(area);
        
        
        System.out.println("  +\"\"\"\"\"+") ;
        System.out.println(" [| o o |]") ;
        System.out.println("  |  ^  |") ;
        System.out.println("  | '-' | ") ;
        System.out.println("  +-----+") ;
    }
    
}
