import java.util.Scanner;

public class PigLatinLab{
    public static void main(String[] args) {
    	//cue scanner for user input
        Scanner scan = new Scanner( System.in ); 
        
        //display welcome message
        System.out.println("Welcome to the Pig Latin Translator!"); 
       
        
        //white space
        System.out.println(" ");
        
        // assign empty string  - a reference to an empty string points to an object so you can call methods on it. 
        //a reference pointing to null has no object to point to and  you'll get a NullPointerException.
        String sentenceInput= " "; 
        
       
        
        do { //create do while method to run code once before condition while
            String [] sentenceEntered; //Declare String array to store values of each letter in sentence entered
                		
            //prompt user for input
    		System.out.println("Enter a line to be translated:"); 
    		
    		//auto scan down for next line after input
    		sentenceInput = scan.nextLine(); 
    		
    		//convert each word to lowercase before translating - use lowercase string
    		sentenceInput = sentenceInput.toLowerCase();
            
            sentenceEntered = sentenceInput.split(" "); //use split method to split the string based on the given regular expression 
            
            
            
            
            for (String englishSentence : sentenceEntered) { 	//create an enhanced For Loop, aka, "for each" loop - 
            													//declares a type of variable that will be compatible with the array given
            													// for each loop String "word" will be equal to 
            	
                
            	//murach 237 - use starts with method  - returns true value if string starts with specified string
            	if (englishSentence.startsWith("a") || englishSentence.startsWith("e") || englishSentence.startsWith("i") || englishSentence.startsWith("o") || englishSentence.startsWith("u"))
                    System.out.print(englishSentence + "way ");
            	
            	
                
            	//if word starts with consonants B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, X, Z, W and Y 
				//move all consonants that appear before the first vowel to the end of the word
				//Concatenate "ay" 
	           
               else
                    System.out.print(englishSentence.substring(1)+englishSentence.substring(0,1)+"ay ");
                 }
            
       //while NOT equal to string method call
        } while(!sentenceInput.equals("Goodbye!"));
        
        scan.close();
    }
}
