/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpractice;

/**
 *
 * @author Vagos
 */
public class ClassPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        calc.x=5;
        calc.y=3;
        if(calc.x >calc.y){
            System.out.println(calc.multi());
            System.out.println(calc.sum());
         
        }
        
    }
    
}
