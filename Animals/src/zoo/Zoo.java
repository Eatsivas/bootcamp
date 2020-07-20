package zoo;

import animals.Animal;
import animals.birds.Eagle;
import animals.mammals.Rhino;
import animals.fish.Dolphin;
import animals.mammals.Lion;
import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        Eagle e1 = new Eagle("Eaglo", 12, 2);
        Lion l1 = new Lion(4, "Liono", 15);
        Rhino r1 = new Rhino(70, 2, "Rhino", 7);
        Dolphin dolphin1 = new Dolphin(200, "Flipper", 15);
        Dolphin dolphin2 = new Dolphin(150, "Willy", 8);
        l1.printDetails();
        e1.printDetails();
        dolphin1.play(dolphin2);

        System.out.println(dolphin1);

        Animal aetos = e1;
        System.out.println("-----------");
        aetos.play();
        System.out.println("----------");
        Object o = aetos;
        Eagle e2 = (Eagle) o;//trust me
        e2.printDetails();

        List<Animal> kivwtos = new ArrayList();
        kivwtos.add(e1);        
        kivwtos.add(l1);
        kivwtos.add(r1);
        kivwtos.add(dolphin1);
        kivwtos.add(dolphin2);
        System.out.println("********ΖΩΑΚΙΑ ΠΑΙΞΤΕ********");
        for (Animal zwaki:kivwtos){
            zwaki.play();
        }
        System.out.println("--------Prinitng details----------");
        for(Animal zwaki: kivwtos){
            zwaki.printDetails();
        }
    }

}
