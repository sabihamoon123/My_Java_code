/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array1;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Matrix {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in) ;
        int[][] A = new int[2][3] ;
        int[][] B = new int[2][3] ;
        
        
        //input for A & B
        System.out.println("Enter the elements or A matrix  = ");
        for(int row=0 ; row<2 ; row++){
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ", row, col);
                A[row][col] = input.nextInt() ;
            }
        }
        System.out.println("Enter the elements or B matrix  = ");
         for(int row=0 ; row<2 ; row++){
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] = ", row, col);
                B[row][col] = input.nextInt() ;
            }
        }
         
         
        //printing A & B
        System.out.print("A = ");
        for(int row=0 ; row<2 ; row++){
            for (int col = 0; col < 3; col++) {
                System.out.print("\t  "+A[row][col]); ;
            }
            System.out.println();
        }
        
        
        System.out.println("\n\n");
        System.out.print("B = ");
        for(int row=0 ; row<2 ; row++){
            for (int col = 0; col < 3; col++) {
                System.out.print("\t  "+B[row][col]); ;
            }
            System.out.println();
        }
        
        
        
        System.out.println("\n\n");
        System.out.print("A + B =");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t  " +(A[row][col] + B[row][col]));
            }
            System.out.println();
        }
    }
     
            
            
       
}
