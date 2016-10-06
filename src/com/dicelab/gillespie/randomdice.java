package com.dicelab.gillespie;
import java.util.Random;
import java.util.Scanner;

public class randomdice {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Grand Circus Casino!\n");
		
		Scanner sc = new Scanner(System.in);
		int sides = InputCheck.getInt(sc, "How many sides do you want the dice to have? ");
		System.out.println(sides+" it is!");
		//call method to roll dice
		rollDice(sc, sides);
		
		sc.close();
	}
	
	public static void rollDice(Scanner sc, int sides){
		//count rolls made
		int counter=1;
		boolean cont = true;
		Random rnd = new Random();
		int die1=0, die2=0;
		while(cont){
			if(InputCheck.cont(sc, "\nRoll the dice? (y/n): ")){
				System.out.println("\nRoll "+counter);
				//rolls die 1 using Math.random, +1 accounts for 'lost side'
				die1 = (int)(Math.random()*sides)+1;
				//rolls die 2 using Random.nextInt, +1 accounts for 'lost side'
				die2 = rnd.nextInt(sides)+1;
				if(die1==1&&die2==1)
					System.out.println("Snake Eyes!");
				if(die1==6&&die2==6)
					System.out.println("Box Cars!");
				System.out.println("Die 1: "+die1);
				System.out.println("Die 2: "+die2);
			}else
				cont=false;
		}
	}

}