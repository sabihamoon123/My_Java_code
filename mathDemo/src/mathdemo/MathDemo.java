/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathdemo;

/**
 *
 * @author ASUS
 */
public class MathDemo {

    public static void main(String[] args) {
        
        int sum = 0  ;
        for(int i=1 ; i<=10 ; i++){
            sum=sum+i ;
           
        }
         System.out.println("Sum = " +sum);
        
        
        int i=1 ;
        do{
            System.out.println(i) ;
            i=i+2 ;
       }while(i<=100);
        
        

        for ( i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        for ( i = 2; i <= 100; i = i + 2) {
          System.out.println(i);
       }

      //  int i= 2 ;
        while(i<=100){
            System.out.println(i);
            i=i+2 ;
        }
        
        int x=2 ;
        int y=3 ;
        
        int max = Math.max(x, y) ;
        System.out.println("Maximum " +max) ;
        
        int min = Math.min(x, y) ;
        System.out.println("Minimum " +min) ;
        
     int absolute = Math.abs(y) ;
        System.out.println("Absolute of Y " +absolute) ;
        
        double power = Math.pow(x, y) ;
        System.out.println("x to the power y " +power) ;
        
        int round = Math.round(8.8f) ;
        System.out.println("round of 8.8 ="+round);
        
        double pi = Math.PI ;
       System.out.println(pi);
    }

}
