//import the java class 'Scanner' from the built in java 'util' library for use in our application.
import java.util.Scanner;

//define a class in which to construct our application
public class Lab4 {

	// apply a main method, so we can execute the code we write within it
	public static void main(String[] args) {

		// declaring and initializing the instance variables used in the
		// application
		int num = 0;
		long factorial = 1;
		String choice = "y";

		// create a new instance of the Scanner object type to take in user
		// input
		Scanner scan = new Scanner(System.in);

		// welcome message for the user
		System.out.println("Welcome to the Factorial Calculator!");

		/*
		 * enter the while loop only when the condition of the user storing the
		 * value "y" into the String variable 'choice' is true. In this instance
		 * since we have already initialized 'choice' with the value "y" when
		 * initially declared the user will automatically enter the while loop.
		 */
		while (choice.equalsIgnoreCase("y")) {

			// prompt the user to enter an integer
			System.out
					.println("Enter an integer that's greater than 0 but less than 10: ");

			// store the user inputted data into the int variable 'num'
			num = scan.nextInt();

			/*
			 * enter the 'if-statement' only when the condition of both the
			 * value stored in the int variable 'num' is greater than 0 AND is
			 * less than or equal to 10. BOTH conditions must evaluate to true
			 * in order to enter the 'if-statement'.
			 */
			if (num > 0 && num <= 10) {

				long result = 1; // declare and initialize a local variable
									// 'result' of type long

				/*
				 * enter the 'for-loop' by initializing the int variable 'i'
				 * with the value "1" for use as the iterator of the 'for-loop',
				 * we set the bound of our 'for-loop' by testing it against the
				 * condition 'i' is less than the user inputted data stored in
				 * the 'num' variable. We then set the loop to continue
				 * iterating by "1" until we reach the outer-bound of the
				 * condition we are testing against (again, in this case the
				 * outer-bound is defined by the user inputted data stored in
				 * the variable 'num').
				 */
				for (int i = 1; i <= num; i++) {

					/*
					 * the code block that is run inside of the 'for-loop'we
					 * utilize the local variable 'result' and initialize it
					 * with the value of (result * i) this is the equation for
					 * calculating the factorial of a given number. We pass the
					 * value of 'result' into 'factorial' so that we can print
					 * out the value to the console further down in our
					 * application. The reason this is done is so we can
					 * reference the instance variable in another part of our
					 * code. Because 'result' is a local variable the value
					 * stored in it cannot be seen outside of the scope (code
					 * block defined by curly braces) of the 'for-loop'
					 */
					result = (result * i);
					factorial = result;

				}

				/*
				 * exit the 'for-loop', yet we are still within the
				 * 'if-statement'. This is where will print a System output to
				 * display the factorial of the user inputted data value to the
				 * console.
				 */
				System.out.println("The factorial of " + num + " is "
						+ factorial);
			}

			/*
			 * enter the 'else-statement' this is the block of code that will
			 * run in the case that the condition being tested in the
			 * 'if-statement' is false.
			 */
			else {
				System.out
						.println("Please enter an integer that's greater than 0 but less than 10: ");
			}

			/*
			 * Exit the 'if/else-statement' and return into the 'while-loop', at
			 * this point we prompt the user as to whether they want to continue
			 * and initialize the String variable 'choice' with scanner input so
			 * the user can select their choice. This option allows us to
			 * continue going through the 'while-loop' or exiting out of it.
			 */
			System.out.println("Continue? (y/n): ");
			choice = scan.next();

		}

		// exit the 'while-loop' and close the scanner object.
		System.out.println("Bye!");
		scan.close();
	} // this brace closes the main method

}// this brace closes the class
