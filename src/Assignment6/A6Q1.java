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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter amount of student");
        int AmtStudents = input.nextInt();

        double[] TotalStudents = new double[AmtStudents];
        System.out.println("Please enter student marks");
        for (int i = 0; i < TotalStudents.length; i++) {
            // asking for an expense
            System.out.println("How much did student " + (i + 1) + " student score? ");
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
        System.out.println("The average is " + Scatman + "%");
    }
}
