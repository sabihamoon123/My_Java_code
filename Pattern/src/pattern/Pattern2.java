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
public class Pattern2 {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter line number = ") ;
        int n = input.nextInt() ;
        for (int row = 1 ; row<=n ; row++){
            for (int col=1 ; col<=row ; col++){
                if(col%2==0){
                System.out.print("0 ") ;
                }
                else{
                     System.out.print("1 ") ;
                }
               
            }
            System.out.println() ;
        }
    }
}
