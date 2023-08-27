/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author ASUS
 */
public class Array2 {
    public static void main(String[] args){
        
        int[] num = {10,29,30,40,50,60,70,80} ;
        int sum = 0 ;
       for(int x : num){
           sum = sum+x ;
           System.out.println(x) ;
           
       }
       System.out.println(sum) ;
        
        String[] names = {"Moon", "Sabiha","Mahjabin","pol"} ;
       
        for(String x : names){   // for each loop
            System.out.println(x);
        }
    }
}
