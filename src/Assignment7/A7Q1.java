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
public class A7Q1 {

    public double john(int Rad) {
        double ANS = Math.pow(Rad, 2) * Math.PI;

        System.out.println(ANS);
        return ANS;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A7Q1 test = new A7Q1();
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius to caclulate circle ");
        int Radius = input.nextInt();
        test.john(Radius);

    }
}
