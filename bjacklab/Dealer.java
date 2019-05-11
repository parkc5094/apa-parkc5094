//Name -
//Date -
//Class -
//Lab  - 


//define Dealer class here
public class Dealer extends AbstractPlayer implements Playerable{
        
        
        
//instance variable - Deck 
	//private 
	private Deck d;




//constructors
	public Dealer() {
		super();
		d = new Deck();
		
	}
	public Dealer(int c) {
		super(c);
		d = new Deck();
	}

//method to shuffle

	public void shuffle() {
		d.shuffle();
	}
	
	public Deck getDeck() {
		return d;
	}


//method to deal a card


	public Card deal() {
		return d.nextCard();
	}


//hit method goes here
	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return (getHandValue()<21);
	}
	
}