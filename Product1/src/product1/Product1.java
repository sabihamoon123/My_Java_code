/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package product1;
import java.util.Scanner ;

/**
 *
 * @author ASUS
 */
public class Product1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        
        System.out.print("Enter the title : ");
        String title = input.nextLine() ;
        
        System.out.print("Enter the description : ");
        String description = input.nextLine() ;
        
        System.out.print("Enter the category : ");
        String category = input.nextLine() ;
        
        System.out.print("Enter the id : ");
        int id=input.nextInt() ;
        
        System.out.print("Enter the price : ");
        int price = input.nextInt() ;
        
        System.out.println(" " );
        
        System.out.println("My title : " +title);
        
        System.out.println("My category : " +category);
        System.out.println("My description : " +description);
        System.out.println("My id : " +id);
        System.out.println("My price : " +price);
        
    }
    
}
