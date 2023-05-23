/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class maxmin {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in) ;
        double [] number = new double [5] ;
        double sum = 0 ;
        System.out.print(" Enter the 5 number =") ;
        
        for (int i = 0 ; i<5 ; i++){
            number[i] = input.nextDouble();
        }
        
        for (int i = 0 ; i<5 ; i++){
            sum = sum + number[i] ;
        }
        
        
        System.out.println(sum);
         System.out.println(sum/5);
         
          double max = number[0], min = number[0];
        
        for (int i = 0 ; i<5 ; i++){
           if (max<number[i]){
            max = number[i] ;
        } 
           if (min>number[i]){
            min = number[i] ;
        } 
        }
         System.out.println("maximum "+max);
         
         
        System.out.println("minimum "+min); 
        
    }
}
