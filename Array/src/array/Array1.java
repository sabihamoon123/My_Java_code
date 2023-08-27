/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Array1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in) ;
        double[] number = new double[5] ;
        double sum = 0 ;
        
        System.out.println("Please entar 5 numbers = ") ;
        for (int i = 0 ; i<number.length ;i++){
            number[i] = input.nextDouble() ;
        }
        
        for( int i= 0 ;i<number.length ; i++){
            sum = sum + number[i] ;
        }
        
        System.out.println("The sum is = "+sum);
        
        double avg = sum/number.length ;
        System.out.println("The average is = "+avg);
        
        double max = number[0] ;
        double min = number[0] ;
        for (int i = 0 ; i<5 ; i++){
            if (max<number[i]){
                max = number[i] ;
            }
            if(min>number[i]){
                min = number[i] ;
            }
        }
        System.out.println( "Maximum = "+max) ;
        System.out.println( "Minimum = "+min) ;
    }
}
