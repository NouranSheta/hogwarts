
public class PotionClass extends Location{
	
	PotionClass()
	{
		super();
		character=new String("snape");
		object=new String[] {"cauldron","potion"};
	}
	
	public void look()
	{
		System.out.println("The potion class teaches one of the cores subjects that first year wizard students study.\r\n"
				+"Professor Snape is standing in the middle of the room and giving a lecture.\r\n"
				+"On your desk you find a Cauldron and a potion used to apply the lesson.");		}

	@Override
	public void talk(String s)
	{
		if(s.toLowerCase().contains(character))
		{
			System.out.println("The Dark Arts . . . are many, varied, ever-changing, and eternal.\nFighting them is like fighting a many-headed monster\nwhich, each time a neck is severed, sprouts a head even fiercer and cleverer than before.\nYou are fighting that which is unfixed, mutating, indestructible.");

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
		
			if(s.contains(object[0]))
			{
				System.out.println("Stir! The Cauldron is ready for the magic ingredients");
				b=true;
			}
			
			if(s.contains(object[1]))
			{
				System.out.println("Gulp Gulp! The spell is starting to take over your body");
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

		if(s.toLowerCase().contains("west"))
		{
			System.out.println("you are back at the entrance");		
			return 0;
		}
		if(s.toLowerCase().contains("east") ||s.toLowerCase().contains("north")||s.toLowerCase().contains("south"))
		{
			System.out.println("there is nothing on that side");		
		}
		else
		{
			System.out.println("please enter a valid direction (north,east,south,west");		
		}
		return 3;
	}
}
