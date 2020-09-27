import java.util.Random;

public class DiningHall extends Location {



	public DiningHall()
	{
		super();
		this.character=new String("dumbldore");
		this.object=new String[] {"sorting hat","food"};

	}


	@Override
	public void look()
	{
		System.out.println("The dining hall is the biggest open area inside Hogwarts. Professor \r\n" + 
				"Dumbledore is in the hall to welcome new students.\r\n"
				+"There is food on the table and a sorting hat beside Dumbldore.");		
	}

	@Override
	public void talk(String s)
	{
		if(s.toLowerCase().contains(character))
		{
			System.out.println("Hello! You will find that help will always be given at Hogwarts to those who ask for it");

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
			Random rand=new Random();
			int randomNumber=rand.nextInt(4)+1;

			switch(randomNumber) {

			case 1:
				System.out.println("Gyffindor!");
				break;
			case 2:
				System.out.println("Hufflepuff!");
				break;
			case 3:
				System.out.println("Ravenclaw!");
				break;
			case 4:
				System.out.println("Slytherin!");
				break;
			}
			b=true;
		}

		if(s.toLowerCase().contains(object[1]))
		{
			System.out.println("Grabbing some Chocolate Frogs");
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
		if(s.toLowerCase().contains("south"))
		{
			System.out.println("you are back at the entrance");		
			return 0;
		}
		if(s.toLowerCase().contains("west") ||s.toLowerCase().contains("north")||s.toLowerCase().contains("east"))
		{
			System.out.println("there is nothing on that side");		
		}
		else
		{
			System.out.println("please enter a valid direction (north,east,south,west");		
		}
		return 1;
	}





}
