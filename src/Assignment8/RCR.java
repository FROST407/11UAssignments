/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class RCR
        extends JComponent {

    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    String title = "BLAZE";
    long desiredFPS = 60L;
    long desiredTime = 1000L / desiredFPS;
    Rectangle player = new Rectangle(120, 120, 20, 50);
    int playerDX = 0;
    int playerDY = 0;
    Rectangle[] RainAlpha = new Rectangle[10];
    int RainAlpha0YD = 1;
    int RainSpeeed1 = 3;
    int RainSpeeed2 = 5;
    int RainSpeeed3 = 4;
    int gravity = 1;
    Rectangle[] blocks = new Rectangle[17];
    Rectangle[] blocks2 = new Rectangle[14];
    Rectangle[] blocks3 = new Rectangle[2];
    Rectangle[] MenuBlocks = new Rectangle[1];
    Rectangle[] blocks4 = new Rectangle[1];
    boolean left = false;
    boolean right = false;
    boolean jump = false;
    boolean Menu = true;
    boolean Level1 = false;
    boolean Level2 = false;
    boolean Level3 = false;
    boolean Level4 = false;
    boolean Rain = false;
    boolean lockdoor1 = true;
    boolean lockdoor2 = true;
    boolean lockdoor3 = true;
    boolean onGround = false;
    Rectangle Ladder = new Rectangle(680, 130, 20, 100);
    Rectangle Ladder1 = new Rectangle(280, 560, 20, 20);
    Rectangle Ladder2 = new Rectangle(400, 560, 20, 20);
    Rectangle Ladder3 = new Rectangle(520, 560, 20, 20);
    Rectangle Ladder4 = new Rectangle(280, 430, 20, 20);
    Rectangle redBrick = new Rectangle(440, 560, 80, 20);
    Rectangle greenBrick = new Rectangle(120, 120, 50, 20);
    Rectangle exitBlock = new Rectangle(780, 400, 600, 300);
    Rectangle redBrick2 = new Rectangle(0, 600, 800, 50);
    Rectangle Hallway = new Rectangle(0, 100, 800, 100);
    Rectangle exitBlock2 = new Rectangle(780, 0, 600, 600);
    Rectangle exitBlock3 = new Rectangle(780, 0, 20, 600);
    Rectangle Dial1 = new Rectangle(320, 540, 40, 240);
    Rectangle Dial2 = new Rectangle(360, 520, 40, 40);
    Rectangle Dial3 = new Rectangle(420, 540, 40, 40);

    public RCR() {
        JFrame frame = new JFrame(title);

        setPreferredSize(new Dimension(800, 600));

        frame.add(this);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(3);
        frame.pack();

        frame.setVisible(true);

        frame.addKeyListener(new Keyboard());
        RCR.Mouse m = new Mouse();

        addMouseMotionListener(m);
        addMouseWheelListener(m);
        addMouseListener(m);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(0, 0, 800, 600);

        Font biggerFont = new Font("arial", 1, 42);
        g.setFont(biggerFont);
        g.setColor(Color.lightGray);
        g.fillRect(295, 100, 150, 150);
        g.setColor(Color.RED);
        g.drawString("RCE", 300, 150);
        Font SmallerFont = new Font("arial", 1, 32);
        g.setFont(SmallerFont);
        g.drawString("Start(N)", 300, 200);

        if (Level1) {
            g.clearRect(0, 0, 800, 600);
            g.setColor(Color.blue);

            g.fillRect(0, 0, 800, 600);
            g.setColor(Color.gray);
            g.fillRect(100, 20, 600, 600);
            g.fillRect(700, 400, 600, 100);





            g.setColor(Color.darkGray);
            for (int i = 0; i < blocks.length; i++) {
                g.fillRect(blocks[i].x, blocks[i].y, blocks[i].width, blocks[i].height);
            }



            g.setColor(Color.yellow);
            g.fillRect(Ladder.x, Ladder.y, Ladder.width, Ladder.height);
            g.fillRect(Ladder1.x, Ladder1.y, Ladder1.width, Ladder1.height);
            g.fillRect(Ladder2.x, Ladder2.y, Ladder2.width, Ladder2.height);
            g.fillRect(Ladder3.x, Ladder3.y, Ladder3.width, Ladder3.height);
            g.fillRect(Ladder4.x, Ladder4.y, Ladder4.width, Ladder4.height);
        }

        if (player.intersects(redBrick)) {
            g.setColor(Color.green);
            g.fillRect(greenBrick.x, greenBrick.y, greenBrick.width, greenBrick.height);
        }


        if (Level1) {

            g.setColor(Color.RED);
            g.fillRect(440, 560, 80, 20);
        }


        if (player.intersects(exitBlock)) {
            Level2 = true;
            Level1 = false;
            player.x = 120;
            player.y = 120;
        }
        if (Level2) {
            g.clearRect(0, 0, 800, 600);
            g.setColor(Color.lightGray);
            g.fillRect(0, 0, 800, 600);
            g.setColor(Color.GREEN);
            g.fillRect(player.x, player.y, player.width, player.height);
        }






        if (Level2) {
            g.setColor(Color.darkGray);
            for (int i = 0; i < blocks2.length; i++) {
                g.fillRect(blocks2[i].x, blocks2[i].y, blocks2[i].width, blocks2[i].height);
            }
        }




        if (Level3) {
            g.clearRect(0, 0, 800, 600);
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 800, 600);
            g.setColor(Color.blue);

            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(0, 100, 800, 100);
            g.setColor(Color.gray);
            for (int i = 0; i < blocks3.length; i++) {
                g.fillRect(blocks3[i].x, blocks3[i].y, blocks3[i].width, blocks3[i].height);
            }
        }









        if (Level1) {
            g.setColor(Color.GREEN);
            g.fillRect(player.x, player.y, player.width, player.height);

            g.setFont(SmallerFont);
            g.setColor(Color.RED);
            g.drawString("4", 182, 330);
        }
        if (Level2) {
            g.setFont(biggerFont);
            g.setColor(Color.blue);
            g.drawString("0", 500, 290);
        }
        if (Level3) {
            g.setColor(Color.GREEN);
            g.fillRect(player.x, player.y, player.width, player.height);


            g.setFont(SmallerFont);
            g.setColor(Color.GREEN);
            g.drawString("7", 80, 160);
        }
        if (Level2) {

            g.setColor(Color.GREEN);
            g.fillRect(player.x, player.y, player.width, player.height);
        }


        if (Level4) {
            g.clearRect(0, 0, 800, 600);
            g.setColor(Color.blue);
            g.fillRect(0, 0, 800, 600);
            g.setColor(Color.RED);
            g.drawString("ENTER CODE", 300, 150);
            g.setFont(SmallerFont);
            g.drawString("EXIT", 700, 380);
        }
        if (Level4) {
            g.setColor(Color.WHITE);
            g.fillRect(Dial1.x, Dial1.y, Dial1.width, Dial1.height);
            g.fillRect(Dial2.x, Dial2.y, Dial2.width, Dial2.height);
            g.fillRect(Dial3.x, Dial3.y, Dial3.width, Dial3.height);
            g.setColor(Color.RED);
            g.setFont(SmallerFont);
            g.drawString("EXIT", 700, 380);
        }

        if (Level4) {
            g.setColor(Color.darkGray);
            for (int i = 0; i < blocks4.length; i++) {
                g.fillRect(blocks4[i].x, blocks4[i].y, blocks4[i].width, blocks4[i].height);
            }
        }



        if (Level4) {
            g.setColor(Color.GREEN);
            g.fillRect(player.x, player.y, player.width, player.height);

            player.x = 25;
            player.y = 500;
        }
        g.setColor(Color.GREEN);
        g.fillRect(player.x, player.y, player.width, player.height);

        if (Level3) {
            g.setColor(Color.blue);
            for (int i = 0; i < RainAlpha.length; i++) {
                g.fillRect(RainAlpha[i].x, RainAlpha[i].y, RainAlpha[i].width, RainAlpha[i].height);
            }
        }

        if (Level4) {
            g.setColor(Color.darkGray);
            g.fillRect(700, 0, 100, 480);
            if (lockdoor1) {
                g.fillRect(700, 480, 20, 100);
            }
            if (lockdoor2) {
                g.fillRect(743, 480, 20, 100);
            }
            if (lockdoor3) {
                g.fillRect(780, 480, 20, 100);
            }
            g.setColor(Color.RED);
            g.setFont(SmallerFont);
            g.drawString("EXIT", 710, 380);
        }




        if (Menu) {

            g.setColor(Color.BLUE);
            g.fillRect(0, 0, 266, 600);
        }
    }

    public void preSetup() {
        blocks[0] = new Rectangle(100, 580, 600, 100);

        blocks[1] = new Rectangle(100, 130, 580, 20);

        blocks[2] = new Rectangle(100, 20, 600, 20);

        blocks[3] = new Rectangle(100, 20, 20, 700);

        blocks[4] = new Rectangle(700, 20, 20, 400);

        blocks[5] = new Rectangle(700, 500, 20, 1200);

        blocks[6] = new Rectangle(180, 230, 525, 20);

        blocks[7] = new Rectangle(700, 400, 600, 20);

        blocks[8] = new Rectangle(700, 500, 600, 20);

        blocks[9] = new Rectangle(120, 270, 20, 20);

        blocks[10] = new Rectangle(180, 230, 20, 265);

        blocks[11] = new Rectangle(140, 250 + player.y, 40, 20);

        blocks[12] = new Rectangle(120, 475, 40, 20);

        blocks[13] = new Rectangle(300, 350, 20, 265);

        blocks[14] = new Rectangle(420, 370, 20, 265);

        blocks[15] = new Rectangle(540, 390, 20, 265);

        blocks[16] = new Rectangle(180, 350, 90, 20);

        blocks2[0] = new Rectangle(0, 200, 200, 20);

        blocks2[1] = new Rectangle(0, 100, 150, 20);

        blocks2[2] = new Rectangle(200, 190, 35, 900);
        blocks2[3] = new Rectangle(300, 190, 35, 900);
        blocks2[4] = new Rectangle(400, 190, 35, 900);
        blocks2[5] = new Rectangle(500, 190, 35, 900);
        blocks2[6] = new Rectangle(600, 190, 35, 900);
        blocks2[7] = new Rectangle(700, 190, 35, 900);
        blocks2[8] = new Rectangle(800, 190, 200, 20);

        blocks2[9] = new Rectangle(0, 0, 800, 20);

        blocks2[10] = new Rectangle(0, 0, 20, 100);
        blocks2[11] = new Rectangle(0, 200, 20, 600);


        blocks2[12] = new Rectangle(780, 0, 20, 100);
        blocks2[13] = new Rectangle(780, 200, 20, 600);
        blocks3[0] = new Rectangle(0, 100, 800, 20);
        blocks3[1] = new Rectangle(0, 200, 800, 20);
        MenuBlocks[0] = new Rectangle(player.x + 2, player.y + 20, player.width + 10, 10);
        blocks4[0] = new Rectangle(0, 580, 800, 100);

        RainAlpha[0] = new Rectangle(400, 0, 5, 5);
        RainAlpha[1] = new Rectangle(350, 0, 5, 5);
        RainAlpha[2] = new Rectangle(543, 0, 5, 5);
        RainAlpha[3] = new Rectangle(250, 0, 5, 5);
        RainAlpha[4] = new Rectangle(3, 0, 5, 5);
        RainAlpha[5] = new Rectangle(60, 0, 5, 5);
        RainAlpha[6] = new Rectangle(20, 0, 5, 5);
        RainAlpha[7] = new Rectangle(700, 0, 5, 5);
        RainAlpha[8] = new Rectangle(600, 0, 5, 5);
        RainAlpha[9] = new Rectangle(745, 0, 5, 5);
    }

    public void run() {
        preSetup();



        boolean done = false;
        while (!done) {
            long startTime = System.currentTimeMillis();



            RainAlpha[0].y += RainAlpha0YD * RainSpeeed1;
            RainAlpha[1].y += RainAlpha0YD * RainSpeeed2;
            RainAlpha[2].y += RainAlpha0YD * RainSpeeed3;
            RainAlpha[3].y += RainAlpha0YD * RainSpeeed2;
            RainAlpha[4].y += RainAlpha0YD * RainSpeeed1;
            RainAlpha[5].y += RainAlpha0YD * RainSpeeed3;
            RainAlpha[6].y += RainAlpha0YD * RainSpeeed1;
            RainAlpha[7].y += RainAlpha0YD * RainSpeeed3;
            RainAlpha[8].y += RainAlpha0YD * RainSpeeed2;
            RainAlpha[9].y += RainAlpha0YD * RainSpeeed3;
            for (int i = 0; i < 6; i++) {

                if (RainAlpha[i].y > 600) {
                    RainAlpha[i].y = 0;
                }
            }
            if (Level1) {

                if (player.intersects(exitBlock)) {
                    player.x = 120;
                    player.y = 120;
                }
            }


            if (right) {
                playerDX = 3;
            } else if (left) {
                playerDX = -3;
            } else {
                playerDX = 0;
            }


            if ((onGround) && (jump)) {

                playerDY = -15;

                onGround = false;
            }
            if (((player.intersects(Ladder)) && (jump)) || ((player.intersects(Ladder1)) && (jump)) || ((player.intersects(Ladder2)) && (jump)) || ((player.intersects(Ladder3)) && (jump)) || ((player.intersects(Ladder4)) && (jump))) {
                playerDY = -20;

                onGround = false;
            }


            playerDY += gravity;


            player.x += playerDX;
            player.y += playerDY;


            onGround = false;


            if (Level1) {

                for (int i = 0; i < blocks.length; i++) {
                    if (player.intersects(blocks[i])) {
                        int cHeight = Math.min(blocks[i].y + blocks[i].height, player.y + player.height) - Math.max(blocks[i].y, player.y);
                        int cWidth = Math.min(blocks[i].x + blocks[i].width, player.x + player.width) - Math.max(blocks[i].x, player.x);


                        if (cWidth < cHeight) {

                            if (player.x < blocks[i].x) {
                                player.x -= cWidth;
                            } else {
                                player.x += cWidth;
                            }

                            playerDX = 0;

                        } else if (player.y < blocks[i].y) {
                            player.y -= cHeight;


                            if (playerDY >= 0) {
                                playerDY = 0;

                                onGround = true;
                            }
                        } else {
                            player.y += cHeight;
                        }
                    }
                }
            }


            if (Menu) {

                for (int i = 0; i < MenuBlocks.length; i++) {
                    if (player.intersects(MenuBlocks[i])) {
                        int cHeight = Math.min(MenuBlocks[i].y + MenuBlocks[i].height, player.y + player.height) - Math.max(MenuBlocks[i].y, player.y);
                        int cWidth = Math.min(MenuBlocks[i].x + MenuBlocks[i].width, player.x + player.width) - Math.max(MenuBlocks[i].x, player.x);


                        if (cWidth < cHeight) {

                            if (player.x < MenuBlocks[i].x) {
                                player.x -= cWidth;
                            } else {
                                player.x += cWidth;
                            }

                            playerDX = 0;

                        } else if (player.y < MenuBlocks[i].y) {
                            player.y -= cHeight;


                            if (playerDY >= 0) {
                                playerDY = 0;

                                onGround = true;
                            }
                        } else {
                            player.y += cHeight;
                        }
                    }
                }
            }


            if (Level2) {

                for (int i = 0; i < blocks2.length; i++) {
                    if (player.intersects(blocks2[i])) {
                        int cHeight = Math.min(blocks2[i].y + blocks2[i].height, player.y + player.height) - Math.max(blocks2[i].y, player.y);
                        int cWidth = Math.min(blocks2[i].x + blocks2[i].width, player.x + player.width) - Math.max(blocks2[i].x, player.x);


                        if (cWidth < cHeight) {

                            if (player.x < blocks2[i].x) {
                                player.x -= cWidth;
                            } else {
                                player.x += cWidth;
                            }

                            playerDX = 0;

                        } else if (player.y < blocks2[i].y) {
                            player.y -= cHeight;


                            if (playerDY >= 0) {
                                playerDY = 0;

                                onGround = true;
                            }
                        } else {
                            player.y += cHeight;
                        }
                    }
                }
            }


            if (Level3) {

                for (int i = 0; i < blocks3.length; i++) {
                    if (player.intersects(blocks3[i])) {
                        int cHeight = Math.min(blocks3[i].y + blocks3[i].height, player.y + player.height) - Math.max(blocks3[i].y, player.y);
                        int cWidth = Math.min(blocks3[i].x + blocks3[i].width, player.x + player.width) - Math.max(blocks3[i].x, player.x);


                        if (cWidth < cHeight) {

                            if (player.x < blocks3[i].x) {
                                player.x -= cWidth;
                            } else {
                                player.x += cWidth;
                            }

                            playerDX = 0;

                        } else if (player.y < blocks3[i].y) {
                            player.y -= cHeight;


                            if (playerDY >= 0) {
                                playerDY = 0;

                                onGround = true;
                            }
                        } else {
                            player.y += cHeight;
                        }
                    }
                }
            }


            if (Level4) {

                for (int i = 0; i < blocks4.length; i++) {
                    if (player.intersects(blocks4[i])) {
                        int cHeight = Math.min(blocks4[i].y + blocks4[i].height, player.y + player.height) - Math.max(blocks4[i].y, player.y);
                        int cWidth = Math.min(blocks4[i].x + blocks4[i].width, player.x + player.width) - Math.max(blocks4[i].x, player.x);


                        if (cWidth < cHeight) {

                            if (player.x < blocks4[i].x) {
                                player.x -= cWidth;
                            } else {
                                player.x += cWidth;
                            }

                            playerDX = 0;

                        } else if (player.y < blocks4[i].y) {
                            player.y -= cHeight;


                            if (playerDY >= 0) {
                                playerDY = 0;

                                onGround = true;
                            }
                        } else {
                            player.y += cHeight;
                        }
                    }
                }
            }


            if ((!Menu) && ((player.x > 800) || (player.x < 0) || (player.y > 600) || (player.y < 0) || (player.intersects(redBrick)))) {
                player.x = 120;
                player.y = 120;
            }


            if (Level2) {
                if (player.intersects(redBrick2)) {
                    player.x = 120;
                    player.y = 120;
                }
                if ((player.x > 800) || (player.x < 0) || (player.y > 600) || (player.y < 0)) {
                    player.x = 120;
                    player.y = 120;
                }
            }


            if ((Level2)
                    && (player.intersects(exitBlock2))) {
                Level3 = true;
                Level2 = false;

                player.x = 100;
                player.y = 120;
            }


            if (Level3) {

                if (player.intersects(exitBlock3)) {
                    Level4 = true;
                    Level3 = false;
                    Menu = false;
                    Level1 = false;
                    Level2 = false;
                }
            }




            repaint();



            long deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    Thread.sleep(1L);
                } else {
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception localException) {
            }
        }
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
            // determine the key
            int key = e.getKeyCode();
            // figure out which key
            if (key == KeyEvent.VK_RIGHT) {
                right = true;
            } else if (key == KeyEvent.VK_LEFT) {
                left = true;
            } else if (key == KeyEvent.VK_SPACE) {
                jump = true;
            } else if (key == KeyEvent.VK_N) {
                Level1 = true;
                Menu = false;
            }
            if (key == KeyEvent.VK_4) {
                lockdoor1 = false;

            }
            if (key == KeyEvent.VK_0) {
                lockdoor2 = false;
            }
            if (key == KeyEvent.VK_7) {
                lockdoor3 = false;
            }
            if (!lockdoor3) {
                if (key == KeyEvent.VK_RIGHT) {
                    Level4 = false;
                    Menu = true;
                }
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            // determine the key
            int key = e.getKeyCode();
            // figure out which key
            if (key == KeyEvent.VK_RIGHT) {
                right = false;
            } else if (key == KeyEvent.VK_LEFT) {
                left = false;
            } else if (key == KeyEvent.VK_SPACE) {
                jump = false;
            }
        }
    }

    public static void main(String[] args) {
        RCR game = new RCR();


        game.run();
    }
}
