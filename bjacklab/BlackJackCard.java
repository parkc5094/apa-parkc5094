//Name -
//Date -
//Class -
//Lab  - 

public class BlackJackCard extends Card
{
  //constructors
	public BlackJackCard() {
		super();
	}
	
	public BlackJackCard(int face, String suit) {
		super(face, suit);
	}


  public int getValue()
  {
    //enables you to build the value for the game into the card
    //this makes writing the whole program a little easier


    //return getFace();
	  
	if(getFace() ==1) {
		return 11;
	}
	else if(getFace() ==11 || getFace() ==12 || getFace() == 13) {
		return 10;
	}
	else {
		return getFace();
	}
  }
        
}