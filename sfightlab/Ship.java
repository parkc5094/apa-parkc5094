//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
  private int speed;
  private Image image;

  public Ship()
  {
    this(50,400,100,100,10);
  }

  public Ship(int x, int y)
  {
    //add code here
	  super(x,y);
  }

  public Ship(int x, int y, int s)
  {
    //add code here
	  super(x,y);
	  speed = s;
  }

  public Ship(int x, int y, int w, int h, int s)
  {
    super(x, y, w, h);
    speed=s;
    try
    {
      URL url = getClass().getResource("ship.jpg");
      image = ImageIO.read(url);
    }
    catch(Exception e)
    {
      //feel free to do something here
    	System.out.println("error");
    }
  }


  public void setSpeed(int s)
  {
    //add more code
	  speed=s;
  }

  public int getSpeed()
  {
    return speed;
  }

  public void move(String direction)
  {
    //add code here
	 if(direction.equals("UP")) {
		 if (getY() <= 0)
			 setY(0);
		 else
			 setY(getY() - speed);
		 
	 }
	 else if(direction.equals("DOWN")) {
		 if (getY() >= 450)
			 setY(450);
		 else
		 setY(getY() +speed);
	 }
	 else if(direction.equals("LEFT")) {
		 if (getX() <= 0)
			setX(0);
		else
			setX(getX() - speed);
	 }
	 else if(direction.equals("RIGHT")){
		 if (getX() >= 700)
			setX(700);
		else
		 setX(getX() + speed);
	 }
	  
  }

  public void draw( Graphics window )
  {
    window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
  }

  public String toString()
  {
    return super.toString() + getSpeed();
  }
}
