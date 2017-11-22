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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // create array to store expenses
        // need 6 spot
        double placeholder = 0;
        // create array to store name of expenses
        double[] jack = new double[2];
        // put names into array
        System.out.println("Please enter 2 intergers");
        jack[0] = input.nextDouble();
        jack[1] = input.nextDouble();
        for (int i = 0; i < jack.length-1; i++) {   
        for (int y = i+1; y < 10; y++) {
             if (jack[0] > jack[1]){
                placeholder = jack[0] + placeholder;
                jack[0] = jack[1];
                jack[1] = placeholder;
             }
        }
        }
            System.out.println("The integers in ascending order are: "+ jack[0]+ ", "+jack[1] );
    

        
    }
}