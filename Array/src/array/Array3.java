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
public class Array3 {
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in) ;
        //int[] num = new int[7]  ;
        
        
        String[] weekdays = new String[7] ;
        weekdays[0] = "monday" ;
        weekdays[1] = "tuesday" ;
        weekdays[2] = "wednesday" ;
        weekdays[3] = "Thursday" ;
        weekdays[4] = "Friday" ;
        weekdays[5] = "Saturday" ;
        weekdays[6] = "Sunday" ;
        
        System.out.println("Enter the number between 1-7 = ");
       int num = input.nextInt() ;
       
        for(int i=0 ;i<weekdays.length ; i++){
            if(i == num-1)
            System.out.println("The day is = "+weekdays[num-1]);
        }
    }
}
