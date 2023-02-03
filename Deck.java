package w6;

import java.util.*;

public class Deck
{
	Stack<Card> cards = new Stack<>();	
	
	int size = 0;
	
	Deck()
	{		
		for(int i = 2; i < 15; i++)
		{
			Card card = new Card(i, "Spades");
			cards.add(card);
		}
		
		for(int i = 2; i < 15; i++)
		{
			Card card = new Card(i, "Clubs");
			cards.add(card);
		}
		
		for(int i = 2; i < 15; i++)
		{
			Card card = new Card(i, "Hearts");
			cards.add(card);
		}
		
		for(int i = 2; i < 15; i++)
		{
			Card card = new Card(i, "Diamonds");
			cards.add(card);
		}	
		
		size = cards.size();
	}
	
	
	public void shuffle()
	{
		Collections.shuffle(cards);
	}
	
	
	public Card draw()
	{
		Card c = new Card();
		
		c = cards.pop();
		
		return c;
	}
}