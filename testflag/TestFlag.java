package testflag;

public class TestFlag {

    public static void main(String[] args) {
        boolean flag = true;
        int i = 0;
//       while(flag){
//           System.out.println("Hello: I am number "+i);
//           i++;
//           if(i==10){
//               flag=false;
//           }
//       }

        do {
            if(i==0){
                System.out.println("Entered do ...while loop");
            }
            
            System.out.println("Hello: I am number " + i);
            i++;
        } while (i > 10);

        System.out.println("************");

        i = 0;
        while (i > 10) {
            if(i==0){
                System.out.println("Entered while loop");
            }
            System.out.println("Hello: I am number " + i);
            i++;

        }
    }


}
