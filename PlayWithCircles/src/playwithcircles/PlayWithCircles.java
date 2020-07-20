package playwithcircles;

import package2.Circle;

public class PlayWithCircles {

    public static void main(String[] args) {
        
        Circle c1 = new Circle(); //create object/instance of class Circle
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        Circle c4 = new Circle(2, 4, 6);

        System.out.println("Circles created: " + Circle.getCounter());
        c1.setDetails(-4, 4, -4);

//      c1.setX(3); 
//      c1.setY(2);
//      c1.setRadius(10);
        System.out.println("circle1.x= " + c1.getX());
        c2.setDetails(1, 1, 1);
        c2.setX(2);
        c2.setY(-7);
        c2.setRadius(5);

        //System.out.printf("Circle c1: x=%d y=%d radius=%d\n",c1.x,c1.y,c1.radius);
        //System.out.printf("Circle c1: x=%d y=%d radius=%d\n",c2.x,c2.y,c2.radius);
        c1.printDetails();
        c2.printDetails();
        c3.printDetails();
        c4.printDetails();
    }

}
