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
public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ; 
       int num , temp, r, sum=0 ;
       System.out.println("Enter any number = ");
       num = input.nextInt() ;
       temp = num ;
       while(temp != 0){
           r = temp%10 ;
           sum= sum*10 + r ;
           temp = temp/10 ;
       }
      if(num == sum){
          System.out.println("Palindrom number ") ;
      }
      else{
          System.out.println("Not Palindrom number ") ;
      }
    }
}
