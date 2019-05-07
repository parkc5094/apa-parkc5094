//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
  private Ship ship;
  private Alien alienOne;
  private Alien alienTwo;
  
  private Alien alienThree;
  private Alien alienFour;
  private Alien alienFive;
  private Alien alienSix;
  private Alien alienSeven;
  
  private Ammo am;
  
  /* uncomment once you are ready for this part
   *
   private AlienHorde horde;
   private Bullets shots;
  */

  private AlienHorde horde;
  private Bullets shots;
  
  private boolean[] keys;
  private BufferedImage back;
  

  public OuterSpace()
  {
    setBackground(Color.black);

    keys = new boolean[5];

    //instantiate other instance variables
    //Ship, Alien
    
    ship = new Ship();
    
    
    alienOne = new Alien(0,0,30,30,1);
    alienTwo = new Alien(50,0,30,30,1);
    
    alienThree = new Alien(100, 0,30,30,1);
    alienFour = new Alien(150, 0,30,30,1);
    alienFive = new Alien(200, 0,30,30,1);
    alienSix = new Alien(250, 0,30,30,1);
    alienSeven = new Alien(300, 0,30,30,1);
    
    horde = new AlienHorde(10);
    shots =  new Bullets();
    am = new Ammo();
    
    shots.add(am);
    
    horde.add(alienOne);
    horde.add(alienTwo);
    
    horde.add(alienThree);
    horde.add(alienFour);
    horde.add(alienFive);
    horde.add(alienSix);
    horde.add(alienSeven);
    
    
    this.addKeyListener(this);
    new Thread(this).start();

    setVisible(true);
  }

  public void update(Graphics window)
  {
    paint(window);
  }

  public void paint( Graphics window )
  {
    //set up the double buffering to make the game animation nice and smooth
    Graphics2D twoDGraph = (Graphics2D)window;

    //take a snap shop of the current screen and same it as an image
    //that is the exact same width and height as the current screen
    if(back==null)
      back = (BufferedImage)(createImage(getWidth(),getHeight()));

    //create a graphics reference to the back ground image
    //we will draw all changes on the background image
    Graphics graphToBack = back.createGraphics();

    graphToBack.setColor(Color.BLUE);
    graphToBack.drawString("StarFighter ", 25, 50 );
    graphToBack.setColor(Color.BLACK);
    graphToBack.fillRect(0,0,800,600);

   
    /*
    am.draw(window);
    am.move("UP");
    */
    
    if(keys[0] == true)
    {
      ship.move("LEFT");
    }
    if(keys[1] == true) {
    	ship.move("RIGHT");
    }
    if(keys[2] == true) {
    	ship.move("UP");
    }
    if(keys[3] == true) {
    	ship.move("DOWN");
    }
    if(keys[4] == true) {
    	Ammo a = new Ammo(ship.getX() + 50, ship.getY(), 5);
    	//am.move("SPACE");
    	//amfired = true;
    	//add shot
    	shots.add(a);
    	keys[4] = false;
    }
    //>>add code to move Ship, Alien, etc.
    /*
    if(amfired = true && am.getY()>0) {
    	//amfired = true;
    	am.move("SPACE");
    }
    else if(am.getY()<=0) {
    	System.out.println("0000");
    	amfired =false;
    	am.setX(ship.getX() +50);
    	am.setY(ship.getY());
    }*/

    
    /*
    alienOne.draw(graphToBack);
    alienTwo.draw(graphToBack);
    */
    
//horde
    
    //horde.add(alienOne);
    //horde.add(alienTwo);
    
    horde.drawEmAll(graphToBack);
    //boolean hi = true;
    
    ship.draw(graphToBack);
    horde.moveEmAll();
    
    horde.removeDeadOnes(shots.getList());
    //shots.cleanEmUp();
    
    //if()
    
//ammo
    am.draw(graphToBack);
    am.move("SPACE");
    
    shots.drawEmAll(graphToBack);
    shots.moveEmAll();

    
    //alienOne.move("RIGHT");
    //alienTwo.move("LEFT");
    
    //add in collision detection to see if Bullets hit the Aliens 
    
    /*
    if(am.getX() < alienOne.getX() +30 && am.getX() > alienOne.getX() -30 && am.getY() == alienOne.getY()) {
    	//graphToBack.setColor(Color.BLACK);
    	//graphToBack.fillRect(alienOne.getX(), alienOne.getY(), alienOne.getWidth(), alienOne.getHeight());
    	alienOne = new Alien();
    }
    */
    
    //horde.removeDeadOnes(shots);
    
    //and if Bullets hit the Ship


    twoDGraph.drawImage(back, null, 0, 0);
  }


  public void keyPressed(KeyEvent e)
  {
    if (e.getKeyCode() == KeyEvent.VK_LEFT)
    {
      keys[0] = true;
    }
    if (e.getKeyCode() == KeyEvent.VK_RIGHT)
    {
      keys[1] = true;
    }
    if (e.getKeyCode() == KeyEvent.VK_UP)
    {
      keys[2] = true;
    }
    if (e.getKeyCode() == KeyEvent.VK_DOWN)
    {
      keys[3] = true;
    }
    if (e.getKeyCode() == KeyEvent.VK_SPACE)
    {
      keys[4] = true;
    }
    repaint();
  }

  public void keyReleased(KeyEvent e)
  {
    if (e.getKeyCode() == KeyEvent.VK_LEFT)
    {
      keys[0] = false;
    }
    if (e.getKeyCode() == KeyEvent.VK_RIGHT)
    {
      keys[1] = false;
    }
    if (e.getKeyCode() == KeyEvent.VK_UP)
    {
      keys[2] = false;
    }
    if (e.getKeyCode() == KeyEvent.VK_DOWN)
    {
      keys[3] = false;
    }
    if (e.getKeyCode() == KeyEvent.VK_SPACE)
    {
      keys[4] = false;
    }
    repaint();
  }

  public void keyTyped(KeyEvent e)
  {
    //no code needed here
  }

  public void run()
  {
    try
    {
      while(true)
      {
        Thread.currentThread().sleep(5);
        repaint();
      }
    }catch(Exception e)
    {
    }
  }
}

