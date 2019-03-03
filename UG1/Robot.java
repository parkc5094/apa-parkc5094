//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
  public Robot()    //constructor method - sets up the class
  {
    setSize(800,600);
    setBackground(Color.WHITE);   	
    setVisible(true);
  }
  
  public void paint( Graphics window )
  {
    window.setColor(Color.BLUE);
    
    window.drawString("Robot LAB ", 35, 35 );
    
    head();
    
    upperBody();
    
    lowerBody();
  }
  
  public void head( Graphics window )
  {
    window.setColor(Color.YELLOW);
    
    window.fillOval(300, 100, 200, 100);
    

    window.drawOval(300, 100,200,100);
    
  }

  public void upperBody( Graphics window )
  {
     window.setColor(Color.BLUE);
     
     window.fillRect(300, 200, 200,100);
    //add more code here
  }

  public void lowerBody( Graphics window )
  {

    window.setColor(Color.YELLOW);
    
    window.fill Rect(300, 300, 200,100);
  }
}
