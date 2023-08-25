/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverse;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Armstrong1 {
    public static void main (String[] args){
    Scanner input = new Scanner (System.in) ;
        int sum = 0 , temp ,m, n , r;
        System.out.println("Enter start number = ") ;
        m = input.nextInt() ;
        System.out.println("Enter end number = ") ;
        n = input.nextInt() ;
        int totalArmstrong = 0 ;
        for(int i=m ; i<=n ; i++){
        temp = i ;
        sum = 0 ;
        while(temp != 0){
            r = temp%10 ;
            sum = sum + r*r*r ;
            temp = temp/10 ;
        }
        if (i == sum){
            totalArmstrong++ ;
            System.out.println(sum+" ") ;
        }
        }
        System.out.println( "Total = "+totalArmstrong) ;
    }
}
