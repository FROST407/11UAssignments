/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Masoa4207
 */
public class ExampleA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City England = new City();
        Robot Nick = new Robot(England, 1, 1, Direction.EAST);
        int moveCounter = 0;
        while (moveCounter < 10) {
            moveCounter = moveCounter + 1;
            Nick.move();
            moveCounter = moveCounter + 1;
        }
        Nick.turnLeft();
        Nick.turnLeft();

        for (int count = 0; count < 2; count = count + 1) {
        }
    }
}