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
//after finish
  //to run
  //add folder to build path
  // katie can show me tomorro
  public Block()
  {
	xPos =0;
	yPos =0;
	width =10;
	height =10;
	color = Color.GREEN;
  }

  public Block(int x, int y) {
	  xPos = x;
	  yPos = y;
	  width =0;
	  height =0;
	  color = Color.GREEN;
  }
  //add other Block constructors - x , y , width, height, color
  public Block(int x, int y, int width, int height){
	xPos = x;
	yPos = y;
	this.width = width;
	this.height = height;
	color = Color.GREEN;
//	setColor(Color.BLUE);
  }
  
  public Block(int x, int y, int width, int height, Color col){
		xPos = x;
		yPos = y;
		this.width = width;
		this.height = height;
		color =col;
	  }

  //add the other set methods
  public void setPos(int x, int y) {
	  xPos =x;
	  yPos = y;
  }
  public void setX(int x){
	xPos =x;
  }
  public void setY(int y){
	yPos =y;
  }

  public void setColor(Color col)
  {
	  color = col;

  }
  public void setWeight(int width) {
	  this.width = width;
  }
  public void setHeight(int height) {
	  this.height = height;
  }
  public void draw(Graphics window)
  {
    //uncomment after you write the set and get methods
    window.setColor(color);
    window.fillRect(getX(), getY(), getWidth(), getHeight());
  }

  public void draw(Graphics window, Color col)
  {
	  window.setColor(col);
	  window.fillRect(getX(), getY(), getWidth(), getHeight());

  }

  public boolean equals(Object obj)
  {
	  Block hi = (Block) obj;
	  return (getX()== hi.getX() && getY() == hi.getY() && getWidth()==hi.getWidth() && getHeight() == hi.getHeight());



//    return false;
  }

  //add the other get methods
 
  public int getX(){
		return xPos;
  }
  public int getY(){
		return yPos;
  }
  
  public int getWidth(){
		return width;
  }
  public int getHeight(){
		return height;
  }
  public Color getColor() {
	  return color;
  }
  //add a toString() method  - x , y , width, height, color
  
  public String toString() {
	  return xPos + " " + yPos + " " + width + " " + height + " " + color;
  }
}
