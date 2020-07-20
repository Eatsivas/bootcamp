package playwithshapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public void circleMethod() {
        System.out.println("I am circle method");
    }

    @Override
    public double getPerimeter() {
         double perimeter = 2*Math.PI*radius;
         return perimeter;
    }

}
