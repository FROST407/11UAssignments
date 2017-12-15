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
public class A7Q5 {

    private void chaotic(int amtoflines) {






        Scanner input = new Scanner(System.in);
        int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;




        for (int j = 0; j < amtoflines; j++) {
            for (int i = 0; i < randNum; i++) {
                System.out.print("*");

            }
            System.out.println("");
            randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q5 test = new A7Q5();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter amount of lines you would like for asterisks ");




        int amtoflines = input.nextInt();
        test.chaotic(amtoflines);





















    }
}