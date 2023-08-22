/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Series {
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in) ;
        int n, result=1 ;
        System.out.println("Enter the last number = ") ;
        n = input.nextInt() ;
        for (int i = 1 ; i<=n ; i=i+1){
            System.out.print(i+ " ");
            result = result *i*i ;
        }
        System.out.println();
        System.out.println(result);
        
        
//        Scanner input = new Scanner (System.in) ;
//        int n, sum = 0 ;
//        System.out.println("Enter the last number = ") ;
//        n = input.nextInt() ;
//        
//        for (int i = 1 ; i<=n ; i=i+1){
//            System.out.print(i+ "X"+i+" ");
//            sum = sum + i*i ;
//        }
//        System.out.println();
//        System.out.println(sum);
    }
}
