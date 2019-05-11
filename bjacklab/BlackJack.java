//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack
{
  //add in Player instance variable
	private Player p1;
	private Player p2;
  //add in Dealer instance variable
	private Dealer dealer;
	
	private ArrayList<Playerable> players;
	
  public BlackJack()
  {
	  //player = new Player();
	  //dealer = new Dealer();
	  players = new ArrayList<Playerable>();

	  p1 = new Player();
	  p2 = new Player();
	  dealer = new Dealer();
	  players.add(p1);
	  players.add(p2);
	  players.add(dealer);
  }

  public void playGame()
  {
    Scanner keyboard = new Scanner(System.in);
    //char choice = 0;
    String choice = "";
    String play = "y";
    
    //System.out.println("Do you want to be hit? [Y/N] ");
    //choice = keyboard.nextLine();

//    	System.out.println("yes");
    while(play.equals("y")||play.equals("Y")) {
    	for(int i=0; i<players.size(); i++) {
    		players.get(i).resetHand();
    		
    	}
    	dealer.shuffle();
    	//players.get(2).shuffle();
        
    	for(int i=0; i<players.size(); i++) {
    		for(int j=0; j<2; j++) {
    			players.get(i).addCardToHand(dealer.deal());
    			
    		}
    		
    	}
    	/*
        player.addCardToHand(dealer.deal());
        player.addCardToHand(dealer.deal());
        dealer.addCardToHand(dealer.deal());
        dealer.addCardToHand(dealer.deal());
        */
        
        //int playerTotal = player.getHandValue();
        //int dealerTotal = dealer.getHandValue();
        
        for(int i=0; i<2; i++) {
    		out.println("P"+(i+1)+": Current hand " + players.get(i).toString());
        
    		System.out.println("Do you want to be hit? [Y/N] ");
    		choice = keyboard.nextLine();
        
    		while(players.get(i).getHandValue() <21 &&(choice.equals("y") || choice.equals("Y"))) {
    			players.get(i).addCardToHand(dealer.deal());
        	
    			out.println("P"+(i+1)+": Current hand " + players.get(i).toString());
        	
    			System.out.println("\nDo you want to be hit? [Y/N] ");
    			choice = keyboard.nextLine();
    		}
    		System.out.println("\n");
        }
        out.println("\nDealer hand " + dealer.toString());
        
        while(dealer.hit()) {
        	
        	dealer.addCardToHand(dealer.deal());
        	
        	out.println("Dealer hand " + dealer.toString());
        }
    
        int p1Total = players.get(0).getHandValue();
        int p2Total = players.get(1).getHandValue();
        int dealerTotal = dealer.getHandValue();
        
        System.out.println("\nPLAYER ONE ");
        System.out.println("Hand Value :: " + p1Total );
        System.out.println("Hand Size :: " + players.get(0).getHandSize() );
        System.out.println("Cards in Hand :: " + players.get(0).toString() );
        System.out.println("\nPLAYER TWO");
        System.out.println("Hand Value :: " + p2Total );
        System.out.println("Hand Size :: " + players.get(1).getHandSize() );
        System.out.println("Cards in Hand :: " + players.get(1).toString() );
        System.out.println("\nDEALER ");
        System.out.println("Hand Value :: " + dealerTotal );
        System.out.println("Hand Size :: " + dealer.getHandSize() );
        System.out.println("Cards in Hand :: " + dealer.toString() );
                    
        
        	if(p1Total>21&&dealerTotal<=21&&p2Total>21)
        	{
        		dealer.addWinCount();
        		out.println("\nDealer wins - Player 1 busted!");
        		out.println("And Player 2 busted!");
        	}
        	else if(p1Total>21&&dealerTotal>21&&p2Total<=21) {
        		p2.addWinCount();
        		out.println("\nPlayer 2 wins - Player 1 and Dealer busted!");
        	}
        	else if(p1Total<=21&&dealerTotal>21&&p2Total>21) {
        		p1.addWinCount();
        		out.println("\nPlayer 1 wins - Player 2 and Dealer busted!");
        	}
        	else if(p1Total>21&& dealerTotal==p2Total&& p2Total<=21) {
        		p2.addWinCount();
        		dealer.addWinCount();
        		out.println("\nPlayer 1 busted - Player 2 and Dealer tie!");
        	}
        	else if(p2Total>21&& dealerTotal==p1Total&& p1Total<=21) {
        		p1.addWinCount();
        		dealer.addWinCount();
        		out.println("\nPlayer 2 busted - Player 1 and Dealer tie!");
        	}
        	else if(dealerTotal>21&& p1Total==p2Total&& p2Total<=21) {
        		p2.addWinCount();
        		p1.addWinCount();
        		out.println("\nDealer busted - Player 2 and Player 1 tie!");
        	}
        	else if(p2Total>21&&dealerTotal<=21&& dealerTotal>p1Total)
        	{
        		dealer.addWinCount();
        		out.println("\nDealer wins - Player 2 busted!");
        		out.println("And Dealer hand is bigger than Player 1");
        		
        		//if(p1Total>21&&dealerTotal<=21)
        			//out.println(" And Player 1 busted!");
        	}
        	else if(p1Total>21&&dealerTotal<=21&& dealerTotal>p2Total)
        	{
        		dealer.addWinCount();
        		out.println("\nDealer wins - Player 1 busted!");
        		out.println("And Dealer hand is bigger than Player 2");
        	}
        	else if(p1Total<=21&&dealerTotal>21&&p1Total>p2Total)
        	{
        		p1.addWinCount();
        		out.println("\nPlayer 1 wins - Dealer busted!");
        		out.println("Player 1 has a bigger hand value than Player 2!");
        	}
        	else if(p2Total<=21&&dealerTotal>21&&p1Total<p2Total)
        	{
        		p2.addWinCount();
        		out.println("\nPlayer 2 wins - Dealer busted!");
        		out.println("Player 2 has a bigger hand value than Player 1!");
        	}
        	else if(p1Total>21&&dealerTotal>21&&p2Total>21){
        		out.println("\nAll players bust!");
        	}
        	else if(p1Total<dealerTotal && p2Total < dealerTotal && dealerTotal<21){
        		dealer.addWinCount();
        		out.println("\nDealer has bigger hand value!");
        	}
        	else if(p1Total==dealerTotal && p2Total == dealerTotal) {
        		out.println("\nIt's a tie!");
        	}
        	else{
        		System.out.println("* hmmmm");
        	}
        	
        System.out.println("\nPlayer 1 has won " + p1.getWinCount() + " times.");
        System.out.println("Player 2 has won " + p2.getWinCount() + " times.");
        System.out.println("Dealer has won " + dealer.getWinCount()+ " times.\n");
    	
        
        
        System.out.println("Do you want to play again [Y,y,N,n] ::");
        play = keyboard.nextLine();
        
        
        /*if(dealer.getDeck().numCardsLeft() <=4) {
        	dealer.shuffle();
        	System.out.println("shuffled");
        }*/
    }
    }

        
  public static void main(String[] args)
  {
    BlackJack game = new BlackJack();
    game.playGame();
  }
}