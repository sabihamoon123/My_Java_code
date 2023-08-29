/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrix;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Matrix {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int[][] A = new int[3][3] ;
        int sumOfDiagelements = 0 ;
        int sumOfUpperelem = 0 ;
        int sumOfLowerrelem = 0 ;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt() ;
            }
        }
        
        
//         for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < 3; col++) {
//               System.out.print("  " +A[row][col]);
//            }
//             System.out.println();
//        }
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row==col) {
                 sumOfDiagelements = sumOfDiagelements+A[row][col] ;
                }
                if(row<col){
                    sumOfUpperelem = sumOfUpperelem + A[row][col] ;
                }
                if(row>col){
                    sumOfLowerrelem = sumOfLowerrelem + A[row][col] ;
                }
            }
        }
        
        System.out.println("Sum of diagonal elements  = "+sumOfDiagelements);
        System.out.println("Sum of Upper elements  = "+sumOfUpperelem);
        System.out.println("Sum of Lower elements  = "+sumOfLowerrelem);
    }
    
}
