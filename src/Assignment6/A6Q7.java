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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        int AmtNum = 1001;

        int[] Numbers = new int[AmtNum];

        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = i + 2;
        }


        for (int k = 0; k < Numbers.length; k++) {
            if (Numbers[k] != 0) {
                int PrimeNumbers = Numbers[k];

                for (int i = 2; i * PrimeNumbers < Numbers.length; i++) {
                    Numbers[i * PrimeNumbers - 2] = 0;

                }
            }
        }





        System.out.println("The prime numbers from 2-1000 are ");


        for (int i = 0; i < 1001; i++) {
            if (Numbers[i] != 0) {


                System.out.println(Numbers[i] + ", ");
            }
        }

    }
}
