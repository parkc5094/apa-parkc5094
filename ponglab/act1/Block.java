//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
  private int xPos;
  private int yPos;
  private int width;
  private int height;

  private Color color;

  public Block()
  {
	xPos =0;
	yPos =0;
	width =0;
	height =0;

  }

  //add other Block constructors - x , y , width, height, color
  public Block(int x, int y, int width, int height){
	xPos = x;
	yPos = y;
	this.width = width;
	this.height = height;
  }

  //add the other set methods
  public setX(int x){
	xPos =x;
  }
  public setY(int y){
	yPos =y;
  }

  public void setColor(Color col)
  {


  }

  public void draw(Graphics window)
  {
    //uncomment after you write the set and get methods
    //window.setColor(color);
    //window.fillRect(getX(), getY(), getWidth(), getHeight());
  }

  public void draw(Graphics window, Color col)
  {


  }

  public boolean equals(Object obj)
  {




    return false;
  }

  //add the other get methods
 

  //add a toString() method  - x , y , width, height, color
}
