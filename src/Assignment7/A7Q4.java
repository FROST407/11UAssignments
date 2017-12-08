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
public class A7Q4 {
public int intérêtscomposés (int principle){
    Scanner input = new Scanner(System.in);
    int B = 0;
    System.out.println("Please enter intrest rate. ");
    int r = input.nextInt();
    System.out.println("Please enter the amount of years. ");
    int n = input.nextInt();
     System.out.println("Please enter the principle amount again. ");
        int P = input.nextInt();
        B = P*(1+r)^n; 
    
            return 0;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A7Q4 test = new A7Q4();
        // To busy TODO code application logic here
          Scanner input = new Scanner(System.in);
          System.out.println("Please enter the principle amount. ");
        int P = input.nextInt();
        test.intérêtscomposés(P);
        
        
       
    }
}
