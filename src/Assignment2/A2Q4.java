/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Masoa4207
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         City Bingland = new City();
        new Wall(Bingland, 1, 1, Direction.NORTH);
        new Wall(Bingland, 1, 1, Direction.SOUTH);
        new Wall(Bingland, 1, 1, Direction.EAST);
        new Wall(Bingland, 1, 1, Direction.WEST);
        new Wall(Bingland, 2, 2, Direction.WEST);
        new Wall(Bingland, 2, 2, Direction.NORTH);
        new Wall(Bingland, 2, 3, Direction.NORTH);
        new Wall(Bingland, 2, 3, Direction.EAST);
        new Wall(Bingland, 1, 4, Direction.NORTH);
        new Wall(Bingland, 1, 4, Direction.SOUTH);
        new Wall(Bingland, 1, 4, Direction.EAST);
        new Wall(Bingland, 1, 4, Direction.WEST);
        new Wall(Bingland, 3, 2, Direction.SOUTH);
        new Wall(Bingland, 3, 2, Direction.WEST);
        new Wall(Bingland, 3, 3, Direction.SOUTH);
        new Wall(Bingland, 3, 3, Direction.EAST);
        new Wall(Bingland, 4, 1, Direction.SOUTH);
        new Wall(Bingland, 4, 1, Direction.NORTH);
        new Wall(Bingland, 4, 1, Direction.EAST);
        new Wall(Bingland, 4, 1, Direction.WEST);
        new Wall(Bingland, 4, 4, Direction.SOUTH);
        new Wall(Bingland, 4, 4, Direction.NORTH);
        new Wall(Bingland, 4, 4, Direction.EAST);
        new Wall(Bingland, 4, 4, Direction.WEST);
       
        Robot UsaneBolt = new Robot(Bingland, 3,1,Direction.NORTH);
        while (UsaneBolt.frontIsClear()) {
               UsaneBolt.move();
            if(!UsaneBolt.frontIsClear());
               UsaneBolt.turnLeft();
               UsaneBolt.move();
                  UsaneBolt.turnLeft();UsaneBolt.turnLeft();UsaneBolt.turnLeft();
                  UsaneBolt.move();UsaneBolt.move();
                   UsaneBolt.turnLeft();UsaneBolt.turnLeft();UsaneBolt.turnLeft();
                    UsaneBolt.move();UsaneBolt.move();
                    UsaneBolt.turnLeft();UsaneBolt.turnLeft();UsaneBolt.turnLeft();
                    UsaneBolt.move();UsaneBolt.turnLeft();
            
                       
               
               
               
               
               
               
               
               
               
               
               
               
               
        }
        }
        
        
        
        
        
        
        
    }

