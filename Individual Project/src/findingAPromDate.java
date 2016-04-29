import java.util.ArrayList;
import java.util.Scanner;

public class findingAPromDate
	{
		public static String answer;
		static ArrayList <boys> theBoy = new ArrayList <boys>();
		public static void main(String[] args)
			{
				listOfBoys();
				letsGetToKnowYou();
				giveNames();
				thePerfectType();
				choosingRandomly();
				
				

			}
		public static void listOfBoys()
		{
			theBoy.add(new boys("Gabe ", "- he is smart and " , 5.2));
			theBoy.add(new boys("Adrian ", "- he is a jock and ", 6.3));
			theBoy.add(new boys("John ", "- he is funny and", 6.2));
			theBoy.add(new boys("Thomas ", "- he is entertaining and ", 4.5));
			theBoy.add(new boys("Jonathan ", "- he is sexy and ", 5.10));
			theBoy.add(new boys("Ethan ", "- he is attractive and", 6.0));
			theBoy.add(new boys("Jordan ", " - he is nice and", 5.5));
			theBoy.add(new boys("Jack  ", "- he is caring and ", 5.0));
			theBoy.add(new boys("Brian ", "- he is out going and", 5.7));
			theBoy.add(new boys("Nathan ", "- he is shy and", 5.3));
					}
				{
		}
		public static void printList()
			{
				
				for(int i = 0; i < theBoy.size(); i++)
					{
						System.out.println(theBoy.get(i).getNames() + " " + theBoy.get(i).getDescription() + " " + theBoy.get(i).getHeight());
					}
				System.out.println();
			}
		public static void giveNames()
		{
			System.out.println();
			System.out.println("Here are the guys we have so far!");
			for (boys n : theBoy)
				{
					System.out.println( n.getNames());
				}
		}
		private static String letsGetToKnowYou()
			{
				Scanner userlnput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userlnput.nextLine();
				System.out.println("Hello, " + name + "! We have a couple ways to find you a date from the list below!");
				return name;
			}
		public static void thePerfectType()
		{
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("First is to find your perfect match! Type one word that describes your perfect guy");
			String userAnswer = userInput2.nextLine();
			switch (userAnswer)
			{
				case "smart":
				case "intellegent":
				case "nerd":
						{
							System.out.println("Option number one: " + theBoy.get(0).getNames() + " " + theBoy.get(0).getDescription() + " " + theBoy.get(0).getHeight());
							break;
						}
				case "cute":
				case "hot":
				case "sexy":
				case "attractive":
						{
							System.out.println("Option number one: " + theBoy.get(4).getNames() + " " + theBoy.get(4).getDescription() + " " + theBoy.get(4).getHeight());
							System.out.println("Option number two: " + theBoy.get(5).getNames() + " " + theBoy.get(5).getDescription() + " " + theBoy.get(5).getHeight());
							break;
						}
				case "jock":
				case "athletic":
				case "fit":
				case "tall":
						{
							System.out.println("Option number one: " + theBoy.get(1).getNames() + " " + theBoy.get(1).getDescription() + " " + theBoy.get(1).getHeight());
							break;
						}
				case "funny":
				case "hilarious":
				case "clown":
						{
							System.out.println("Option number one: " + theBoy.get(2).getNames() + " " + theBoy.get(2).getDescription() + " " + theBoy.get(2).getHeight());
							break;
						}
				case "entertaining":
				case "interesting":
						{
							System.out.println("Option number one: " + theBoy.get(3).getNames() + " " + theBoy.get(3).getDescription() + " " + theBoy.get(3).getHeight());
							break;
						}
				case "nice":
				case "caring":
				case "sweet":
				case "kind":
						{
							System.out.println("Option number one: " + theBoy.get(6).getNames() + " " + theBoy.get(6).getDescription() + " " + theBoy.get(6).getHeight());
							System.out.println("Option number two: " + theBoy.get(7).getNames() + " " + theBoy.get(7).getDescription() + " " + theBoy.get(7).getHeight());
							break;
						}
				case " out going":
				case "loud":
				case "talkative":
						{
							System.out.println("Option number one: " + theBoy.get(8).getNames() + " " + theBoy.get(8).getDescription() + " " + theBoy.get(8).getHeight());	
							break;
						}
				case "shy":
				case "calm":
						{
							System.out.println("Option number one: " + theBoy.get(9).getNames() + " " + theBoy.get(9).getDescription() + " " + theBoy.get(9).getHeight());
							break;
						}
				default:
				{
					System.out.println("Hmm, we couldn't find your guy based off the description, but lets try again!");
				}
				
			}
		}

		
		public static void choosingRandomly()
			{
				Scanner userInput3 = new Scanner(System.in);
				System.out.print("Type a number in between the numbers 1 and 10!");	
				int random =  userInput3.nextInt();
				int random1 = (int)(Math.random()*10) + 1;
				if (random1 == 1)
					{
						System.out.println("Your other option is.. " + theBoy.get(0).getNames() + " " + theBoy.get(0).getDescription() + " " + theBoy.get(0).getHeight());	
					}
				else if (random1 == 2)
					{
						System.out.println("Your other option is.. " + theBoy.get(1).getNames() + " " + theBoy.get(1).getDescription() + " " + theBoy.get(1).getHeight());
					}
				else if (random1 ==3)
					{
						System.out.println("Your other option is.. " + theBoy.get(2).getNames() + " " + theBoy.get(2).getDescription() + " " + theBoy.get(2).getHeight());
					}
				else if (random1 ==4)
					{
						System.out.println("Your other option is.. " + theBoy.get(3).getNames() + " " + theBoy.get(3).getDescription() + " " + theBoy.get(3).getHeight());
			}
				else if (random1 ==5)
					{
						System.out.println("Your other option is.. " + theBoy.get(4).getNames() + " " + theBoy.get(4).getDescription() + " " + theBoy.get(4).getHeight());
	}
				else if (random1 ==6)
					{
						System.out.println("Your other option is.." + theBoy.get(5).getNames() + " " + theBoy.get(5).getDescription() + " " + theBoy.get(5).getHeight());

					}
				else if (random1 ==7)
					{
						System.out.println("Your other option is.. " + theBoy.get(6).getNames() + " " + theBoy.get(6).getDescription() + " " + theBoy.get(6).getHeight());
						
					}
				else if (random1 ==8)
					{
						System.out.println("Your other option is.. " + theBoy.get(7).getNames() + " " + theBoy.get(7).getDescription() + " " + theBoy.get(7).getHeight());
						
					}
				else if (random1 ==9)
					{
						System.out.println("Your other option is.. " + theBoy.get(8).getNames() + " " + theBoy.get(8).getDescription() + " " + theBoy.get(8).getHeight());
					}
				else 
					{
						
						System.out.println("Your other option is.." + theBoy.get(9).getNames() + " " + theBoy.get(9).getDescription() + " " + theBoy.get(9).getHeight());
					}
						
						
						
						
					}
						
					}
						
						