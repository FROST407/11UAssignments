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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert Food cost");
        int FoodCost = input.nextInt();
        System.out.println("Please insert DJ cost");
        int DJ = input.nextInt();
        System.out.println("Please insert Hall rent cost");
        int HallRent = input.nextInt();
        System.out.println("Please enter decoration costs");
        int DecoreCost = input.nextInt();
        System.out.println("Please enter staff costs");
        int StaffCost = input.nextInt();
        System.out.println("Please enter miscellaneous cots");
        int MisCost = input.nextInt();
        double Total = FoodCost + DJ + HallRent + DecoreCost + StaffCost + MisCost;
        double FullTotal = Total/35;
        FullTotal =Math.ceil(FullTotal);
        System.out.println("The total is cost " + Total + " you will need to sell " + FullTotal + "to break even" );
        
        
        
    }
}
