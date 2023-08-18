

package abstract1 ;
abstract class Abstract1 {
    public abstract double calculatePerimeter();
    public static void main(String[] args) {
        EquilateralTriangle equilateral = new EquilateralTriangle(5.0);
        IsoscelesTriangle isosceles = new IsoscelesTriangle(3.0, 4.0);
        ScaleneTriangle scalene = new ScaleneTriangle(2.0, 3.0, 4.0);
    
        System.out.println("Equilateral Triangle Perimeter: " + equilateral.calculatePerimeter());
        System.out.println("Isosceles Triangle Perimeter: " + isosceles.calculatePerimeter());
        System.out.println("Scalene Triangle Perimeter: " + scalene.calculatePerimeter());
    }
}

 class Triangle extends Abstract1 {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

 class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }
}

 class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double equalSide, double differentSide) {
        super(equalSide, equalSide, differentSide);
    }
}

 class ScaleneTriangle extends Triangle {
    public ScaleneTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }
}