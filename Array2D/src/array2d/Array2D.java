
package array2d;


public class Array2D {

   
    public static void main(String[] args) {
        int[][] array
                = {
                    {3, 6, 1},
                    {7, 2},
                    {0, 2, 8, 4},};
        
        //Για καθε μονοδιαστατο πινακα που βρισκεται μεσα στο array 
        //Για καθε νουμερο στο μονοδιαστατο πινακα εκτυπωσε το μου.

        for (int[] monodiastatoPinaka : array) {
            
            for (int num : monodiastatoPinaka) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        
        System.out.println("********");
        
        int [] numbers = {6,3};
        for(int num :  numbers){
            System.out.println(num+"\t");
        }
    }

}
