package abstract4 ;

class Shape {
    
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}

public class Abstract4 {
    public static void main(String[] args) {
      
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double rectangleArea = rectangle.calculateArea();
        double rectanglePerimeter = rectangle.calculatePerimeter();
        
        Square square = new Square(4.0);
        double squareArea = square.calculateArea();
        double squarePerimeter = square.calculatePerimeter();
        
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerimeter);
    }
}
