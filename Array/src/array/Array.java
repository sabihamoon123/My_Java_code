/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author ASUS
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] number = new int[6] ;
       number[0] =10 ;
       number[1] =10 ;
       number[2] =10 ;
       number[3] =10 ;
       number[4] =10 ;
       int sum = number[0]+number[1]+number[2]+number[3]+number[4] ;
       System.out.println(+sum);
       
       int len = number.length ;
       System.out.println("Array size = "+len) ;
    }
    
}
