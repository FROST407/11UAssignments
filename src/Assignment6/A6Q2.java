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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter amount of people who are averaging their height");
        int AmtStudents = input.nextInt();

        double[] TotalStudents = new double[AmtStudents];
        System.out.println("Please enter heights in centmeters");
        for (int i = 0; i < TotalStudents.length; i++) {
            // asking for an expense
            System.out.println("How high is Person " + (i + 1) + "?");
            // storing the expense
            TotalStudents[i] = input.nextDouble();
        }
        double total = 0;
        // go through each expense
        for (int i = 0; i < TotalStudents.length; i++) {
            // add expense to total
            total = total + TotalStudents[i];
        }
        double Scatman = total / AmtStudents;
        Scatman = Math.round(Scatman);
        System.out.println("The average is " + Scatman + "cm");
    }
}
