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

/**
 *
 * @author Masoa4207
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         City England = new City();
        new Wall(England, 4,2,  Direction.WEST);
        new Wall(England, 4,2,  Direction.NORTH);
        new Wall(England, 3,3, Direction.WEST);
         new Wall(England, 2,3, Direction.WEST);
         new Wall(England, 2,3, Direction.NORTH);
         new Wall(England, 2, 3, Direction.EAST);
         new Wall(England, 4,2,  Direction.WEST);
         new Wall(England, 3,4,  Direction.NORTH);
         new Wall(England, 3,4,  Direction.EAST);
         new Wall(England, 4,4,  Direction.EAST);
         Robot Frost = new Robot(England, 4, 0, Direction.EAST);  
         new Thing(England, 4, 1);
         Frost.move();
         Frost.pickThing();
         Frost.turnLeft();
         Frost.move();
         Frost.turnLeft();
         Frost.turnLeft();
         Frost.turnLeft();
         Frost.move();
         Frost.turnLeft();
         Frost.move();
         Frost.move();
         Frost.turnLeft();
         Frost.turnLeft();
         Frost.turnLeft();
         Frost.move();
         Frost.putThing();
         Frost.move();
         Frost.turnLeft();
         Frost.turnLeft();
         Frost.turnLeft();
         Frost.move();
         Frost.turnLeft();
         Frost.move();
         Frost.turnLeft();
         Frost.turnLeft();
         Frost.turnLeft();
         Frost.move();
         Frost.move();
         Frost.turnLeft();
         Frost.move();
         
    }
}
