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
public class A7Q2 {

    public int HAL(int Exam) {
        if (Exam < 50) {
            System.out.println("Your mark exam is F");
        }
        if (Exam >= 50 && Exam < 59) {
            System.out.println("Your mark exam is D");
        }
        if (Exam >= 60 && Exam < 69) {
            System.out.println("Your mark exam is C");
        }
        if (Exam >= 70 && Exam < 79) {
            System.out.println("Your mark exam is B");
        }

        if (Exam >= 80) {
            System.out.println("Your exam mark is A");
        }

        return 0;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A7Q2 test = new A7Q2();
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter exam mark.");
        int Mark = input.nextInt();
        test.HAL(Mark);

    }
}
