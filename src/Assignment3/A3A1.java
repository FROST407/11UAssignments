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
public class A3A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City England = new City();
        new Wall(England, 1, 2, Direction.NORTH);
        new Wall(England, 2, 2, Direction.EAST);
        new Wall(England, 2, 1, Direction.WEST);
        new Wall(England, 2, 1, Direction.SOUTH);
        new Wall(England, 2, 2, Direction.SOUTH);
        new Wall(England, 1, 2, Direction.EAST);
        new Wall(England, 1, 1, Direction.WEST);
        new Wall(England, 1, 1, Direction.NORTH);
        Robot Nick = new Robot(England, 0, 1, Direction.EAST);
        //Nick go around the sqaure two times 
        for (int count = 0; count < 8; count = count + 1) {
            Nick.move();
            Nick.move();
            Nick.turnLeft();
            Nick.turnLeft();
            Nick.turnLeft();
            Nick.move();
        }



    }
}
