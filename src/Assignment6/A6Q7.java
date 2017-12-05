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
        Scanner input = new Scanner(System.in);

        int AmtNum = 999;

        double[] Numbers = new double[AmtNum];

        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = i + 2;
        }

        for (int i = 2; i < Numbers.length; i++) {
            for (int j = 3; j < 10; j++) {


                if (i * j == Numbers[i] && i != j) {
                    Numbers[i] = 0;
                }
            }
        }


        System.out.println("The prime numbers from 2-1000 are ");
        for (int i = 0; i < Numbers.length; i++) {
            System.out.println(Numbers[i] + ", ");

        }
    }
}
