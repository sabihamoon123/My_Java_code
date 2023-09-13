/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringdemo;

/**
 *
 * @author ASUS
 */
public class Stringdemo3 {
    public static void main(String[] args) {
        String s1 = "This_is_my country" ;
        System.out.println(s1);
        
        
        String s2 = s1.replace('i', 'j') ;
        
        System.out.println(s2);
        
       String[] s3 = s1.split("_") ;
       for(String x : s3){
        System.out.println(x);
       }
    }
}
