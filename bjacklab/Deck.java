//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
  public static final int NUMFACES = 13;
  public static final int NUMSUITS = 4;
  public static final int NUMCARDS = 52;

  public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

  private int topCardIndex;
  private ArrayList<Card> stackOfCards;

  public Deck ()
  {
    //initialize data - stackOfCards - topCardIndex
	  //stackOfCards = new ArrayList<Card>();
	  stackOfCards = new ArrayList<Card>();
	  
	  topCardIndex = 52;
			  
	  for(int i=0; i< NUMSUITS; i++) {
		  
		  for(int j = 1; j<=NUMFACES; j++) {
			  stackOfCards.add(new BlackJackCard(j, SUITS[i]));
			  
		  }
	  }
	  
	  //System.out.println(stackOfCards);
    //loop through suits
    //loop through faces
    //add in a new card
                
  }

  //modifiers
  public void shuffle ()
  {
    //shuffle the deck
    //reset variables as needed
	  Collections.shuffle(stackOfCards);
	  topCardIndex = 52; 
  }

  //accessors
  public int size ()
  {
    return 0;
  }

  public int numCardsLeft()
  {
    return topCardIndex;
  }

  public Card nextCard()
  {
	  topCardIndex --;
    return stackOfCards.get(topCardIndex);
  }

  public String toString()
  {
    return stackOfCards + "   topCardIndex = " + topCardIndex;
  } 
}