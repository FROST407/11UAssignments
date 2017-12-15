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

    public double intérêtscomposés(double P, double r, double n) {


        double B = P * (Math.pow(1 + r, n));
        System.out.println("The Balance is " + B);
        return B;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A7Q4 test = new A7Q4();
        // To busy TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the principle amount. ");
        double P = input.nextInt();

        System.out.println("Please enter intrest rate. ");
        double r = input.nextInt() / 100.0;
        System.out.println("Please enter the amount of years. ");
        double n = input.nextInt();


        double testing = test.intérêtscomposés(P, r, n);



    }
}
