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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City Berlin = new City();
        new Wall(Berlin, 1, 2, Direction.NORTH);    
        new Wall(Berlin, 1, 2, Direction.SOUTH);    
        new Wall(Berlin, 1, 2, Direction.EAST);    
        new Wall(Berlin, 1, 1, Direction.NORTH);    
        new Wall(Berlin, 1, 1, Direction.WEST);    
        new Wall(Berlin, 2, 1, Direction.WEST);
        new Wall(Berlin, 2, 1, Direction.SOUTH);
        new Thing(Berlin, 2, 2);
        
        Robot Frost = new Robot(Berlin, 1, 2, Direction.SOUTH);
        Frost.turnLeft();Frost.turnLeft();Frost.turnLeft();Frost.move();
 Frost.turnLeft();
        Frost.move();
   
        Frost.turnLeft();
        
        Frost.move();
        Frost.pickThing();
        Frost.turnLeft();Frost.turnLeft();
        Frost.move();
        Frost.turnLeft();Frost.turnLeft();Frost.turnLeft();
          Frost.move();Frost.turnLeft();Frost.turnLeft();
        Frost.turnLeft();   Frost.move();
    }
}
        
    