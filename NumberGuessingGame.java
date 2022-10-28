	/* 			
				Developed By Abhishek Sunil Uphade
				Task 2 - Number Guessing Game
	*/

import java.util.Scanner;
class GameDetails 
{
 
    void guessingNumberDetails()
    {
        int i, Guess_Number;
	int Computer_number = 1 + (int)(100*Math.random());
	int Trials = 5;
	Scanner sc = new Scanner(System.in);

	System.out.println(" Please Enter Any  number between 1 to 100 . WithIn 5-Trials");

        for (i = 0; i < Trials; i++) 
	{
		System.out.println(" Guess  Any  Number :  ");
            	Guess_Number = sc.nextInt();
 
		if (Computer_number == Guess_Number)
		{
			System.out.println(" Congratulations . You guessed the number in First Attempt .");
			System.out.println(" ***** ");
               		break;
           	}
            	
		else if (Computer_number > Guess_Number && i != Trials - 1) 
		{
                	System.out.println(" The Computer number is Greater Than Your Choice "+ Guess_Number);
            	}
            
		else if (Computer_number < Guess_Number && i != Trials - 1) 
		{
                	System.out.println(" The Computer number is Smaller Than Your Choice " + Guess_Number);

            	}
        }
 
        
	if (i == Trials)
	 {
	     System.out.println("----------------------------------------------------------------------------");
             System.out.println(" You have Encountered "+" "+ Trials +" trials.");
             System.out.println(" The Random Number was " + Computer_number);
        }
    }

}
class NumberGuessingGame
{
	public static void  main(String arg[])
    {
	
	System.out.println("----------------------------------------------------------------------------");
	System.out.println(" ************ Welcome To OASISINFOBYTE Number Guessing Game ************");
	GameDetails gd = new GameDetails();
	int selection;
	Scanner sc = new Scanner(System.in); 
	do
	{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Enter Your Choice");
		System.out.println(" 1 Start Game ");
		System.out.println(" 2 Restart Game Again ");
		System.out.println(" 3 Exit ");
		System.out.println("----------------------------------------------------------------------------");
		selection = sc.nextInt();
		switch(selection)
		{
			case 1 : 
			System.out.println("----------------------------------------------------------------------------");
			System.out.println(" You Have Enter In The Game Successfully ");
			gd.guessingNumberDetails();			
			System.out.println("----------------------------------------------------------------------------");
			break ;
	
			case 2 :
			System.out.println("----------------------------------------------------------------------------");
			System.out.println(" You Have Restarted The  Game ");	
			gd.guessingNumberDetails();
			System.out.println("----------------------------------------------------------------------------");
			break ;
		}
	}
	while(selection!=3);
	
	System.out.println("----------------------------------------------------------------------------");
	System.out.println(" Thankyou For Playing OasisInfobyte Number Guessing Game ");
	System.out.println("----------------------------------------------------------------------------");		
			
    }
}