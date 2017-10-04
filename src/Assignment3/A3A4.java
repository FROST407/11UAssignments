/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Masoa4207
 */
public class A3A4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Dunkirk = new City();
        new Wall(Dunkirk, 1, 1, Direction.NORTH);
        new Wall(Dunkirk, 1, 1, Direction.WEST);
        new Wall(Dunkirk, 1, 2, Direction.NORTH);
        new Wall(Dunkirk, 1, 2, Direction.EAST);
        new Wall(Dunkirk, 2, 1, Direction.WEST);
        new Wall(Dunkirk, 2, 1, Direction.SOUTH);
        new Wall(Dunkirk, 2, 2, Direction.SOUTH);
        new Wall(Dunkirk, 2, 2, Direction.EAST);
        new Wall(Dunkirk, 1, 4, Direction.NORTH);
        new Wall(Dunkirk, 1, 4, Direction.WEST);
        new Wall(Dunkirk, 1, 5, Direction.NORTH);
        new Wall(Dunkirk, 1, 5, Direction.EAST);
        new Wall(Dunkirk, 2, 4, Direction.WEST);
        new Wall(Dunkirk, 2, 4, Direction.SOUTH);
        new Wall(Dunkirk, 2, 5, Direction.EAST);
        new Wall(Dunkirk, 2, 5, Direction.SOUTH);
        new Wall(Dunkirk, 4, 1, Direction.NORTH);
        new Wall(Dunkirk, 4, 1, Direction.WEST);
        new Wall(Dunkirk, 4, 2, Direction.NORTH);
        new Wall(Dunkirk, 4, 2, Direction.EAST);
        new Wall(Dunkirk, 5, 1, Direction.WEST);
        new Wall(Dunkirk, 5, 1, Direction.SOUTH);
        new Wall(Dunkirk, 5, 2, Direction.EAST);
        new Wall(Dunkirk, 5, 2, Direction.SOUTH);
        new Wall(Dunkirk, 4, 4, Direction.NORTH);
        new Wall(Dunkirk, 4, 4, Direction.WEST);
        new Wall(Dunkirk, 4, 5, Direction.NORTH);
        new Wall(Dunkirk, 4, 5, Direction.EAST);
        new Wall(Dunkirk, 5, 4, Direction.SOUTH);
        new Wall(Dunkirk, 5, 4, Direction.WEST);
        new Wall(Dunkirk, 5, 5, Direction.SOUTH);
        new Wall(Dunkirk, 5, 5, Direction.EAST);
        Robot Frost = new Robot(Dunkirk, 3, 3, Direction.SOUTH);
        //Frost go forward and turn left do this 16 times. When you reach the points 3,7,11,15
        //when you reach these numbers turn left 3 times
        for (int count = 0; count < 16; count = count + 1) {
            Frost.move();
            Frost.move();
            Frost.move();
            Frost.turnLeft();
            if (count == 3) {
                Frost.turnLeft();
                Frost.turnLeft();
                Frost.turnLeft();
            }
            if (count == 7) {
                Frost.turnLeft();
                Frost.turnLeft();
                Frost.turnLeft();
            }
            if (count == 11) {
                Frost.turnLeft();
                Frost.turnLeft();
                Frost.turnLeft();
            }
            if (count == 15) {
                Frost.turnLeft();
                Frost.turnLeft();
                Frost.turnLeft();
            }

        }
    }
}
