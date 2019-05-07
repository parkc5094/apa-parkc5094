//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;

public abstract class AbstractPlayer implements Playerable
{
  private ArrayList<Card> hand;
  private int winCount;

  //constructors
  
  public AbstractPlayer(){
	  hand = new ArrayList<Card>();
	  winCount =0;
  }
  
  public AbstractPlayer(int c) {
	  
	  hand = new ArrayList<Card>();
	  winCount = c;
  }
  
  public  void addCardToHand( Card temp )
  {

	  hand.add(temp);
  }

  public  void resetHand( )
  {
	  hand.remove();

  }

  public  void setWinCount( int numwins )
  {
	  winCount = numwins;

  }

  public int getWinCount() { 
	  return 0; 
	  }

  public int getHandSize() { 
	  return 0; 
	  }

  public int getHandValue()
  {
    //great example of polymorphism
    int total=0;







    return total;
  }

  public String toString()
  {
    return "hand = " + hand.toString() + " \n-  # wins " + winCount;
  }
}