//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable
{
  private Ball ball;

  public BallTestTwo()
  {
    setBackground(Color.WHITE);
    setVisible(true);

    //instantiate a new Ball
    ball = new Ball();
    ball = new Ball(20,20);
    ball = new Ball(40,40,10,10);
    ball = new Ball(50,20,10,10, Color.BLUE);
    ball = new Ball(50,30,10,10,Color.BLACK, 4,5);

 //   hi.draw(window);
 //   hi.moveAndDraw(window);
 
    //test the Ball thoroughly
  //  Ball hi1 = new Ball(100, 100);
    //hi1.draw(window);
  //  hi1.moveAndDraw(window);
    //test all constructors
/*
 *     Ball hi1 = new Ball(100, 100);
    Ball hi2 = new Ball(10,27, 40,30);
    Ball hi3 = new Ball(20,20, 40,40, Color.BLUE);
    Ball hi4 = new Ball(30,40, 10,10, Color.BLUE, 5,5);
*/
    new Thread(this).start();
  }
	
  public void update(Graphics window)
  {
    paint(window);
  }

  public void paint(Graphics window)
  {
    ball.moveAndDraw(window);

    if(!(ball.getX()>=10 && ball.getX()<=550))
    {
      ball.setXSpeed(-ball.getXSpeed());
    }

    if(!(ball.getY()>=10 && ball.getY()<=450))
    {
      ball.setYSpeed(-ball.getYSpeed());
    }
  }
	
  public void run()
  {
    try
    {
      while(true)
      {
	Thread.currentThread().sleep(19);
	repaint();
      }
    }catch(Exception e)
    {
    }
  }	
}