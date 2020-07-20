package package2;

public class Circle {
    //static/class variable (general)
    private static int counter;  //counts the Circle objects that are created
     //Object/Instance Variables 
    //always private!
    private int x;  //default value =0
    private int y;
    private int radius;
    
    //Constructor: public ,name of class ,no return type(void or anything else)
    //default constructor: Compiler will add it
    public Circle(){
        counter++;
        System.out.println("Created new Circle!!!");
    }
    
    public Circle(int x,int y,int radius){//local overcover instance variables
        //this : refers to the object that called me
        this(); //Calls default constructor ,must be first statement if exists;
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    //instance methods
    //Setters : public,void ,accept parameter ,assign the parameter to the instance variable
    //name : setNameVariable
    public void setX(int timi) {
        if (timi > 0) {
            x = timi;
        }
    }

    //instance methods
    //Getters :public , return type , no parameter ,return the instance variable
    //name: getNameVariable
    public int getX() {
        return x;
    }

    //instance methods
    public void setY(int timi) {
        //System.out.println("1Inside method setY:timi=" + timi + ", y= " + y);
        if (timi > 0) {
           // System.out.println("2Inside method setY:timi=" + timi + ", y= " + y);
            y = timi;
           // System.out.println("3Inside method setY:timi=" + timi + ", y= " + y);
        }
       // System.out.println("4Inside method setY:timi=" + timi + ", y= " + y);
    }

    public int getY() {
        return y;
    }

    //instance methods
    public void setRadius(int aktina) {
        if (aktina > 0) {
            radius = aktina;
        }
    }

    public int getRadius() {
        return radius;
    }
    
    // static to become for Class
    public static int getCounter(){
        return counter;
    }
    
    //instance method to set details of cirlce in one step
    public void setDetails(int timiX, int timiY, int aktina) {
        setX(timiX);
        setY(timiY);
        setRadius(aktina);
    }

    //Instance method
    public void printDetails() {
        System.out.println("Circle details: x= " + x + ", y= " + y + ", radius= " + radius);
    }
}
