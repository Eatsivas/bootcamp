
package playwithshapes;

import java.util.ArrayList;
import java.util.List;



public class PlayWithShapes {

  

    public static void main(String[] args) {
        
        List<Shape> sximata =new ArrayList();
        Triangle triangle = new Triangle(2,3);
        sximata.add(triangle);
        Square square = new Square(2);
        sximata.add(square);
        sximata.add(new Circle(5));
//        Shape shape =new Shape();
//        sximata.add(shape);
        for(Shape sxima:sximata){
            System.out.println(sxima.getArea());
        }
        System.out.println("***Printing Perimeters***");
        for(Shape sxima:sximata){
            System.out.println(sxima.getPerimeter());
        }
    }

}
