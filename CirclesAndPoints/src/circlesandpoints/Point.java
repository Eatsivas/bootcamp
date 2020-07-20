package circlesandpoints;

public class Point {

    private int x;
    private int y;
    

    public Point(int num1, int num2) {
      x=num1;
      y=num2;
      
    }
    //copy constructor 
    public Point(Point oldPoint){
        this.x=oldPoint.getX();
        this.y=oldPoint.getY();
    }
    
    public void setX(int timi) {
        x=timi;
    }

    public void setY(int timi) {
        y=timi;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
