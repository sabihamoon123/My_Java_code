import java.util.Scanner ;
class shape{
    int r ;
    double ave, rad, area, leng, height, base ; 
}

class twoD extends shape {
    void menu(){
      System.out.println("Two dimension") ;
      System.out.println("1. Circle") ;
      System.out.println("2. Square") ;
      System.out.println("3. Triangle") ;
      Scanner s = new Scanner(System.in) ;
      int a = s.nextInt() ;
      switch(a)
      {

      } 
        
    }
}
class Circle extends twoD{
    void areaofCircle(){
        System.out.print("enter the radius :") ;
        Scanner b = new Scanner(System.in) ;
        rad = b.nextDouble() ;
    area = (22*r*r)/7 ;
    System.out.println("area of the circle:" +area) ;
    }
}
class square extends twoD{
    void areaofSquare(){
        Scanner in = new Scanner(System.in) ;
        System.out.println("enter the length:") ;
        leng = in.nextDouble() ;
        area = leng*leng ;
        System.out.println("area of the square:" +area) ; 
    }
}





public class inheritance1 {
    public static void main(String[] args) {
        
    }
}