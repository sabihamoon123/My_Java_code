/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class equal1 {
    public static void main(String []args){
     Scanner input = new Scanner (System.in) ;
       System.out.println("Input first number = ") ;
       double a = input.nextDouble() ;
       System.out.println("Input second number = ") ;
       double b = input.nextDouble() ;
       
       System.out.println(a>0 && a<1 && b>0 && b<1) ;
    }
}
