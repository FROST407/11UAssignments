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
public class EXAMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] expenses = new double[6];
        String[] expenseNames = new String[6];
        expenseNames[0] = "Food";
        expenseNames[1] = "DJ";
        expenseNames[2] = "Hall Rental";
        expenseNames[3] = "Decorations";
        expenseNames[4] = "Staff Fees";
        expenseNames[5] = "Miscellaneous";
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("How much does the " + expenseNames[i] + " cost?");
            expenses[i] = input.nextDouble();
        }
        double total = 0;
        for (int i = 0; i < expenses.length; i++) {
            total = total + expenses[i];
        }
        int tickets = (int) Math.ceil(total / 35);
        System.out.println("Prom will cost " + total);
        System.out.println("You will need to sell " + tickets + " tickets");
    }
}
