//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
  private int speed;

  private boolean alive= true;
  
  public Ammo()
  {
    this(0,0,1);
  }

  public Ammo(int x, int y)
  {
	  super(x,y);
	  speed =5;
    //add code
  }

  public Ammo(int x, int y, int s)
  {
	  super(x,y);
	  speed =s;
    //add code
  }

  public void setSpeed(int s)
  {
    //add code
	  speed =s;
  }

  public int getSpeed()
  {
    return speed;
  }

  public void draw( Graphics window )
  {
    //add code to draw the ammo
	  window.setColor(Color.YELLOW);
	  window.fillRect(getX(), getY(), 2, 5);
  }
        
        
  public void move( String direction )
  {
    //add code to draw the ammo
	  if(direction.equals("SPACE")) {
			 setY(getY() - speed);
			 
	  }
  }
  /*
  public void MoveDraw(Graphics window) {
	  
	  window.setColor(Color.BLACK);
	  window.fillRect(getX(), getY(), 2,5);
	  window.setColor(Color.YELLOW);
	  window.fillRect(getX(), getY(), 2, 5);
	  
  }*/

  public boolean didCollide(Alien al) {
	  
	  if(getX() < al.getX() +30 && getX() > al.getX() -30 && getY() == al.getY()) {
	    	//graphToBack.setColor(Color.BLACK);
	    	//graphToBack.fillRect(alienOne.getX(), alienOne.getY(), alienOne.getWidth(), alienOne.getHeight());
	    	kill();
	    	return true;
	    }
	  return false;
	  
  }
  
  public boolean isAlive() {
	  
	  if(getY()<0) {
		  kill();
	  }
	  return alive;
  }
  
  public void kill() {
	  
	  alive = false;
  }
  public String toString()
  {
    return "";
  }
}
