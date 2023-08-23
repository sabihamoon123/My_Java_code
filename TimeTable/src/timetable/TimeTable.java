/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timetable;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class TimeTable {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in) ;
        int n , m ;
        System.out.print("Enter initial number = ") ;
        n = input.nextInt() ;
        System.out.print("Enter final number = ") ;
        m = input.nextInt() ;
        
        for(int i = n ; i<=m ; i++){
         for (int j = 1 ; j<=10 ;j++){
            System.out.println(i+ " X "+j+ " = "+i*j) ;
        }
         System.out.println("\n\n") ;
        }
        
        
        
//        Scanner input = new Scanner(System.in) ;
//        int num ;
//        System.out.print("Enter any number = ") ;
//        num = input.nextInt() ;
//        for (int i = 1 ; i<=10 ;i++){
//            System.out.println(num+ " X "+i+ " = "+num*i) ;
//        }
    }
    
}
