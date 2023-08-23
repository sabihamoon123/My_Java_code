/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timetable;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class PrimeNumber {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in) ;
        int m , n , count = 0, numOfPrime = 0 ;
        
        System.out.println("Enter initial number = ") ;
        m = input.nextInt() ;
        System.out.println("Enter ending number = ") ;
        n = input.nextInt()  ;
        for (int i = m ; i<=n ;i++){
            for (int j = 2 ; j<=i-1 ;j++){
                if (i%j==0){
                    count++ ;
                    break ;
                }
            }
            if(count==0){
                System.out.println(i) ;
                numOfPrime++ ;
            }
              
                count=0 ;
            
        }
        System.out.println("Total Prime number = " +numOfPrime) ;
        
        
//        Scanner input = new Scanner(System.in) ;
//        System.out.println("Enter any positive number = ") ;
//        int num = input.nextInt() ;
//        int count = 0 ;
//        if(num==0 || num==1){
//            System.out.println("Not Prime") ;
//        }
//        else{
//        for (int i = 2 ; i<num/2 ;i++){
//            if (num%i == 0){
//              count++ ;
//              break ;
//            }
//        }
//        if(count==0){
//            System.out.println("Prime number") ;
//        }
//        else{
//            System.out.println("Not Prime");
//        }
//    }
}
}
