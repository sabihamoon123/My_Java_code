/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverse;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Armstrong {
    public static void main(String [] args){
         Scanner input = new Scanner (System.in) ;
        int sum = 0 , temp , num , r;
        System.out.println("Enter the number = ") ;
        num = input.nextInt() ;
        temp = num ;
        while(temp != 0){
            r = temp%10 ;
            sum = sum + r*r*r ;
            temp = temp/10 ;
        }
        if(num==sum){
        System.out.println("Armstrong number");
        }
        else{
           System.out.println("Not Armstrong"); 
        }
    }
}
