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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // create array to store expenses
        // need 6 spot
        double placeholder = 0;
        int Buck = 10;
        // create array to store name of expenses
        double[] jack = new double[Buck];
        // put names into array
        System.out.println("Please enter 10 intergers");
        jack[0] = input.nextDouble();
        jack[1] = input.nextDouble(); 
        jack[2] = input.nextDouble();
        jack[3] = input.nextDouble();
        jack[4] = input.nextDouble();
        jack[5] = input.nextDouble();
        jack[6] = input.nextDouble();
        jack[7] = input.nextDouble();
        jack[8] = input.nextDouble();
        jack[9] = input.nextDouble();
        for (int x = 0; x < jack.length-1; x++) {   
        for (int y = x+1; y < Buck; y++) {
             if (jack[0] > jack[1]){
                placeholder = jack[0] + placeholder;
                jack[0] = jack[1];
                jack[1] = placeholder;
        }
        }   
        }

        
System.out.println("The integers in ascending order are: " + jack[0] + ", " + jack[1]+", " + jack[2] + ", " + jack[3]+ ", " + jack[4] + ", " + jack[5]+ ", " + jack[6] + ", " + jack[7]+ ", " + jack[8] + " and " + jack[9]);
    }
}