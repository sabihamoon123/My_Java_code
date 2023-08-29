/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Matrix1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int k = 0;
        int[][] number = new int[4][5] ;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
              number[i][j] = k ;
              k++ ;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " +number[i][j]);  
            }
            System.out.println();
        }
    }
}
