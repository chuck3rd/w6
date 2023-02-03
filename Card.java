package w6;

public class Card
{
	public int    value;	
	public String name;
	
	
	//
	Card(int value, String name)
	{
		this.value = value;
		this.name  = name;
	}
	
	Card()
	{
		
	}
	
	public void set_value(int value)
	{
		this.value = value;
	}
	
	public void set_name(String name)
	{
		this.name = name;
	}
	
	public int get_value()
	{
		return value;
	}
	
	public String get_name()
	{
		return name;
	}
	

	
	public void describe()
	{		
		if(value < 2 || value > 14)
		{
			System.out.println("Joker");
		}
		else if(value == 11)
		{
			System.out.println("Jack of " + name);
		}
		else if(value == 12)
		{
			System.out.println("Queen of " + name);
		}
		else if(value == 13)
		{
			System.out.println("King of " + name);
		}
		else if(value == 14)
		{
			System.out.println("Ace of " + name);
		}
		else
		{
			System.out.println(value + " of " + name);
		}
	}
}