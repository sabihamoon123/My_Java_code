/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package name;
import java.util.Scanner ;

public class Name {

    
    public static void main(String[] args) {
        
        System.out.println("Hello") ;
        System.out.println("Sabiha Mahjabin Moon") ;
        
        int num1 , num2 ;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Input first number = ") ;
        num1 = input.nextInt() ;
        System.out.println("Input second number = ") ;
        num2 = input.nextInt() ;
        
        int multiple = num1*num2 ;
        System.out.println(num1+ "*" +num2 + "= " +multiple) ;
        
        int sub = num1-num2 ;
        System.out.println(num1+ "-" +num2 + "= " +sub) ;
        
        int sum = num1 + num2 ;
        System.out.println(num1+ "+" +num2 + "= " +sum);
        
        int div = num1/num2 ;
        System.out.println(num1+ "/" +num2 + "= " +div);
        
        int mod = num1%num2 ;
        System.out.println(num1+ " mod " +num2 + "= " +mod) ;
        
        int a = -5 +8 *6 ;
        int b = (55+9)%9 ;
        int c = 20 + -3*5/8 ;
        int d = 5+15/3*2 -8%3 ;
        System.out.println(a) ;
        System.out.println(b) ;
        System.out.println(c) ;
        System.out.println(d) ;
    }
    
}
