import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		int position=0;
		boolean bool=true;
		boolean word;
		Scanner input=new Scanner(System.in);
		String cmd;

		Location[] room=new Location[4];
		room[0]=new Entrance();
		room[1]=new DiningHall();
		room[2]=new Library();
		room[3]=new PotionClass();

		do {
			System.out.println("“Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to\r\n" + 
					"magical Mischief-Makers are proud to present THE MARAUDER'S MAP”\r\n\t" + 
					"Say the magic phrase to reveal the map.");

			cmd= input.nextLine();

		} while(!cmd.toLowerCase().equals("i solemnly swear that i am up for no good"));

		room[0].look();

		while(bool)
		{
			word=false;
			cmd=input.nextLine();

			if(cmd.contains("look"))
			{
				room[position].look();
				word=true;

			}

			if(cmd.contains("talk"))
			{
				room[position].talk(cmd);
				word=true;
			}

			if(cmd.contains("use"))
			{
				room[position].use(cmd);
				word=true;
			}

			if(cmd.contains("walk"))
			{
				position=room[position].walk(cmd);
				word=true;
			}
			
			if(cmd.toLowerCase().equals("mischief managed"))
			{
				word=true;
				bool=false;
			}

			if(!word)
			{
				System.out.println("invalid command. Please use the actions (look,use,talk,walk)");
			}

		}

		System.out.println("Hiding map contents...end.");
		input.close();

	}

}
