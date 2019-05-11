//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Scanner;



//define Player class here 
public class Player extends AbstractPlayer implements Playerable
{
	//private ArrayList<Card> hand;
	//private int winCount;
	
	//constructors
	public Player() {
		super();
	}
	public Player(int c) {
		super(c);
	}
	/* polymorphism???
	public int getHandValue(){
		return 0;
		
	}*/
	//hit method goes here
	
	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return (getHandValue()<21);
	}
}


