
public class Entrance extends Location {

	public Entrance() 
	{
		super();
	}

	@Override
	public void look() 
	{
		System.out.println("The Entrance \r\n" + 
				"You arrive at the doors of Hogwarts. The door on the north wall leads to \r\n" + 
				"the dining hall, the door to the east leads to the Potions class, and \r\n" + 
				"the door to the west leads to the Library.\n");		

	}

	@Override
	public int walk(String s)
	{
		if(s.toLowerCase().contains("north"))
		{
			System.out.println("you have entered the dining hall");		
			return 1;
		}
		if(s.toLowerCase().contains("east"))
		{
			System.out.println("you have entered Potion Class");		
			return 3;
		}
		if(s.toLowerCase().contains("west"))
		{
			System.out.println("you have entered the library");		
			return 2;
		}
		
		if(s.toLowerCase().contains("south"))
		{
			System.out.println("there is nothing on the south side");
			return 0;
		}
	
		System.out.println("please enter a valid direction (north,east,south,west");		
		return 0;
	}

	@Override
	public void talk(String s) 
	{
		System.out.println("No characters to talk to here!");	
		
	}

	@Override
	public void use(String s) 
	{
		System.out.println("No objects to use here!");		

	}

}
