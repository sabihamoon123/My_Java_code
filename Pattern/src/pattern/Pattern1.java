/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pattern1 {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter line number = ") ;
        int n = input.nextInt() ;
        for (int row = n ; row>=1 ; row--){
            for (int col=1 ; col<=row ; col++){
                System.out.print(" "+col) ;
            }
            System.out.println() ;
        }
    }
}
