class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
 }
 // single inheritence
 class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }  
 }
 // hierarchical inheritence
 class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
 } 
 // multiple inheritence
 class EquilateralTriangle extends Triangle {
    int side;
 }
 



public class Inheritence {
    public static void main(String[] args) {
        EquilateralTriangle t1 =new EquilateralTriangle();
        t1.side=5;
        t1.area();
    }
    
}
