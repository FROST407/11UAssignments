/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author Masoa4207
 */
public class A4Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter four numbers on seperate lines");
        double Number1 = input.nextDouble();
        double Number2 = input.nextDouble();
        double Number3 = input.nextDouble();
        double Number4 = input.nextDouble();
       
        System.out.println("Your numbers were " + Number1 + ", " + Number2 + ", " + Number3 + " and " + Number4);

    }
}
