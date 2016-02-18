package eclipestour;

import java.util.Random;
import java.util.Scanner;
import java.lang.StringBuilder;


public class ConquerFeatures {

	static Scanner in = new Scanner(System.in);

public static int getInteger(){
	String userInput = in.next();

	while ((userInput.charAt(0)>57)||(userInput.charAt(0)<48)){
		System.out.println("Please make sure to type in an integer!");
		userInput = in.next();
	}

	int x = Character.getNumericValue(userInput.charAt(0));
	return x;
}

public static int getDice(){
	Random rand = new Random();
	int dice = rand.nextInt(6)+1;
	if(dice==6){
		dice += rand.nextInt(6)+1; 
	}
	return dice;
}



}
