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
public class A4Q06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the speed limt");
        double speedLimit = input.nextInt();
        System.out.println("Please enter your speed");
        double Speed = input.nextInt();
        double speed = Speed - speedLimit;
        if (speed < 0) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        if (speed > 20 && speed < 20) {
         System.out.println("You are speeding and your fine is $100.");
        }
        if (speed > 21 && speed < 30) {
            System.out.println("You are speeding and your fine is $270.");
        }
        if (speed >= 31) {
            System.out.println("You are speeding and your fine is $500.");
        }




















    }
}
