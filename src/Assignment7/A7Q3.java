/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author Masoa4207
 */
public class A7Q3 {
public static void factorizer(int factor){
    for (int i = 1; i <= factor; i++) {
        
    
 if (factor%i==0) {
     System.out.println(i+',');   
 }
 }
 

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A7Q3 test = new A7Q3();
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
          System.out.println("Please enter a number you would like to be factorized. ");
        int theinput = input.nextInt();
        test.factorizer(theinput);
        
    }
}
