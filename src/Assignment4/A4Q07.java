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
public class A4Q07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        double Player = 1;

        while (Player <= 100) {


            System.out.println("Please sum of dice.");
            double move1 = input.nextInt();

            Player = Player + move1;
            if (move1 == 1) {
                System.out.println("You cannot get a one with two dice.");
                Player= Player - 1;
            }
            if(move1 >12){
                System.out.println("You cannot get a higher number than twelve with two dice.");
            break;    
            }
                if (move1 == 0) {
                System.out.println("You quit!");
                break;
            }
            
            
            if (Player == 9.0) {
                Player = 34.0;
            }
            if (Player == 40.0) {
                Player = 64.0;
            }
            if (Player == 54.0) {
                Player = 19.0;
            }
            if (Player == 67.0) {
                Player = 86.0;
            }
            if (Player == 90.0) {
                Player = 48.0;
            }
            if (Player == 99.0) {
                Player = 77.0;
            }
            if (Player == 100.0) {
            System.out.println("You won!");
            break;
            }
            System.out.println("You are now on square " + Player);

        }
        
        if (Player > 100) {
            System.out.println("You lost.");            
            }



































    }
}
