/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author Masoa4207
 */
public class Methods {

    
    public void sayHello(String name){
    System.out.println("Hello " + name);
    }
    
    public void addFive(int a)
    
    public double areaOfRect(double length, double widith){
     double answer = length * widith;
     return answer;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create an object to run my methods
        Methods test = new Methods();
        //Create a scanner for input
      Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        //Sotre their name
       String name = input.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Please enter the length and widith of a rectange");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double area = test.areaOfRect(a,b);
        int num =10;
        test.addFive()
    }
}
