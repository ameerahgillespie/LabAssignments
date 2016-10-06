import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// load scanner for input
		Scanner scan = new Scanner(System.in);

		// prompt welcome message for user
		System.out.println("Welcome, and beware, as you enter the code embeded walls of Grand Circus! ");
		System.out.println();
		System.out.println("What is your name? (enter name) ");
		String name = scan.nextLine();

		// white space
		System.out.println("");

		// prompt user between two options

		System.out.println("Hi" + " " + name + ", " + "would you like to become a Java developer? (enter yes or no) ");

		String choice1 = scan.nextLine();
		if (choice1.equalsIgnoreCase("no")) {
			System.out.println("Imposter! Too bad for you!");
			}
			else if (choice1.equalsIgnoreCase("yes")) {
			// if yes they move on to second string
			System.out.println("Great choice. You are now faced with serious doubts a quarter-way through your second problem for pre-work. What do you do? (enter guess on own or ask for help) ");
		}
		// new string!
		String decide = scan.nextLine();
		// if "guess on own" is entered exit loop and wish them luck
		if (decide.equalsIgnoreCase("guess on own")) {
			System.out.print("Goodluck!");
		} else if (decide.equalsIgnoreCase("ask for help")) {
			// if "ask for help" loop must continue on to do next task to pick a
			// guide
			System.out.println(
					"Help granted! You've searched Google for help with no success. Three Java guides can power you with a secret weapon. Pick a guide! (enter 1 or 2 or 3) ");
		}
		// new string
		String guide = scan.nextLine();

		switch (guide) {
		case "1":

			// if 1 is entered
			System.out.println("Great choice! You have picked Silent Code Ninja. Get power? (enter Ninja)");
			
			String ninja = scan.nextLine();
			if (ninja.equalsIgnoreCase("Ninja")) {
				// if ninja print
				System.out.println(name + " " + " - you're on your way! You now have Ninja power of visual logic and reasoning to solve pre-work problem 2.");
				break;
			}
			
			

		case "2":

			// if 2 is entered
			System.out.println("Great choice! You have picked The Mean Hex#728C00 Robot Machine. Get power? (enter Hex)");
			
			String hex = scan.nextLine();
			if (hex.equalsIgnoreCase("hex")) {
				// if hex print
				System.out.println(name + " "
						+ " - you're on your way! You now have HEX power of concatenation and infinate interpretation to solve pre-work problem 2.");
				break;
			}

		case "3":

			// if 3 is entered
			System.out.println("Great choice! You have picked Chief Spirit DongBang. Get power? (enter DongBang)");
			
			String DongBang = scan.nextLine();
			if (DongBang.equalsIgnoreCase("DongBang")) {
				// if DongBang print
				System.out.println(name + " " + " - you're on your way! You now have Spirit finger power of Chief DongBang to giphy and block imposter syndrome. You stay late at Grand Circus to work on a project and hear noises coming from the creepy closet. What do you do? (ignore or check it out");
			

				
				String closet = scan.nextLine ();
				if (closet.equalsIgnoreCase("ignore")){
					System.out.println("Good choice. That closet is creepy for a reason and you don't care to find out!");
				}
				else if (closet.equalsIgnoreCase("check it out")){
					System.out.println("Holy poop. You come across a giant live Grant Cirpus bird and now you've interruped his feeding time - pecking developers to their death! (attack or run)");
				}
				String decide2 = scan.nextLine ();
				if (decide2.equalsIgnoreCase("run")){
					System.out.println("Grant locked all of the doors. You die!");
				}
				else if (decide2.equalsIgnoreCase("attack")){
					System.out.println("You distract Grant Cirpus with your spirit fingers power to calm him down and attack by spewing a ton of giphys. Grant gets overloaded and dies! You extract the answer for problem 2 from his guts, 5th element style and survive another day at Grand Circus.");
				}
				break;
			}
		default:
			System.out.println("You lose. Pay attention to your entry!");

			// white space
			System.out.print("");
			
			
		}

		scan.close();

	}
}
