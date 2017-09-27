/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Masoa4207
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Bingland = new City();
        new Wall(Bingland, 2, 0, Direction.SOUTH);
        new Wall(Bingland, 2, 0, Direction.EAST);
        new Wall(Bingland, 2, 1, Direction.SOUTH);
        new Wall(Bingland, 2, 1, Direction.EAST);
        new Wall(Bingland, 2, 2, Direction.SOUTH);
        new Wall(Bingland, 2, 3, Direction.SOUTH);
        new Wall(Bingland, 2, 3, Direction.EAST);
        new Wall(Bingland, 2, 4, Direction.SOUTH);
        new Wall(Bingland, 2, 5, Direction.SOUTH);
        new Wall(Bingland, 2, 6, Direction.SOUTH);
        new Wall(Bingland, 2, 6, Direction.EAST);
        new Wall(Bingland, 2, 7, Direction.SOUTH);
        new Wall(Bingland, 2, 8, Direction.SOUTH);
        new Thing(Bingland,2,8);
        Robot UsaneBolt = new Robot(Bingland, 2, 0, Direction.EAST);

        while (!UsaneBolt.canPickThing()) {
            if (UsaneBolt.frontIsClear()) {
                UsaneBolt.move();
            } else {
                UsaneBolt.turnLeft();
                UsaneBolt.move();
                UsaneBolt.turnLeft();
                UsaneBolt.turnLeft();
                UsaneBolt.turnLeft();
                UsaneBolt.move();
                 UsaneBolt.turnLeft();
                UsaneBolt.turnLeft();
                UsaneBolt.turnLeft();
                UsaneBolt.move();
                UsaneBolt.turnLeft();
            }
        }












    }
}
