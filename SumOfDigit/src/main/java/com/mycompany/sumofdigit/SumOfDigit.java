/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumofdigit;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class SumOfDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        int sum = 0 , temp , num , r;
        System.out.println("Enter the number = ") ;
        num = input.nextInt() ;
        temp = num ;
        while(temp != 0){
            r = temp%10 ;
            sum = sum + r ;
            temp = temp/10 ;
        }
        System.out.println("Sum of digits = "+sum ) ;
    }
}
