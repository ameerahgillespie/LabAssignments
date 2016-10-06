import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		// To do: Create a Scanner object
		Scanner scan = new Scanner(System.in);

		// Display Welcome Message
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");

		// white space
		System.out.println();

		// create while loop to initiate action for choice
		// if users choice = y, complete loop
		String choice = "y";
		// prompt user to enter values of length, width and height of classroom
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter length:");
			double length = scan.nextDouble();

			System.out.print("Enter width:");
			double width = scan.nextDouble();

			System.out.print("Enter height:");
			double height = scan.nextDouble();

			double area = length * width;
			double perimeter = (2 * width) + (2 * length);
			double volume = length * width * height;

			// display area, perimeter and volume
			System.out.print("Area: " + area);
			System.out.println();
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume:" + volume);

			// white space
			System.out.println();

			// add scanner to remove garbage/enter and close loop to exit
			// add scan closer to close the scan
			System.out.print("Continue? (y/n): ");
			scan.nextLine();
			choice = scan.nextLine();
			
		}
		// if choice n print message
		System.out.println("Thank you for using the program!");
		scan.close();

	}
}
