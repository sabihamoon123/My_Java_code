/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;
import java.util.Arrays ;
/**
 *
 * @author ASUS
 */
public class ArraySort {
    public static void main(String[] args) {
        
        int [] number = {10, -3, 12, 5, 25} ;
        
        Arrays.sort(number);
        
        System.out.println("Ascending = ");
        for (int i = 0; i < 5; i++) {
            System.out.println(" "+number[i]);
        }
        System.out.println("Descending = ");
        for (int i = 4; i >=0; i--) {
            System.out.println(" "+number[i]);
        }
        
        System.out.println();
        String[] names = {"Moon", "Zitu", "Sabiha", "Fahim"} ;
        Arrays.sort(names);
        
        for (int i = 0; i < 4; i++) {
            System.out.print(names[i]+" ");
        }
        System.out.println();
        for (int i = 3; i >=0; i--) {
            System.out.print(names[i]+" ");
        }
    }
}
