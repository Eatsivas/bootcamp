
package playwithshapes;


public class Square extends Shape{
    
    private double side;

    public Square(double side) {
        this.side = side;
    }
    
  
    @Override
    public double getArea(){
       
        double area = side*side;
        return area;
    }
    
    
    public void squareMethod(){
        System.out.println("I am squareMethod");
    }

    @Override
    public double getPerimeter() {
        double perimeter = side*4;
        return perimeter;
    }   

}
