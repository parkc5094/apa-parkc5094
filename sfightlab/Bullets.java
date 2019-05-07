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

public class Bullets
{
  private List<Ammo> ammo;
  private int size;

  public Bullets()
  {
	  ammo = new ArrayList<Ammo>();
	  size = ammo.size();
  }

  public void add(Ammo al)
  {
	  ammo.add(al);
  }

  public int getSize() {
	  
//	  return size;
	  return ammo.size();
  }
  /*
  public Ammo getAmmo(int j) {
	  return ammo.get(j);
  }
  */
  
  //post - draw each Ammo
  public void drawEmAll( Graphics window )
  {
	  for(Ammo a: ammo) {
		  a.draw(window);
	  }
  }

  public void moveEmAll()
  {
	  for(Ammo a:ammo) {
		  a.move("SPACE");
	  }
  }

  public void cleanEmUp()
  {
	  for(int i=0; i<ammo.size(); i++) {
		  
		  if(!ammo.get(i).isAlive())
			  ammo.remove(i);
	  }
  }

  public List<Ammo> getList()
  {
    return ammo;
  }

  public String toString()
  {
    return "";
  }
}
