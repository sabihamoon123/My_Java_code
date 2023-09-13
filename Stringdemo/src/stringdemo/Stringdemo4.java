/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringdemo;

/**
 *
 * @author ASUS
 */
public class Stringdemo4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Moon") ;
        System.out.println(sb);
        
        sb.append(" Moon ") ;
        sb.append(25) ;
        
        System.out.println(sb);
        
//        
//          sb.delete(0, 5) ;
//          System.out.println(sb);
          
          sb.setLength(5);
          System.out.println(sb);
       
        
        
    }
}
