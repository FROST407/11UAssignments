/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author Masoa4207
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
City Ba = new City();
Robot Ca = new Robot(Ba,1,1,Direction.EAST);       
new Thing(Ba,1,2);new Thing(Ba,1,7);        
new Thing(Ba,1,3);new Thing(Ba,1,8);        
new Thing(Ba,1,4);new Thing(Ba,1,9);        
new Thing(Ba,1,5);new Thing(Ba,1,10);        
new Thing(Ba,1,6);new Thing(Ba,1,11);        
Ca.move();Ca.pickThing();Ca.move();Ca.pickThing();
Ca.move();Ca.pickThing();Ca.move();Ca.pickThing();
Ca.move();Ca.pickThing();Ca.move();Ca.pickThing();
Ca.move();Ca.pickThing();Ca.move();Ca.move();
Ca.move();Ca.move();        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
