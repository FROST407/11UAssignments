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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // create array to store expenses
        // need 6 spot
        double placeholder = 0;
        System.out.println("Please enter the amount of intergers you would like to use.");
        int AmtIntergers = input.nextInt();
       System.out.println("Please enter "+ AmtIntergers +" intergers");
        // create array to store name of expenses
        double[] Intergers = new double[AmtIntergers];
       
       for (int i = 0; i < Intergers.length; i++) {
            // asking for an expense
           
            // storing the expense
            Intergers[i] = input.nextDouble();
        }
      


        for (int i = 0; i < Intergers.length; i++) {
            for (int y = i + 1; y < Intergers.length; y++) {
                if (Intergers[i] > Intergers[y]) {
                    placeholder = Intergers[i];
                    Intergers[i] = Intergers[y];
                    Intergers[y] = placeholder;
                }
            }
        }

        
        System.out.println("The intergers in asending order are: ");
        for (int i = 0; i < Intergers.length; i++) {


            if (i != Intergers.length - 1) {
                System.out.print(Intergers[i] + ", ");
            } else {
                System.out.print("and " + Intergers[i]);
            }

        }
    }
}
