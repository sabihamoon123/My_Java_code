/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringdemo;

/**
 *
 * @author ASUS
 */
public class stringdemo1 {
    public static void main(String[] args) {
        String firstName = "Sabiha " ;
        String lastName = "Moon" ;
        
        String fullName = firstName.concat(lastName) ;
        System.out.println("Full Name = "+fullName);
        
        String upperName = fullName.toUpperCase() ;
        System.out.println("uppername = "+upperName);
        
        String lowerName = fullName.toLowerCase() ;
        System.out.println("lowercase = "+lowerName);
        
        boolean b = firstName.startsWith("Sa") ;
        System.out.println("b = "+b);
        
        boolean last = lastName.endsWith("on") ;
        System.out.println("last = "+last);
        
        String[] names = {"moon", "sabiha", "mahjabin"} ;
        for(String x : names){
            System.out.println(x);
        }
    }
}
