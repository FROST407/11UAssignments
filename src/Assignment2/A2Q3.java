/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Masoa4207
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City England = new City();
        Robot Frost = new Robot(England, 6, 12, Direction.WEST);
        //Frost check your avenue if you are above your home go down if you are below go up
        //then look to your street if you are left of your street go right if you are right go left
        //and stop when you reach your house
        while (Frost.getAvenue() <= 0 && Frost.getDirection() != Direction.SOUTH) {
            Frost.turnLeft();
        }
        while (Frost.getAvenue() > 0 && Frost.getDirection() != Direction.NORTH) {
            Frost.turnLeft();
        }
        while (Frost.getStreet() > 0) {
            Frost.move();
        }
        while (Frost.getStreet() < 0) {
            Frost.move();
        }
        while (Frost.getStreet() <= 0 && Frost.getDirection() != Direction.WEST) {
            Frost.turnLeft();
        }
        while (Frost.getStreet() > 0 && Frost.getDirection() != Direction.EAST) {
            Frost.turnLeft();
        }
        while (Frost.getAvenue() != 0 || Frost.getStreet() != 0) {
            Frost.move();
        }





    }
}
