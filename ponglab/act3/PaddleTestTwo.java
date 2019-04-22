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

public class PaddleTestTwo extends Canvas implements KeyListener, Runnable
{
  private Ball ball;
  private Paddle leftPaddle;
  private Paddle rightPaddle;
  private boolean[] keys;		//keeps track of what keys are pressed

  public PaddleTestTwo()
  {
    //set up all game variables


    //instantiate a Ball
	
	  ball = new Ball();
	  //ball = new Ball(50,20,10,10,Color.BLUE, 2,2);
		
    //instantiate a left Paddle
	//int x, int y, int width, int height, Color col, int speed
	/*leftPaddle = new Paddle();
	leftPaddle = new Paddle(5,10);
	leftPaddle = new Paddle(10,15, 10);
	leftPaddle = new Paddle(20,30,10,30, 15);*/
	leftPaddle = new Paddle(10,0, 10,200, 5);
	rightPaddle = new Paddle(780,0,10,200,5);
	


    keys = new boolean[5];


    //set up the Canvas
    setBackground(Color.WHITE);
    setVisible(true);

    this.addKeyListener(this);
    new Thread(this).start();
  }
	
  public void update(Graphics window)
  {
    paint(window);
  }

  public void paint(Graphics window)
  {
    ball.moveAndDraw(window);
    leftPaddle.draw(window);

    if (!(ball.getX()>=10 && ball.getX()<=550))
    {
      ball.setXSpeed(-ball.getXSpeed());
    }

    if (!(ball.getY()>=10 && ball.getY()<=450))
    {
      ball.setYSpeed(-ball.getYSpeed());
    }

    if (keys[0] && leftPaddle.getY() <=450)
    {
      //move left paddle up and draw it on the window
      leftPaddle.moveUpAndDraw(window);
    }
    if (keys[1] /*&& leftPaddle.getY() >=10*/)
    {
      //move left paddle down and draw it on the window
    	leftPaddle.moveDownAndDraw(window);

    }
    if (keys[2]/*&& rightPaddle.getY() <=450*/)
    {
    	rightPaddle.moveUpAndDraw(window);
    }
    if (keys[3]/*&& rightPaddle.getY() >=10*/)
    {
    	rightPaddle.moveDownAndDraw(window);
    }
  }

  public void keyPressed(KeyEvent e)
  {
    switch (toUpperCase(e.getKeyChar()))
    {
    case 'W' : keys[0]=true; break;
    case 'Z' : keys[1]=true; break;
    case 'I' : keys[2]=true; break;
    case 'M' : keys[3]=true; break;
    }
  }

  public void keyReleased(KeyEvent e)
  {
    switch(toUpperCase(e.getKeyChar()))
    {
    case 'W' : keys[0]=false; break;
    case 'Z' : keys[1]=false; break;
    case 'I' : keys[2]=false; break;
    case 'M' : keys[3]=false; break;
    }
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
	Thread.currentThread().sleep(8);
	repaint();
      }
    }catch(Exception e)
    {
    }
  }		
}