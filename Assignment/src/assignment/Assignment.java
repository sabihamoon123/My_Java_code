/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;
import java.util.Scanner ;
/**
 *
 * @author ASUS
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num ;
        Scanner input = new Scanner(System.in) ;
//        System.out.println("Enter any positive numbar = ");
//        num = input.nextInt() ;
//        
//        if(num%2==0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }
        
        char ch ;
        char mn ;
        //Scanner input = new Scanner(System.in) ;
        System.out.println("Have you completed your masters?(y/n) ") ;
        ch = input.next().charAt(0) ;
        System.out.println("Are you fluent in English? ") ;
        mn = input.next().charAt(0) ;
        if (ch=='y' && mn=='y'){
            System.out.println("You are eligible") ;
        }
        
        else{
            System.out.println("Sorry! You are not eligible") ;
        }
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Do you love java? ");
       // ch = input.next().charAt(0) ;
        if(ch=='y' || ch=='Y'){
            System.out.println("You are a Java Lover.") ;
        }
        else if (ch=='n' || ch=='N'){
            System.out.println("You are not a Java Lover.") ;
        }
        else{
            System.out.println("Wrong input type.. Yes for y/ No for n") ;
        }
      





     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
           System.out.println("Vowel");
       } 
       else{
           System.out.println("Consonent") ;
       }
        
       if(ch>='a' && ch<='z'){
           System.out.println("Small Letter") ;
       }
       else if(ch>='A' && ch<='Z'){
           System.out.println("Capital Letter") ;
       }
       else{
           System.out.println("Not a letter") ;
       }

        
//        if(num==0){
//            System.out.println("zero");
//        }
//        else if(num==1){
//           System.out.println("One"); 
//        }
//        else if(num==2){
//           System.out.println("Two"); 
//        }
//        else if(num==3){
//           System.out.println("Three"); 
//        }
//        else if(num==4){
//           System.out.println("Four"); 
//        }
//        else if(num==5){
//           System.out.println("Five"); 
//        }
//        else if(num==6){
//           System.out.println("Six"); 
//        }
//        else if(num==7){
//           System.out.println("Seven"); 
//        }
//        else if(num==8){
//           System.out.println("Eight"); 
//        }
//        else if(num==9){
//           System.out.println("Nine"); 
//        }
//        else{
//            System.out.println("Invalid") ;
//        }
//        
        
        
        
        
        
        
        
        
        
////        int age ;
////        Scanner input = new Scanner(System.in) ;
////        System.out.println("Enter the age = ") ;
////        age = input.nextInt() ;
////        
////        if(age>=18){
////            System.out.println("Valid voter") ;
////        }
////        else{
////            System.out.println("Invalid voter");
//        }
        
    }
    
}
