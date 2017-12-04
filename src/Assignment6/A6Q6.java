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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // create array to store expenses
        // need 6 spot
        double placeholder = 0;
        System.out.println("Please enter the amount of students in your class.");
        int AmtIntergers = input.nextInt();
     
           
        
       System.out.println("Please enter the "+ AmtIntergers +" student scores");
        
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
        System.out.println("The highest mark in the class is ");
        System.out.println(Intergers[Intergers.length-1]);
        System.out.println("The lowest mark in the class is ");
        System.out.println(Intergers[0]);
        double Total=0;
        for (int i = 0; i < Intergers.length; i++) {
            // add expense to total
            Total = Total + Intergers[i];
        }
      
     double Total1 = Total/AmtIntergers;
    
        System.out.println("and the averge is " + Total1);
        
       
    }
}
