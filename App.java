package w6;


public class App
{
	public static void main(String args[]) 
	{
		Deck deck = new Deck();
		Player p1 = new Player("turd");
		Player p2 = new Player("burglar");
		
		deck.shuffle();
		
		
		//Deck pops its stack and hands out cards to the players hand stack
		for(int i = 0; i < deck.size/2; i++)
		{
			Card c1 = new Card();
			Card c2 = new Card();
			
			c1 = deck.draw();
			c2 = deck.draw();
			
			p1.hand.add(c1);
			p2.hand.add(c2);
		}
		
		//pops the players hand stack and compares the card value
		for(int i = 0; i < deck.size/2; i++)
		{
			Card c1 = new Card();
			Card c2 = new Card();
			
			c1 = p1.flip();
			c2 = p2.flip();
			
			if(c1.value > c2.value)
			{
				p1.incrementScore();
			}
			else if(c1.value < c2.value)
			{
				p2.incrementScore();
			}
			else
			{
				p1.incrementScore();
				p2.incrementScore();
			}
		}
		
		
		if(p1.score == p2.score)
		{
			System.out.println("Draw.");
		}
		else if(p1.score > p2.score)
		{
			System.out.println(p1.name + " wins.");
		}
		else if(p1.score < p2.score)
		{
			System.out.println(p2.name + " wins.");
		}
		
		p1.describe();
		p2.describe();
		
	}
}