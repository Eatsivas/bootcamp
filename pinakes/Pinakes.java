
package pinakes;


public class Pinakes {

   
    public static void main(String[] args) {
        int[] [] array1 = new int [4] [2];
        int array2 [] = new int[4] ;
        int array3 [] = {4,-2,8,10};
        int array4 [][] = 
        {
            {4,8,1,-8},
            {20,23},
            {34},
            {9,7,7,0,-3,-6,1}
        };
       int lengthPinaka = array4.length;
       for(int row=0; row<array4.length; row++){
           for(int column=0; column<array4[row].length; column++){
           System.out.print(array4[row][column]+" ");
           }
           System.out.println();
       }
//        System.out.println("");
//        System.out.println("lengthPinaka :" +lengthPinaka);
//        System.out.println("array4[0][1]= " + array4[0][1]);
//        for(boolean num : array){
//            System.out.println(num + " ");
//        }
     }
    
}
