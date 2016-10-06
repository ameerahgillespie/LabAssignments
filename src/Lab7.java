import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
    
        // Populate arrays
        
        String[] names = new String[20];
        for (int i = 0; i < names.length; i++) {
            names[i] = "name" + i;
        }
        
        String[] genres = new String[20];
        for (int i = 0; i < genres.length; i++) {
            genres[i] = "genre" + i;
        }
        
        String[] songs = new String[20];
        for (int i = 0; i < songs.length; i++) {
            songs[i] = "song" + i;
        }
        
        /* i didnt feel like putting all names here
        String [] names = {"Bowie","Duke", "James"};
        String [] genre = {"Rock", "Jazz", "Soul"};
        String [] song = {"Lazarus", "Sentimental Mood","Sex Machine"};
        */
        
        System.out.print("Welcome to our Java class. ");
        
        String continueChoice = "yes";
        
        while (continueChoice.equalsIgnoreCase("yes")) {
            String currentName = null;
            String currentGenre = null;
            String currentSong = null;
            int studentChoice = 0;
            int studentIndex = 0;
            
            System.out.print("Which student would you like to learn more about (enter a number 1-20): ");
            
            // Let user select student
            boolean enteredValidStudent = false;
            while (!enteredValidStudent) {
                try {
                    studentChoice = scan.nextInt();
                    studentIndex = studentChoice - 1;
                    System.out.println();
            
                    currentName = names[studentIndex];
                    currentGenre = genres[studentIndex];
                    currentSong = songs[studentIndex];
    
                    enteredValidStudent = true;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.print("That student does not exist. Please try again. (enter a number 1-20): ");
                    enteredValidStudent = false;
                }
            }
            
            // Let user select subcategory
            System.out.println("Student " + studentChoice + " is " + currentName + ". ");
            System.out.print("\nWhat would you like to know about " + currentName + "?");
            scan.nextLine();
            
            boolean enteredValidCategory = false;
            while (!enteredValidCategory) {
                System.out.print(" (enter \"favorite genre\" or \"favorite song\"): ");
                
                String categoryChoice = scan.nextLine();
                System.out.println();
                
                enteredValidCategory = true;
            
                if (categoryChoice.equalsIgnoreCase("favorite genre")) {
                    System.out.print(currentName + "'s favorite genre is " + currentGenre);
                } else if (categoryChoice.equalsIgnoreCase("favorite song")) {
                    System.out.print(currentName + "'s favorite song is " + currentSong);
                } else {
                    enteredValidCategory = false;
                    System.out.print("That data does not exist. Please try again. ");
                }
                
                System.out.println();
            }
            
            System.out.print("\nWould you like to know more? (enter \"yes\" or \"no\"): ");
            continueChoice = scan.nextLine();
            System.out.println();
        }
        
        scan.close();
   }
}
