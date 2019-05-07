//Name -
//Date -
//Class -
//Lab  - 


public abstract class Card
{
  public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
                                        "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

  private String suit;
  private int face;

  //constructors
  
  Card(){
	  face = 0;
	  suit = "";
  }
  
  Card(int a, String b){
	  face =a;
	  suit =b;
  }


  // modifiers
  public abstract int getValue();
  public void setFace(int a) {
	  face =a;
  }
  
 public void setSuit(String b) {
	  
	  suit = b;
  }


  //accessors


  public int getFace() {
	  return face;
  }

  public String getSuit() {
	  return suit;
  }

  public abstract int getValue();

  public boolean equals(Object obj)
  {
	  Card hi = (Card) obj;
	  return (getSuit().equals(hi.getSuit()) && getFace() == hi.getFace());
  }

  //toString
  public String toString() {
	  return FACES[getFace()] + " of " + getSuit() + " | value = " + getValue();
  }
        
}