//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
  private List<Alien> aliens;
  
  private boolean right=true;
  private boolean down=false;
	
  //private Image image;

  public AlienHorde(int size)
  {
	  aliens = new ArrayList <Alien>(size);
  }
  
  public int getSize()
  {
	  return aliens.size();
  }
  public void add(Alien al)
  {
	  aliens.add(al);
  }

  public void drawEmAll( Graphics window )
  {
	  for(Alien a: aliens) {
		  //window.drawImage(image,a.getX(),a.getY(),a.getWidth(),a.getHeight(),null);
		  a.draw(window);
	  }
  }

  public void moveEmAll()
  {
	  
	  for (Alien a : aliens) {
		  
		  if (right && (a.getX() <= 800)) {
			  a.move("RIGHT");
		  }
		  else if (!right && (a.getX() <= 0)) {
			  right = true;
			  a.move("RIGHT");
		  }
		  else {
			  right = false;
			  a.move("LEFT");
		  }
		  
		  
		  
	  }
	  
	  
	  
			

	  
  }
	  
	  

  public void removeDeadOnes(List<Ammo> shots)
  {
	  /*
	  for(Ammo a: shots) {
		  
		  for(int i=0; i<aliens.size(); i++) {
			  
			  if(a.getX() < aliens.get(i).getX() +30 && a.getX() > aliens.get(i).getX() -30 && a.getY() == aliens.get(i).getY()) {
			    	//graphToBack.setColor(Color.BLACK);
			    	//graphToBack.fillRect(alienOne.getX(), alienOne.getY(), alienOne.getWidth(), alienOne.getHeight());
			    	aliens.remove(i);
			   }
		  }
	  }*/
	  
	  for(int i=0; i< getSize(); i++) {
		  
		  for(int j=0; j< shots.size(); j++) {
			  if(shots.get(j).didCollide(aliens.get(i))){
				  aliens.remove(i);
				  i=0;
				  break;
			  }
		  }
	  }
	  
  }

  public String toString()
  {
    return "";
  }
}
