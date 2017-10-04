/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author Masoa4207
 *
 *
 *
 *
 *
 *
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        /**
         * Demonstrate how to use the Robots
         *
         * @author lamon
         */
        /**
         * @param args the command line arguments
         */
        // create a new city called kicthener
        City kitchener = new City();

        // create a robot
        Robot karel = new Robot(kitchener, 0, 2, Direction.WEST);

        // create a wall and a thing to interact withHorVER
        Wall wall = new Wall(kitchener, 2, 1, Direction.WEST);
        Wall waal = new Wall(kitchener, 1, 1, Direction.NORTH);
        Wall wawl = new Wall(kitchener, 1, 1, Direction.WEST);
        Wall waawl = new Wall(kitchener, 1, 2, Direction.NORTH);
        Wall wafl = new Wall(kitchener, 2, 2, Direction.EAST);
        Wall walw = new Wall(kitchener, 2, 1, Direction.SOUTH);
        Wall well = new Wall(kitchener, 2, 2, Direction.SOUTH);
        Wall wal = new Wall(kitchener, 1, 2, Direction.EAST);
//Go around the square once
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();














    }
}
