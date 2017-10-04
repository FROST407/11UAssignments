/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author Masoa4207
 */
public class A3A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City England = new City();
        England.showThingCounts(true);
        new Thing(England, 0, 0);
        new Thing(England, 0, 0);
        new Thing(England, 0, 0);
        new Thing(England, 0, 0);
        new Thing(England, 0, 0);
        new Thing(England, 0, 0);
        new Thing(England, 0, 0);
        new Thing(England, 0, 0);
        new Thing(England, 0, 0);
        new Thing(England, 0, 0);
        Robot Nick = new Robot(England, 0, 0, Direction.EAST);
        //Nick take one log and move it infront of you do this ten times
        for (int count = 0; count < 10; count = count + 1) {

            Nick.pickThing();
            Nick.move();
            Nick.putThing();
            Nick.turnLeft();
            Nick.turnLeft();
            Nick.move();
            Nick.turnLeft();
            Nick.turnLeft();
        }












    }
}
