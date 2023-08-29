/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

import javax.tools.Diagnostic;

/**
 *
 * @author ASUS
 */
public class Matrix2 {
    public static void main(String[] args) {
        int [][] number = new int[4][] ;
        int k = 0 ;
        number[0] = new int[1] ;
        number[1] = new int[2] ;
        number[2] = new int[3] ;
        number[3] = new int[4] ;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                number[i][j] = k ;
                k++ ;
            }
            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(number[i][j]+" ");
                
            }
            System.out.println();  
        }
    }
}
