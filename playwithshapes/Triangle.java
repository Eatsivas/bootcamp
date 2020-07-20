
package playwithshapes;


public class Triangle extends Shape{
    
    //private double base;
    private double hight;
    private double isiPleura;
    
    
   

    public Triangle(double base, double hight) {
        this.isiPleura = base;
        this.hight = hight;
    }
    
    
    
    @Override
    public double getArea(){
        double area =( isiPleura * hight)*1/2;
        return area;
    }

  public void triangleMethod(){
        System.out.println("I am triangleMethod");
    }

    @Override
    public double getPerimeter() {
        double perimeter = isiPleura *3;
        return perimeter;
    }
    
}
