import java.util.Scanner;

public class Lab8 {

		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);

			while (true) {
				System.out.print ("Enter number of times at bat: ");
				int n = scan.nextInt();
				
				int [] atBats = new int[n];
				
				System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
				for (int i = 0; i < n; i++) {
					System.out.print("Result for at-bat " + i +": ");
					atBats[i] = scan.nextInt();
					while (atBats[i] < 0 || atBats[i] > 4) {
						System.out.print("Invalid entry.  Please try again.  Result for at-bat " + i + ": ");
						atBats[i] = scan.nextInt();
					}
				}

				int hits = 0;
				int totalBases = 0;
				for (int i : atBats) {
					if (i > 0)
						hits++;
					totalBases += i;
				}
				
				double battingAvg = (double)hits/n;
				double sluggingPct = (double)totalBases/n;
				
				System.out.printf("Batting Average: %.3f \n", battingAvg);
				System.out.printf("Slugging Percentage: %.3f \n", sluggingPct);

				System.out.print("Continue? (y/n) ");
				scan.nextLine(); //clear out newline left by nextDouble
				String answer = scan.nextLine();
				char firstLetter = answer.toUpperCase().charAt(0);
				while (firstLetter != 'Y' && firstLetter != 'N') {
					System.out.print("Invalid entry.  Please try again.  Continue? (y/n) ");
					answer = scan.nextLine();
					firstLetter = answer.toUpperCase().charAt(0);
				}
				if (firstLetter == 'N')
					break;
			}
			
			scan.close();
			System.out.println("Thank you!");
				

		}

	}

