//Aviv
package eclipestour;
import java.util.Random;
import java.util.Scanner;


public class HangedMan2 {
	static final String[] words = {"Wonderland", "Theory", "Game", "Zurich", "Whiskey", "Xenophobia", "Zebra", "Dana", "Aracnophobia"};
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String secretWord = getRandomWord().toLowerCase();
		//There is no case sensitivity! If you want me to change that, it won't be any trouble.
		//System.out.println(secretWord);
		String coded = "";
		int length = secretWord.length();
		for (int i=0; (i<length); i++){
			coded = coded + "*";
		}
		Random rand = new Random();
		int randround = rand.nextInt(8)+3;
		//now you don't have 10 rounds but a random amount of tries...
		//Plus I added the picture
		System.out.println("                             ''~``");
		System.out.println("                            ( o o )");
		System.out.println("+----------------------.oooO--(_)--Oooo.----------------------+");
		System.out.println("|                       H A N G - M A N                       |");
		System.out.println("|                        .oooO                                |");
		System.out.println("|                        (   )   Oooo.                        |");
		System.out.println("+------------------------ ( (    (   ) -----------------------+");
		System.out.println("                           (_)    ) /");
		System.out.println("                                 (_/");
		System.out.println("The current word is: " + coded + " (There is no case sensitivity!)");
		System.out.println("You need to guess what the word is... Start by guessing a letter...");
		int danainsistedonit=0;
		for (int round=1; round<randround; round++){
			System.out.println("You're now in round " + round);
			String codeguess = "";
			//codeguess is the String that consists of the unseen and the guessed letters.
			System.out.println("Please type in your letter #" + round);
			String letter2 = in.next();
			String letter = letter2.toLowerCase();
			while (((letter.charAt(0)<97)||(letter.charAt(0)>122))){
				System.out.println("Please make sure to type in a single letter...");
				letter2 = in.next();
				letter = letter2.toLowerCase();
			}
			if (letter.equals(secretWord)){
				System.out.println("Congratulations, that's it!");
				System.exit(0);
			} else {
			}
			//now the while loop does not start if the user types in the correct word
			//there is no extra question for that, the user can type in the answer at any given time
			for (int j=0; j<secretWord.length(); j++){
				if ((secretWord.charAt(j)==letter.charAt(0))||(secretWord.charAt(j)==letter2.charAt(0))){
					codeguess = codeguess + secretWord.charAt(j);
					danainsistedonit++;
				} else if (secretWord.charAt(j)==coded.charAt(j)){
					//this line makes sure that the previously guessed letters remain
					codeguess = codeguess + secretWord.charAt(j);
				} else {
					codeguess = codeguess + "*";
				}
			}
			System.out.println("The word is " + codeguess);
			if (codeguess.equals(secretWord)){
				System.out.println("Perfect guess!");
				System.exit(0);
			}
			coded = codeguess;
			System.out.println("You have " + (randround-round+1+danainsistedonit) + " round(s) left...");
		}
		System.out.println("Unfortunately, you did not figure out the word...");
		//Hopefully, you will have guessed it by then :P
		in.close();
	}
	public static String getRandomWord(){
		Random r = new Random();
		int wordIndex = r.nextInt(words.length);
		return words[wordIndex];
	}
}
//I have no idea how the latter part works, but it does :)
