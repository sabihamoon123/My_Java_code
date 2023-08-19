/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package name;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Name2 {
    public static void main (String []args){
        
        float r ;
        
        int n ;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter three numbrs= ") ;
        n=input.nextInt() ;
        n=input.nextInt() ;
        n=input.nextInt() ;
        
        float avg = n+n+n/3 ;
        System.out.println(avg) ;
        
        System.out.println("Enter the radius = ") ;
        r = input.nextFloat() ;
        
        float area = (float) (3.1416*r*r) ;
        float perimeter = (float) (2*3.1416*r) ;
        
        System.out.println(area) ;
        System.out.println(perimeter) ;
    } 
}
