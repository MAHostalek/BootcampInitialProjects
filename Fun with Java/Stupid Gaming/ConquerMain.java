//Andy & Aviv

package eclipestour;
import java.util.Scanner;

public class ConquerMain {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Welcome
		System.out.println("      ():::::[]=============> Conquer the Holy Land <=============[]:::::()\n\n\n*------- Levanon & Aram       <<<<<<<<<<<<<<<<<          Fertile Cresent -------*\n|              v                                                ^               |\n|              v             ***The Holy Land***                ^               |\n|              v                                                ^               |\n*------- Sharon & Galil  >>>  Jerusalem & Negev   >>>   Yehuda & Shomron -------*");
		System.out.println("");
		System.out.println("");
		
		
		//How many players are there?
		int n = 0;
		while ((n<2)||(n>5)){
			System.out.println("Please insert an integer amount between 2 and 5 of Players you want to have!");
			n = ConquerFeatures.getInteger();
		}
		
		
		//List of available teams
		System.out.println("The following teams are about to conquer the Holy Land:");System.out.println("1: The State of Israel (I)");System.out.println("2: The Kingdom of David (K)");System.out.println("3: The Al-Aqsa Brigades (A)");System.out.println("4: The Islamic Caliphate (D)");System.out.println("5: The Crusaders (C)");
		ConquerPlayer[] ListOfPlayers = new ConquerPlayer [n];
		
		
		//First Player
		int p1 = 0;
		while ((p1<1)||(p1>5)){
			System.out.println("Player 1 please pick a Team by entering a number between 1 and 5!");
			p1 = ConquerFeatures.getInteger();
		}
		ConquerPlayer Play1 = new ConquerPlayer (p1);
		ListOfPlayers[0]=Play1;
		
		
		//Second Player
		System.out.println("Player 2 please pick a Team by entering a number between 1 and 5 that is not taken yet!");
		int p2 = 0;
		while ((p2<1)||(p2>5)){
			System.out.println("Please insert an amount between 1 and 5 of Players you want to have!");
			p2 = ConquerFeatures.getInteger();
		}
		ConquerPlayer Play2 = new ConquerPlayer (p2);
		ListOfPlayers[1]=Play2;
		
		
		//Third Player
		if (n>2){
			System.out.println("Player 3 please pick a Team by entering a number between 1 and 5 that is not taken yet!");
			int p3 = 0;
			while (((p3<1)||(p3>5))||(p3==p1)||(p3==p2)){
				System.out.println("Please insert an amount between 1 and 5 of Players you want to have!");
				p3 = ConquerFeatures.getInteger();
			}
			ConquerPlayer Play3 = new ConquerPlayer (p3);
			ListOfPlayers[2]=Play3;
			
			
			//Fourth Player
			if (n>3){
				System.out.println("Player 4 please pick a Team by entering a number between 1 and 5 that is not taken yet!");
				int p4 = 0;
				while (((p4<1)||(p4>5))||(p4==p1)||(p4==p2)||(p4==p3)){
					System.out.println("Please insert an amount between 1 and 5 of Players you want to have!");
					p4 = ConquerFeatures.getInteger();
				}
				ConquerPlayer Play4 = new ConquerPlayer (p4);
				ListOfPlayers[3]=Play4;
				
				
				//Fifth Player
				if (n>4){
					System.out.println("Player 5 will play the remaining team...");System.out.println("");
					int p5 = 15 - p1 - p2 - p3 - p4;
					ConquerPlayer Play5 = new ConquerPlayer (p5);
					ListOfPlayers[4]=Play5;
				} else { ConquerPlayer Play5 = new ConquerPlayer (0);}//n>4
			} else { ConquerPlayer Play4 = new ConquerPlayer (0);}//n>3
		} else { ConquerPlayer Play3 = new ConquerPlayer (0);}//n>2
		
		
		
		
		//Infinite Loop that runs until a Player has conquered the Holy Land
		
		int count=-1;
		while (0<1){
			count++;if (count>n-1){count-=n;}
			ConquerPlayer currentPlayer = ConquerPlayer.getNextTurn(ListOfPlayers, count);
						
			String PlayName = ConquerPlayer.getName(currentPlayer);
						
			System.out.println("Player " + PlayName + " it is your turn to throw the die! Press any number + Enter to continue!");
			
			String contergan = in.next();
			int dice = ConquerFeatures.getDice();
			System.out.println("\n\n\n-------------------------------------------------------------------------------------------------\n\n\n");
			System.out.println("Alea iacta est: " + dice);
			if (dice == 12){
				ConquerPlayer.updateSpecial(currentPlayer);
			}
			ConquerPlayer.updatePosition(currentPlayer, dice);
			ConquerPlayer.getCheck(ListOfPlayers, currentPlayer);
			System.out.println("\n" + ConquerPlayer.getMap(ListOfPlayers));
			System.out.println("\n\n\n-------------------------------------------------------------------------------------------------\n\n");
		}

	}
}
