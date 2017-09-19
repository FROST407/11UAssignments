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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
City Tokyo = new City();
Robot L = new Robot(Tokyo,0,1,Direction.WEST);     
Robot Light = new Robot(Tokyo,3,3,Direction.EAST);
L.setLabel("L");
Light.setLabel("Light");
new Wall(Tokyo,2,3,Direction.WEST);      
new Wall(Tokyo,2,3,Direction.NORTH);
new Wall(Tokyo,2,3,Direction.EAST);        
new Wall(Tokyo,3,3,Direction.EAST);        
new Wall(Tokyo,3,3,Direction.SOUTH);        
new Thing(Tokyo,0,0);
new Thing(Tokyo,1,0);
new Thing(Tokyo,1,1);
new Thing(Tokyo,1,2);
new Thing(Tokyo,2,2);
Light.turnLeft();
Light.turnLeft();
Light.move();
L.move();
L.pickThing();
Light.turnLeft();
Light.turnLeft();
Light.turnLeft();
Light.move();
Light.pickThing();
L.turnLeft();
L.move();
L.pickThing();
Light.move();
Light.pickThing();
L.turnLeft();
L.move();
L.pickThing();
Light.turnLeft();




        
        
    }
}
