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
	//private Player p1;
	//private Player p2;
  //add in Dealer instance variable
	private Dealer dealer;
	
	private ArrayList<Playerable> players;
	
  public BlackJack()
  {
	  players = new ArrayList<Playerable>();
	  
  }

  public void playGame()
  {
    Scanner keyboard = new Scanner(System.in);
    //char choice = 0;
    
    System.out.print("How many players?  ");
    int a = keyboard.nextInt();
    
    for(int i=0; i<a+1; i++) {
    	if(a==i) {
    		dealer= new Dealer();
    		players.add(dealer);
    	}
    	else {
    		players.add(new Player());
    	}
    }

    String choice = "";
    String play = "y";
    
    //System.out.println("Do you want to be hit? [Y/N] ");
    //choice = keyboard.nextLine();

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
        
        //int playerTotal = player.getHandValue();
        //int dealerTotal = dealer.getHandValue();
        
        for(int i=0; i<players.size()-1; i++) {
    		out.println("P"+(i+1)+": Current hand " + players.get(i).toString());
        
    		System.out.print("Do you want to be hit? [Y/N] ");
    		choice = keyboard.next();
        
    		while( (choice.equals("y") || choice.equals("Y")) &&players.get(i).getHandValue() <21) {
    			players.get(i).addCardToHand(dealer.deal());
        	
    			out.println("P"+(i+1)+": Current hand " + players.get(i).toString());
        	
    			System.out.print("Do you want to be hit? [Y/N] ");
    			choice = keyboard.next();
    		}
    		System.out.println("\n");
        }
        out.println("\nDealer hand " + dealer.toString());
        
        while(dealer.hit()) {
        	
        	dealer.addCardToHand(dealer.deal());
        	
        	out.println("Dealer hand " + dealer.toString());
        }
    /*
        int p1Total = players.get(0).getHandValue();
        int p2Total = players.get(1).getHandValue();
        int dealerTotal = dealer.getHandValue();
     */
        for(int i=0; i<players.size(); i++) {
        	
        	if(i==players.size()-1) {
        		System.out.println("\nDEALER ");
                System.out.println("Hand Value :: " + dealer.getHandValue() );
                System.out.println("Hand Size :: " + dealer.getHandSize() );
                System.out.println("Cards in Hand :: " + dealer.toString() );

        	}
        	else {
        		System.out.println("\nPLAYER " + (i+1));
                System.out.println("Hand Value :: " + players.get(i).getHandValue() );
                System.out.println("Hand Size :: " + players.get(i).getHandSize() );
                System.out.println("Cards in Hand :: " + players.get(i).toString() );
        	}
        }
        System.out.println("");
        
        int max=0;
        for(int i=0; i<players.size(); i++) {
        	if(i==0 && players.get(max).getHandValue()>21) {
        		max=1;
        	}
        	else if(players.get(max).getHandValue()<=players.get(i).getHandValue()&&  players.get(i).getHandValue()<=21) {
        		max = i;
        	}
        	
        	
        	if(i== players.size()-1&&players.get(i).getHandValue()>21) {
        		System.out.println("Dealer busted!");
        	}
        	else if(players.get(i).getHandValue()>21) {
        		System.out.println("Player " + (i+1) + " busted!");
        	}
        }
        
        if(max == players.size()-1) {
    		System.out.println("***Dealer won!");
    		players.get(max).setWinCount(players.get(max).getWinCount() +1);
    	}
        else if(players.get(max).getHandValue()>21) {
        	System.out.println("All players busted!");
        }
    	else {
    		for(int i=0; i<players.size()-1;i++) {
    			if(players.get(i).getHandValue()==players.get(max).getHandValue()) {
    				System.out.println("***Player "+ (i+1) + " won!");
        			players.get(i).setWinCount(players.get(i).getWinCount() +1);
    			}
    		}
   
    	}
        
        System.out.println();
        
        
        
        /*
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
        */	
        	
        //System.out.println("\nPlayer 1 has won " + p1.getWinCount() + " times.");
        //System.out.println("Player 2 has won " + p2.getWinCount() + " times.");
        //System.out.println("Dealer has won " + dealer.getWinCount()+ " times.\n");
    	
        for(int i=0; i<players.size();i++) {
        	if(i==players.size()-1) {
        		out.println("Dealer has won " + dealer.getWinCount() + " times.");
        	}
        	else {
        		out.println("Player "+ (i+1) +" has won " + players.get(i).getWinCount() + " times.");
        	}
        }
        
        
        
        System.out.print("\nDo you want to play again [Y,y,N,n] :: ");
        play = keyboard.next();
        
        
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