/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package name;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Name1 {
    public static void main(String []args){
        
        
        double a = (float) ((25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5)) ;
        System.out.println(a);
        float b = (float) (4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))) ;
        System.out.println(b);
       
        System.out.println("   j   a   v      v   a ") ;
        System.out.println("   j  a a   v    v   a a") ;
        System.out.println("j  j aaaaa   V  V   aaaaa") ;
        System.out.println(" jj a     a    V   a     a") ;
        
        int num ;
        Scanner input = new Scanner(System.in) ;
        System.out.print("Input a number = ") ;
        num = input.nextInt() ;
        for (int i =1 ; i<=10 ;i++){
            int multiple = num * i ;
            System.out.println(num+ " * " +i+ " = " +multiple);
        }
    }
}
