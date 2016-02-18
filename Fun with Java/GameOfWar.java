//Aviv

package eclipestour;

import java.util.Scanner;
import java.util.Random;
import java.lang.StringBuilder;

public class GameOfWar {

	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("():::::[]===============> Welcome to War <===============[]:::::()" + "\nEnter your Name to proceed!");
		String playerone = in.nextLine();
		int wealth = 50;
		//I chose a variable instead of writing 50 in the formula below, so that I may change it at any given time.
		Random randomGenerator = new Random();
		System.out.println("Hello, " + playerone + ". Your initial amount of money is " + wealth + " NIS. Use them wisely to win the game...");
		System.out.println("Press 1 to start the game!");
		String goOnString = in.next();
		while (goOnString.charAt(0)!='1'){
			System.out.println("Please, press 1, nothing else...");
			goOnString = in.next();
		}
		int goOn = Integer.parseInt(goOnString);
		//I figured I did not need the variable starten while using goOn...
		//at this point the loop for continuing or quitting the game starts in order to make sure that the player understands the requested task
//		while ((goOn>1)||(goOn<1)){
//			System.out.println("Please press 1 to continue! If you don't want to play, you may exit the game by pressing 2.");
//			goOnString = in.next();
//			while ((goOnString.charAt(0)<49)||(goOnString.charAt(0)>50)){
//				System.out.println("Please, press 1 or 2, nothing else...");
//				goOnString = in.next();
//			}
//			goOn = Integer.parseInt(goOnString);
//			if (goOn == 2){
//				System.out.println("Okay, see you some other time " + playerone);
//				System.exit(0);
//			}
//		}
			while (goOn == 1) {
				System.out.println("Choose the amount of money you want to place in in this round!");
				String betString = in.next();
				while ((betString.length()>2)||(betString.charAt(0)<49||betString.charAt(0)>57)||(betString.charAt(1)<48||betString.charAt(1)>57)){
					System.out.println("Please, put in a number > 0");
					betString = in.next();
				}
				int bet = Integer.valueOf(betString);
				//in case the player does not respect the rules: 
				if (bet>wealth||bet<0){
					System.out.println("You don't have " + bet + " NIS, you liar. Goodbye...");
					System.exit(0);
				}
				System.out.println("You are betting " + bet + " NIS.");
				//
				//this is where the randomisation of the players' cards begin
				//
				int playerOutcome = randomGenerator.nextInt(12);
				//
				int myOutcome = randomGenerator.nextInt(12);
				//
				//In order to receive a random symbol I used a randomisation part again.
				//I am aware of the fact that theoretically both players can play the same card...
				
				//Here I'm trying to get a randomisation over the four card symbols
				String[] words = {"♠", "♣", "♥", "♦"};
				Random randomSym = new Random();
				StringBuilder buildplayer = new StringBuilder();
				int index = (int) randomSym.nextInt(words.length);
				buildplayer.append(words[index]);
				buildplayer.append(" ");
				
				//Repeating for a second symbol
				StringBuilder buildcpu = new StringBuilder();
				int indexnew = (int) randomSym.nextInt(words.length);
				buildcpu.append(words[indexnew]);
				buildcpu.append(" ");
				
				//These were actually some tricky shortcuts. I'm not sure if you just wanted switch-case commands instead
				//of the if conditions, but I find this even more aesthetic and I searched quite a bit to find these shortcuts...
							
				//As you can see, I got rid of the variable "sum".
				if (playerOutcome<myOutcome) {
					System.out.println("Your card is a " + (playerOutcome+1) + " " + buildplayer + ". My card is a " + (myOutcome+1) + " " + buildcpu + "\nYou lose this round.");
					wealth = wealth - bet;
					System.out.println("Your current amount is: " + wealth + " NIS!");
				} else if (playerOutcome>myOutcome) {
					System.out.println("Your card is a " + (playerOutcome+1) + " " + buildplayer + ". My card is a " + (myOutcome+1) + " " + buildcpu + "\nYou win this round.");
					wealth = wealth + bet;
					System.out.println("Your current amount is: " + wealth + " NIS!");
				} else if (playerOutcome==myOutcome) {
					System.out.println("All players have a value of " + (playerOutcome+1) + ". Let's play again. Shall we?");
				}
				if (wealth<=0){
					System.out.println("Unfortunately, you're broke, mate... I'll be enjoying your money now, hahaha! See you around!");
					System.exit(0);
					//I got rid of the second current amount statement...
				}
				System.out.println("Do you wish to play again? Press 1 to continue or 2 to leave with your money!");
				goOnString = in.next();
				while ((goOnString.charAt(0)!='1')&&(goOnString.charAt(0)!='2')){
					System.out.println("Please, press 1 or 2, nothing else...");
					goOnString = in.next();
				}
				goOn = Integer.parseInt(goOnString);
				if (goOn == 2) {
					System.out.println("Maybe some other time...");
					System.out.println("Your final pay-off is: " + wealth + " NIS! Congratulations! :P");
					System.out.println("Goodbye " + playerone);
					System.exit(0);
				}
//				while (goOn>2||goOn<1){
//					System.out.println("Remember: Press 1 to continue or 2 to quit the game...");
//					goOnString = in.next();
//					while ((goOnString.charAt(0)!='1')&&(goOnString.charAt(0)!='2')){
//						System.out.println("Please, press 1 or 2, nothing else...");
//						goOnString = in.next();
//					}
//					goOn = Integer.parseInt(goOnString);
//					if (goOn == 2) {
//						System.out.println("Maybe some other time...");
//						System.out.println("Your final pay-off is: " + wealth + " NIS! Congratulations! :P");
//						System.out.println("Goodbye " + playerone);
//						System.exit(0);
//			}
//		}
	}
			
			in.close();
	}
}