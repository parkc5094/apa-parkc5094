//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
  private int xSpeed;
  private int ySpeed;

  public Ball()
  {
    super(200,200);
    xSpeed = 3;
    ySpeed = 1;
  }

  //add the other Ball constructors
  public Ball(int x, int y) {
	  super(x,y);
//	  this.xSpeed = xSpeed;
//	  this.ySpeed = ySpeed;
	  xSpeed =3;
	  ySpeed =1;
  }
  
  public Ball(int x, int y, int width, int height) {
	  super(x, y, width, height);
	  xSpeed = 3;
	   ySpeed = 1;
  }
  
  public Ball(int x, int y, int width, int height, Color col) {
	  super(x, y, width, height, col);
	  xSpeed = 3;
	  ySpeed = 1;
  }
  
  public Ball(int x, int y, int width, int height, Color col, int xSpeed, int ySpeed) {
	  super(x, y, width, height, col);
	  this.xSpeed = xSpeed;
	  this.ySpeed = ySpeed;
  }
  
  //add the set methods
  public void setXSpeed(int xSpeed) {
	  this.xSpeed = xSpeed; 
  }
  public void setYSpeed(int ySpeed) {
	   this.ySpeed = ySpeed; 
  }


  public void moveAndDraw(Graphics window)
  {
    //draw a white ball at old ball location
	draw(window, Color.WHITE);
//	window.setColor(Color.BLUE);
	//window.fillOval(getX(), getY(), getWidth(), getHeight());
    setX(getX()+xSpeed);
    //setY
    setY(getY() + ySpeed);
    //draw the ball at its new location
    draw(window, Color.GREEN);
  }
   
  public boolean equals(Object obj)
  {

	  Ball hello = (Ball) obj;
	  return (getX()== hello.getX() && getY() == hello.getY() && getWidth()==hello.getWidth() && getHeight() == hello.getHeight() && getXSpeed()==hello.getXSpeed() && getYSpeed() == hello.getYSpeed());



//    return false;
  }   

  //add the get methods
  public int getXSpeed(){
		return xSpeed;
  }
  public int getYSpeed(){
		return ySpeed;
  }
  //add a toString() method
  public String toString() {
	  return super.toString() + " "+ getXSpeed() + " " + getYSpeed();
  }
}