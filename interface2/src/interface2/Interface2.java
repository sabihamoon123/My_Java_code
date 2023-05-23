
package interface2;

interface A{
    void triangle() ;
}
interface B{
    void circle() ;
}
interface C extends A, B{
    void shape() ;
}

class calculate implements C{
    double x=2 ;
    double y=3 ;
    double z=4 ;
    double r=5 ;
    
  public void triangle() {
      double trianglePerimeter = x+y+z ;
      System.out.println("Perimeter = "+trianglePerimeter) ;
  } 
   public void circle() {
      double circlePerimeter = 2*3.1416*r  ;
      System.out.println("Perimeter = "+circlePerimeter) ;
  } 
   public void shape(){
     System.out.println("This is triangle") ;
     System.out.println("This is circle") ;
   }
    
}
public class Interface2 {

   
    public static void main(String[] args) {
        calculate d = new calculate() ;
        d.circle();
        d.triangle();
        d.shape();
    }
    
}
