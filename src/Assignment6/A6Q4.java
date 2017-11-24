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
        double[] jack = new double[10];
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

        // put names into array


        for (int i = 0; i < jack.length; i++) {
            for (int y = i + 1; y < jack.length; y++) {
                if (jack[i] > jack[y]) {
                    placeholder = jack[i];
                    jack[i] = jack[y];
                    jack[y] = placeholder;
                }
            }
        }

        System.out.println("The intergers in asending order are: ");
        for (int i = 0; i < jack.length; i++) {


            if (i != jack.length - 1) {
                System.out.print(jack[i] + ", ");
            } else {
                System.out.print("and " + jack[9]);
            }

        }
    }
}