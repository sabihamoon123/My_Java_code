/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverse;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Palindrome1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in) ;
        int m , n, temp = 0, r, sum=0 ;
        System.out.println("Enter start number = ") ;
        m = input.nextInt() ;
        System.out.println("Enter end number = ") ;
        n = input.nextInt() ;
        
        int totalpalindrom =0 ;
        for(int i = m ; i<=n ; i++){
            sum=0 ;
            temp =i ;
        while(temp != 0){
            r = temp%10 ;
            sum = sum*10 + r ;
            temp = temp/10 ;
        }
        if (i==sum){
           totalpalindrom ++ ;
           System.out.println(sum+" ") ;
        }
        }
        System.out.println("total number of =" +totalpalindrom) ;
        
    }
}
