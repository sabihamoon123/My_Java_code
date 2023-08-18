/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interface;

 interface A{
    void play() ;
}
 interface B{
    void play() ;
}
 class C implements A, B {
   
   public void play(){
        System.out.println("I am from C") ;
    }
   
}
public class Interface {
    public static void main(String[] args){
        C ob = new C() ;
        ob.play() ;
    }
}