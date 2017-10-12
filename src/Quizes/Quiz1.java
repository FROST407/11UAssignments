/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Masoa4207
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();

        // Hire a miner(Create a robot)
        Robot Karen = new Robot(kitchener, 2, 2, Direction.EAST);
        //Dig into a cave(Build walls)
        new Wall(kitchener, 2, 2, Direction.WEST);
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener, 2, 4, Direction.SOUTH);
        new Wall(kitchener, 2, 5, Direction.NORTH);
        new Wall(kitchener, 2, 5, Direction.SOUTH);
        new Wall(kitchener, 2, 6, Direction.NORTH);
        new Wall(kitchener, 2, 6, Direction.SOUTH);
        new Wall(kitchener, 2, 6, Direction.EAST);
        //Theres gold in dem darn hills(Create things)
        new Thing(kitchener, 2, 4);
        new Thing(kitchener, 2, 5);
        new Thing(kitchener, 2, 6);
        new Thing(kitchener, 2, 7);
        //Tell the miner to recover a lump of gold one at a time and bring it back to the exit of the cave
        while (Karen.frontIsClear()) {
            Karen.move();
            if (Karen.canPickThing()) {
                Karen.pickThing();
                Karen.turnLeft();
                Karen.turnLeft();

                while (Karen.frontIsClear()) {
                    Karen.move();
                }
                Karen.putThing();
                Karen.turnLeft();
                Karen.turnLeft();

            }
        }
        //Once the cave is cleared out head back to the exit for your share
        if (!Karen.frontIsClear() && !Karen.canPickThing()) {
            Karen.turnLeft();
            Karen.turnLeft();
            while (Karen.frontIsClear()) {
                Karen.move();
            }
            Karen.turnLeft();
            Karen.turnLeft();

        }

    }
}
