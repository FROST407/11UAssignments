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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter four numbers on seperate lines");
        int Number1 = input.nextInt();
        int Number2 = input.nextInt();
        int Number3 = input.nextInt();
        int Number4 = input.nextInt();
        double Lumber1 = 2.54 * Number1;
        double Lumber2 = 2.54 * Number2;
        double Lumber3 = 2.54 * Number3;
        double Lumber4 = 2.54 * Number4;
        System.out.println("Your numbers were " + Lumber1 + "," + Lumber2 + "," + Lumber3 + " and " + Lumber4);

    }
}
