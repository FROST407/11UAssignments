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
        System.out.println("Please enter 10 intergers");
        // create array to store name of expenses
        double[] Array = new double[10];
        Array[0] = input.nextDouble();
        Array[1] = input.nextDouble();
        Array[2] = input.nextDouble();
        Array[3] = input.nextDouble();
        Array[4] = input.nextDouble();
        Array[5] = input.nextDouble();
        Array[6] = input.nextDouble();
        Array[7] = input.nextDouble();
        Array[8] = input.nextDouble();
        Array[9] = input.nextDouble();

        // put names into array


        for (int i = 0; i < Array.length; i++) {
            for (int y = i + 1; y < Array.length; y++) {
                if (Array[i] > Array[y]) {
                    placeholder = Array[i];
                    Array[i] = Array[y];
                    Array[y] = placeholder;
                }
            }
        }

        System.out.println("The intergers in asending order are: ");
        for (int i = 0; i < Array.length; i++) {


            if (i != Array.length - 1) {
                System.out.print(Array[i] + ", ");
            } else {
                System.out.print("and " + Array[9]);
            }

        }
    }
}