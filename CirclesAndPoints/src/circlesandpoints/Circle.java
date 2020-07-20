package circlesandpoints;

public class Circle {

    private int radius;
    private Point point;
    private static int counter;
    
    public Circle() {

    }

    public Circle(int radius, Point x) {
        this.radius = radius;
        point = x;
    }
    
    
    public void setPoint(Point p){
        point = p;
    }
    
    public void setRadius(int radius){
        this.radius =radius ;
    }

    public Point getPoint(){
        return point;
    }
    
    public int getRadius(){
        return radius;
    }
    public void printDetails(){
        System.out.printf("Circle details : Point =(x:%d,y:%d), radius = %d\n",point.getX(),point.getY(),radius);
    }
    
    public double getPerimeter(){
       double perimeter = 2*Math.PI*radius;
        return perimeter;
    }
   
}
