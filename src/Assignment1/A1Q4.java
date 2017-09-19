/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Masoa4207
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Junkertown = new City();
        new Wall(Junkertown, 0, 1, Direction.WEST);
        new Wall(Junkertown, 1, 1, Direction.WEST);
        new Wall(Junkertown, 1, 1, Direction.SOUTH);
        Robot Junkrat = new Robot(Junkertown, 0, 0, Direction.SOUTH);
        Robot Roadhog = new Robot(Junkertown, 0, 1, Direction.SOUTH);       
        Junkrat.move();
        Roadhog.move();
        Roadhog.turnLeft();
        Junkrat.move();
        Roadhog.move();
        Roadhog.turnLeft();
        Roadhog.turnLeft();
        Roadhog.turnLeft();
        Roadhog.move();
        Roadhog.turnLeft();
        Roadhog.turnLeft();
        Roadhog.turnLeft();
        Junkrat.turnLeft();
        Roadhog.move();
        Junkrat.move();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
