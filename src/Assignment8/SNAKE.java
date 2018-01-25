/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author Masoa4207
 */
public class SNAKE extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    int ballSize = 25;
    Rectangle ball = new Rectangle(WIDTH / 2 - ballSize / 2, HEIGHT / 2 - ballSize / 2, ballSize, ballSize);
    int pacmanX = 50;
    boolean ballUp1 = false;
    boolean ball1Down = false;
    boolean ballRight1 = false;
    boolean ball1Left = false;
    int gameSpeed = 5;
    Font biggerFont = new Font("arial", Font.BOLD, 42);
    int[] foodHolder = new int[100];
    
    // GAME VARIBLES END HERE   

    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public SNAKE() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!

      
            // GAME DRAWING GOES HERE
            g.setColor(Color.blue);

            g.fillRect(0, 0, WIDTH, HEIGHT);
            g.setColor(Color.red);
            g.fillRect(0, 0, WIDTH - 780, HEIGHT);
            g.fillRect(0, 0, WIDTH, HEIGHT - 580);
            g.fillRect(0, HEIGHT - 20, WIDTH, HEIGHT - 580);
            g.fillRect(WIDTH - 20, 0, WIDTH - 780, HEIGHT);
            g.setFont(biggerFont);
            if (ball.y >= HEIGHT - 40 || ball.y <= 15 || ball.x >= WIDTH - 40 || ball.x <= 15) {
                g.drawString("Game Over", WIDTH / 2 - 100, HEIGHT / 2);
              
            }
            g.setColor(Color.yellow);
            g.fillRect(ball.x, ball.y, ball.width, ball.height);
            // GAME DRAWING ENDS HERE
        
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        
        for (int i = 0; i < foodHolder.length; i++) {
                 foodHolder[i] = new Rectangle(WIDTH / 2 - ballSize / 2, HEIGHT / 2 - ballSize / 2, ballSize, ballSize);
        }
        
        
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            if (ballUp1) {
                ball.y = ball.y - 5;
            } else if (ball1Down) {
                ball.y = ball.y + 5;
            }
            if (ballRight1) {
                ball.x = ball.x + 5;
            } else if (ball1Left) {
                ball.x = ball.x - 5;
            }



            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
            // store the key being pressed
            int key = e.getKeyCode();
            // determine which key it is
            if (key == KeyEvent.VK_W) {
                ballUp1 = true;
            } else if (key == KeyEvent.VK_S) {
                ball1Down = true;
            }
            if (key == KeyEvent.VK_D) {
                ballRight1 = true;
            } else if (key == KeyEvent.VK_A) {
                ball1Left = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            // store the key being pressed
            int key = e.getKeyCode();
            // determine which key it is
            if (key == KeyEvent.VK_W) {
                ballUp1 = false;
            } else if (key == KeyEvent.VK_S) {
                ball1Down = false;
            }
            if (key == KeyEvent.VK_D) {
                ballRight1 = false;
            } else if (key == KeyEvent.VK_A) {
                ball1Left = false;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        SNAKE game = new SNAKE();

        // starts the game loop
        game.run();
    }
}
