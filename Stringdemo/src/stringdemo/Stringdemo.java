
package stringdemo;


public class Stringdemo {

    
    public static void main(String[] args) {
        String s1 = "sabiha Moon" ;
        String s2 = new String ("Sabiha Moon") ;
        
        char[] s3 = {'m', 'o', 'o', 'n'} ;
        System.out.println(s3);
        
        System.out.println("s1 ="+s1);
        System.out.println("s2 ="+s2);
        
        int len = s1.length();
        System.out.println("Length of s1 = "+len);
        
        boolean con = s1.contains("Moon") ;
        System.out.println(con);
        boolean b = s1.isEmpty() ;
        System.out.println("b = "+b);
                
        
    }
    
}
