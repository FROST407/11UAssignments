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
public class A7Q7 {

    public void firstdigit(int theNumber) {

        double orginalNum = theNumber;
        if (theNumber < 0) {
            while (theNumber < -10) {
                theNumber = theNumber / 10;

            }
            theNumber = theNumber * -1;
            System.out.println("The first digit of " + orginalNum + " is " + theNumber);
        } else {
            while (theNumber > 10) {
                theNumber = theNumber / 10;

            }
            System.out.println("The first digit of " + orginalNum + " is " + theNumber);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A7Q7 test = new A7Q7();
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number that you would like to get the last digit from ");
        int theNumber = input.nextInt();
        test.firstdigit(theNumber);

    }
}
