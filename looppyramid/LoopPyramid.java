/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looppyramid;

/**
 *
 * @author Vagos
 */
public class LoopPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pyramid();
        
    }
    
    static void pyramid(){
        
        for(int i =8; i>=1; i--){
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       
    }
}
