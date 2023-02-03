package w6;

import java.util.*;

public class Player
{
	Stack<Card> hand = new Stack<>();
	
	public int score = 0;
	
	String name;
	
	Player(String name)
	{
		this.name = name;
		score = 0;
	}
	
	public void set_score(int score)
	{
		this.score = score;
	}
	
	public int get_score()
	{
		return score;
	}
	
	
	public void describe()
	{
		System.out.println("-----------------------");
		System.out.println(name + "'s score: " + score);
		System.out.println("-----------------------");
		
		for(Card i : hand)
		{
			i.describe();
		}
	}
	
	public Card flip()
	{
		Card c = new Card();
		
		c = hand.pop();		
		
		return c;
	}
	
	public Card draw(Deck d)
	{
		Card c = new Card();
		
		c = d.draw();
		
		return c;
	}
	
	public void incrementScore()
	{
		score++;
	}
}