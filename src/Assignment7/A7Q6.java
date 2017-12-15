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
public class A7Q6 {

    public double lastdigit(int theNumber) {
        if (theNumber < 0) {
            double otherdigits1 = theNumber / 10;
            double otherdigits2 = otherdigits1 * 10;
            double otherdigits3 = theNumber - otherdigits2;
            double lastdigit = otherdigits3 - otherdigits3 * 2;

            System.out.println("The last digit of " + theNumber + " is " + lastdigit);
        } else {
            double otherdigits1 = theNumber / 10;
            double otherdigits2 = otherdigits1 * 10;
            double lastdigit = theNumber - otherdigits2;
            System.out.println("The last digit of " + theNumber + " is " + lastdigit);
        }
        return 0;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A7Q6 test = new A7Q6();
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number that you would like to get the last digit from ");
        int theNumber = input.nextInt();
        test.lastdigit(theNumber);

    }
}
