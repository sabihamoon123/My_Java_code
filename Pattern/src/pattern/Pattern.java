/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pattern;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter line number = ") ;
        int n = input.nextInt() ;
        for (int row = 1 ; row<=n ; row++){
            for (int col=1 ; col<=row ; col++){
                System.out.print(" "+col) ;
            }
            System.out.println() ;
        }
    }
    
}
