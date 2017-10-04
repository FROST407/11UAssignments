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
public class A3A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City England = new City();
        Robot Frost = new Robot(England, 1, 1, Direction.EAST, 20);
        //Nick use the seeds in your backpack to plant seeds. Plant seeds until
        //you reach avenue 5 turn around and go below the seeds you planted and 
        //plant untill you reach avenue 1 repeat this process 4 times
        int moveCounter = 0;
        while (moveCounter < 4) {
            moveCounter = moveCounter + 1;

            Frost.putThing();
            Frost.move();
            Frost.putThing();
            Frost.move();
            Frost.putThing();
            Frost.move();
            Frost.putThing();
            Frost.move();
            Frost.putThing();
            if (Frost.getAvenue() == 1) {
                Frost.turnLeft();
                Frost.move();
                Frost.turnLeft();
            }
            if (Frost.getAvenue() == 5) {
                Frost.turnLeft();
                Frost.turnLeft();
                Frost.turnLeft();
                Frost.move();
                Frost.turnLeft();
                Frost.turnLeft();
                Frost.turnLeft();
            }


        }

    }
}
