package circlesandpoints;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(1, -2);
        Point p3 = p1;
        Point p4 =new Point(p1);
        p1.setX(1000);
        Circle c1 = new Circle(5, p1);
        c1.printDetails();
        Circle c2 = new Circle(1, p2);
        Circle c3 = new Circle(3,p3);
        Circle c4 = new Circle(10,p4);
        System.out.println("********");
        c1.printDetails();
        c2.printDetails();
        c3.printDetails();
        System.out.println("********");
        System.out.println("Circle c1 perimeter = " + c1.getPerimeter());
        System.out.println("Circle c2 perimeter = " + c2.getPerimeter());
        p1.setX(200);
        c1.printDetails();
    }

    public static void addPointsToList() {
        ArrayList<Point> list = new ArrayList();
        Point p1 = new Point(2, 2);
        Point p2 = new Point(1, -2);
        list.add(p1);
        list.add(p2);
    }

}
