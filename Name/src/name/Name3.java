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
public class Name3 {
    public static void main (String []args){
        
        int a , b ,temp ;
        a=15 ;
        b=27 ;
        System.out.println("Before Swapping = a, b =" +a+ ","+ +b) ;
        temp = a ;
        a = b ;
        b = temp ;
        System.out.println("After Swapping = a, b = "+a+","+ +b);
        
        
        
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println("==============================================  ");
        System.out.println("==============================================  ");
        System.out.println("==============================================  ");
        System.out.println("==============================================  ");
        System.out.println("==============================================  ");
        System.out.println("==============================================  ");
        
        
        float w , h ;
        Scanner input = new Scanner (System.in) ;
        System.out.println("Enter width and height = ");
        w = input.nextFloat() ;
        h = input.nextFloat() ;
        
        float area = w*h ;
        float perimeter = 2*(w+h) ;
        System.out.println("Area is "+w+"*"+h+ "=" +area) ;
        System.out.println("Perimeter is 2*"+w+"+"+h+ "=" +perimeter) ;
    }
}
