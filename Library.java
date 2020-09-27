
public class Library extends Location{
	
	Library()
	{
		super();
		character=new String("hermoine");
		object=new String[] {"book","quill"};
		
	}
	
	public void look()
	{
		System.out.println("The Library is were Hogwarts' students spend most of their time\r\n" 
				+"Hermoine is sitting quietly in a corner reading a book.\r\n"
				+"you can see a book and a quill next to her.");		
	}

	@Override
	public void talk(String s)
	{
		if(s.toLowerCase().contains(character))
		{
			System.out.println("Sorry, I can't talk right now. I'm studying for a bloody hard subject!");

		}
		else 
		{
			System.out.println("This character is not in the room. try again");
		}		
	}

	@Override
	public void use(String s) 
	{
boolean b=false;
			if(s.toLowerCase().contains(object[0]))
			{
				System.out.println("This is the T. M. Riddle's diary AKA Hocrux. Don't open unless you have a Basilisk's fang!");
				b=true;
			}
			
			if(s.toLowerCase().contains(object[1]))
			{
				System.out.println("Writing a letter to Sirius Black...");
				b=true;
			}
			if(!b)
			{
				System.out.println("This object is not in the room. try again");

			}
			
	}
	

	@Override
	public int walk(String s)
	{
		if(s.toLowerCase().contains("east"))
		{
			System.out.println("you are back at the entrance");		
			return 0;
		}
		if(s.toLowerCase().contains("west") ||s.toLowerCase().contains("north")||s.toLowerCase().contains("south"))
		{
			System.out.println("there is nothing on that side");		
		}
		else
		{
			System.out.println("please enter a valid direction (north,east,south,west");		
		}
		
		return 2;
	}
	
}
