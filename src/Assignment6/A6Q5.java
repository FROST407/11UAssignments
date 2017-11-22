/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author Masoa4207
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // create array to store expenses
        // need 6 spot
        double placeholder = 0;
        System.out.println("Please enter the amount of intergers you would like to use.");
        int Buck = input.nextInt();
        // create array to store name of expenses
        double[] jack = new double[Buck];
        // put names into array
        System.out.println("Please enter "+ Buck +" intergers");
        jack[Buck-1] = input.nextDouble();
        
        for (int i = 0; i < Buck-1; i++) {
            if (jack[i] > jack[i+1]) {
                placeholder = jack[i] + placeholder;
                jack[i] = jack[i + 1];
                jack[i + 1] = placeholder;
            }
        }
        System.out.println("The integers in ascending order are: " + jack[0] + ", " + jack[1]+", " + jack[2] + ", " + jack[3]+ ", " + jack[4] + ", " + jack[5]+ ", " + jack[6] + ", " + jack[7]+ ", " + jack[8] + " and " + jack[9]);

    }
}
