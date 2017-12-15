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
public class A7Q8 {

    public boolean neVer(int theNumber) {
        int gonNa = theNumber;
        int giVe = theNumber;
        int yoU = theNumber;
        boolean uP = true;
        while (theNumber > 10) {


            if (theNumber % 2 == 0) {

                return false;
            }
            theNumber = theNumber / 10;

        }
        while (giVe > 10) {
            giVe = giVe / 10;
            if (giVe % 2 == 0) {
                return false;
            }
        }
        if (gonNa >= 0) {
            double lEt = gonNa / 10;
            double yOu = lEt * 10;
            double doWn = gonNa - yOu;
            if (doWn % 2 == 0) {
                return false;
            }
        }

        return true;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A7Q8 test = new A7Q8();
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number that you would like to test for odd digits. ");
        int Rick = input.nextInt();
        boolean roll = test.neVer(Rick);
        System.out.println(roll);




    }
}
