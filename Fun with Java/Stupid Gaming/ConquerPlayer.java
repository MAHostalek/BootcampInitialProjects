package eclipestour;

public class ConquerPlayer {

	private int p;
	private String name;
	private String TeamMember;
	private String init;
	private int start;
	private int position;
	private int lives;
	private boolean turn;
	private boolean specialMode;
	static int nextTurn = 0;
	
	public ConquerPlayer(int p){
		
		this.p = p;
		this.lives = 3;
		
		switch (p){
		case 1:
			this.name = "State of Israel";
			this.start = 10;
			this.position = 10;
			this.turn = true;
			this.specialMode = false;
			this.TeamMember = "David Ben Gurion";
			this.init = "I";
			break;
		case 2:
			this.name = "Kingdom of David";
			this.start = 20;
			this.position = 20;
			this.turn = true;
			this.specialMode = false;
			this.TeamMember = "Rav Kook";
			this.init = "K";
			break;
		case 3:
			this.name = "Al-Aqsa Brigades";
			this.start = 30;
			this.position = 30;
			this.turn = true;
			this.specialMode = false;
			this.TeamMember = "Yassir Arafat";
			this.init = "A";
			break;
		case 4:
			this.name = "Islamic Caliphate";
			this.start = 40;
			this.position = 40;
			this.turn = true;
			this.specialMode = false;
			this.TeamMember = "Abu Bakr al-Bagdadi";
			this.init = "D";
			break;
		case 5:
			this.name = "Crusaders";
			this.start = 50;
			this.position = 50;
			this.turn = true;
			this.specialMode = false;
			this.TeamMember = "Pope Urban";
			this.init = "C";
			break;
		}
	}

	public static void updatePosition(ConquerPlayer Player, int dice){
		//changes the player's position
		if ((Player.position<Player.start)&&(Player.position + dice >= Player.start)){
			Player.position = Player.start;
		} else {
			Player.position += dice;
		}
		//closes the circle...
		if (Player.position > 59){
			Player.position -= 49;
			if (Player.start == 10){//makes sure that player 1 doesn't walk past his finish line
				Player.position = 10;
			} else if ((Player.start == 20)&& (Player.position>68)){//makes sure that player 2 doesn't walk past his finish line
				Player.position = 20;
			}
		}
		System.out.println(Player.name + "' current Position is at " + Player.position);
		System.out.println(Player.TeamMember + getFieldName(Player.position));
	}
	
	
	
	public static void updateTeam(ConquerPlayer Player){
		Player.lives --;
		if (Player.lives<=0){
			Player.lives=0;
		}
		Player.position = Player.start + 1;
		switch (Player.p){
		case 1:
			switch (Player.lives){
			case (2):
				Player.TeamMember = "Moshe Dayan";
				break;
			case (1):
				Player.TeamMember = "Ariel Sharon";
				break;
			case (0):
				System.out.println(Player.name + " has lost the game...");
				Player.turn = false;
				break;
			}
			break;
		case 2:
			switch (Player.lives){
			case (2):
				Player.TeamMember = "Yosef Mizrachi";
				break;
			case (1):
				Player.TeamMember = "Ovadya Yosef";
				break;
			case (0):
				System.out.println(Player.name + " has lost the game...");
				Player.turn = false;
				break;
			}
			break;
		case 3:
			switch (Player.lives){
			case (2):
				Player.TeamMember = "Barack Obama";
				break;
			case (1):
				Player.TeamMember = "Mahmud Abbas";
				break;
			case (0):
				System.out.println(Player.name + " has lost the game...");
				Player.turn = false;
				break;
			}
			break;
		case 4:
			switch (Player.lives){
			case (2):
				Player.TeamMember = "Jihadi John";
				break;
			case (1):
				Player.TeamMember = "Deso Dogg";
				break;
			case (0):
				System.out.println(Player.name + " has lost the game...");
				Player.turn = false;
				break;
			}
			break;
		case 5:
			switch (Player.lives){
			case (2):
				Player.TeamMember = "Mel Gibson";
				break;
			case (1):
				Player.TeamMember = "Torquemada";
				break;
			case (0):
				System.out.println(Player.name + " has lost the game...");
				Player.turn = false;
				break;
			}
			break;
		}
		System.out.println(Player.name + "' current Position is at " + Player.position);
		System.out.println(Player.TeamMember + getFieldName(Player.position));
	}
	
	public static ConquerPlayer getNextTurn(ConquerPlayer[] List, int c){
		//determines the next player in line
		
		while (List[c].turn==false){
			if (List[c].lives>0){
				List[c].turn=true;
			}
			c++;
			if (c==List.length){
				c-=List.length;
			}
		}
		return (List[c]);
	}
	
	public ConquerPlayer(ConquerPlayer regular){
		//copy constructor
		this.p = regular.p;
		this.name = regular.name;
		this.start = regular.start;
		this.position = regular.position;
		this.turn = regular.turn;
		this.specialMode = regular.specialMode;
	}
	
	public static String getFieldName (int newPos){
		String area = "";
		String field = "";
		switch(newPos){
		case (10): area = "Sharon & Galil"; field = "Zfat"; break;
		case (11): area = "Sharon & Galil"; field = "Akko"; break;
		case (12): area = "Sharon & Galil"; field = "Tiberias"; break;
		case (13): area = "Sharon & Galil"; field = "Nazareth"; break;
		case (14): area = "Sharon & Galil"; field = "Haifa"; break;
		case (15): area = "Sharon & Galil"; field = "Hadera"; break;
		case (16): area = "Sharon & Galil"; field = "Netanya"; break;
		case (17): area = "Sharon & Galil"; field = "Petah Tikvah"; break;
		case (18): area = "Sharon & Galil"; field = "Tel Aviv"; break;
		case (19): area = "Sharon & Galil"; field = "Yavne"; break;
		case (20): area = "Jerusalem & Negev"; field = "Bet Shemesh"; break;
		case (21): area = "Jerusalem & Negev"; field = "Jerusalem"; break;
		case (22): area = "Jerusalem & Negev"; field = "Bet Lechem"; break;
		case (23): area = "Jerusalem & Negev"; field = "Beitar Illit"; break;
		case (24): area = "Jerusalem & Negev"; field = "Kiryat Gat"; break;
		case (25): area = "Jerusalem & Negev"; field = "Rahat"; break;
		case (26): area = "Jerusalem & Negev"; field = "Beer Sheva"; break;
		case (27): area = "Jerusalem & Negev"; field = "Mitzpe Ramon"; break;
		case (28): area = "Jerusalem & Negev"; field = "Eilat"; break;
		case (29): area = "Jerusalem & Negev"; field = "Dimona"; break;
		case (30): area = "Yehuda & Shomron"; field = "Hevron"; break;
		case (31): area = "Yehuda & Shomron"; field = "Efrat"; break;
		case (32): area = "Yehuda & Shomron"; field = "Jericho"; break;
		case (33): area = "Yehuda & Shomron"; field = "Ramallah"; break;
		case (34): area = "Yehuda & Shomron"; field = "Bet El"; break;
		case (35): area = "Yehuda & Shomron"; field = "Shilo"; break;
		case (36): area = "Yehuda & Shomron"; field = "Ariel"; break;
		case (37): area = "Yehuda & Shomron"; field = "Shechem"; break;
		case (38): area = "Yehuda & Shomron"; field = "Jenin"; break;
		case (39): area = "Yehuda & Shomron"; field = "Bet Shean"; break;
		case (40): area = "Fertile Cresent"; field = "Quneitra"; break;
		case (41): area = "Fertile Cresent"; field = "Palmyra"; break;
		case (42): area = "Fertile Cresent"; field = "Aleppo"; break;
		case (43): area = "Fertile Cresent"; field = "Raqqa"; break;
		case (44): area = "Fertile Cresent"; field = "Deir ez-Zur"; break;
		case (45): area = "Fertile Cresent"; field = "Ramadi"; break;
		case (46): area = "Fertile Cresent"; field = "Bagdad"; break;
		case (47): area = "Fertile Cresent"; field = "Babylon"; break;
		case (48): area = "Fertile Cresent"; field = "Ur"; break;
		case (49): area = "Fertile Cresent"; field = "Riad"; break;
		case (50): area = "Levanon & Aram"; field = "Petra"; break;
		case (51): area = "Levanon & Aram"; field = "Amman"; break;
		case (52): area = "Levanon & Aram"; field = "Jerash"; break;
		case (53): area = "Levanon & Aram"; field = "Irbid"; break;
		case (54): area = "Levanon & Aram"; field = "Damaskus"; break;
		case (55): area = "Levanon & Aram"; field = "Baalbek"; break;
		case (56): area = "Levanon & Aram"; field = "Tripoli"; break;
		case (57): area = "Levanon & Aram"; field = "Beirut"; break;
		case (58): area = "Levanon & Aram"; field = "Sidon"; break;
		case (59): area = "Levanon & Aram"; field = "Tyre"; break;
		}
		return (" is in " + area + " and has reached " + field + "!");
	}
	
	public static void updateSpecial (ConquerPlayer Player){
		//changes the player's team member to the team's special character
		Player.specialMode = true;
		switch (Player.p){
		case 1: Player.TeamMember = "Menachem Begin"; break;
		case 2: Player.TeamMember = "Mashiach"; break;
		case 3: Player.TeamMember = "Ahmed Manasra"; break;
		case 4: Player.TeamMember = "Muhammad"; break;
		case 5: Player.TeamMember = "Jesus"; break;
		}
		ConquerPrinter.Printaaa("Your team member has transformed into " + Player.TeamMember);
		System.out.println("Your team member has transformed into " + Player.TeamMember);
	}
	
	public static void getCheck(ConquerPlayer[] List, ConquerPlayer current){
		for (int i=0; i<List.length; i++){
			if ((current.position == List[i].position)&&(current.start != List[i].start)&&(current.position != List[i].start)){
				if (List[i].specialMode){
					checkSpecial(List[i], current);
				} else {
					ConquerPrinter.Printaaa("\n*********** " + current.TeamMember + " has brutally slaughtered " + List[i].TeamMember + "**********\n");
					System.out.println("\n*********** " + current.TeamMember + " has brutally slaughtered " + List[i].TeamMember + "**********\n");
					updateTeam(List[i]);
				}
			}
		}
		if (current.position==current.start){
			ConquerPrinter.Printaaa(current.name + " has conquered the Holy Land!!! Game Over!");
			System.out.println(current.name + " has conquered the Holy Land!!! Game Over!");
			System.exit(0);
		}
		
	}
	
	public static void checkSpecial (ConquerPlayer other, ConquerPlayer current){
		if (current.specialMode){
			System.out.println("Both players are in special mode and tried kill each other by stoning...");
			System.out.println("Now, both players got heavily stoned and chill out their next turn!");
			other.turn=false;
			current.turn=false;
		} else {
			switch (other.p){
			case 1:
				System.out.println(current.TeamMember + " tried to murder " + other.TeamMember);
				System.out.println("But " + other.TeamMember + " defended himself, both players are dead...");
				other.specialMode=false;
				updateTeam(other);
				updateTeam(current);
				break;
			case 2:
				System.out.println(current.TeamMember + " tried to murder " + other.TeamMember);
				System.out.println("But " + other.TeamMember + " cannot be killed...");
				break;
			case 3:
				System.out.println(current.TeamMember + " tried to murder " + other.TeamMember);
				System.out.println("But " + other.TeamMember + " was only 13. " + current.TeamMember + " looses his next turn!");
				current.turn=false;
				other.specialMode=false;
				updateTeam(other);
				break;
			case 4:
				System.out.println(current.TeamMember + " tried to murder " + other.TeamMember);
				System.out.println("But " + other.TeamMember + " fled on his flying horse...");
				other.specialMode=false;
				other.lives++;
				updateTeam(other);
				break;
			case 5:
				System.out.println(current.TeamMember + " tried to murder " + other.TeamMember);
				System.out.println("But " + other.TeamMember + " will resurrect after loosing his next turn");
				other.turn=false;
				break;
			}
		}
	}
	
	public static void updateTurn (ConquerPlayer Player, boolean newTurn){
		//sets the player's turn to false, so that he looses his turn or returns it to true...
		Player.turn = newTurn;
	}

	public static String getName(ConquerPlayer Player){
		return Player.name;
	}

	public static String getMap(ConquerPlayer[] List){
		String Map = "     Sharon & Galil              Fertile Cresent\n[16][15][14][13][12][11][10][59][58][57][56][55][54][53]\n[17]                                                [52]\n[18]                                                [51]\n[19]                                                [50]\n[20]                                                [49]\n[21] Jerusalem                             Levanon  [48]\n[22]                                                [47]\n[23] & Negev                                & Aram  [46]\n[24]                                                [45]\n[25]                                                [44]\n[26]                                                [43]\n[27]                                                [42]\n[28][29][30][31][32][33][34][35][36][37][38][39][40][41]\n                    Yehuda & Shomron";
		String x = "";
		for (int i=0; i<List.length; i++){
			x = ""+List[i].position; 
			for (int j=0; j<(Map.length()-2); j++){
				if (Map.substring(j,j+2).equals(x)){
					Map = Map.substring(0,j) + List[i].init + "*" + Map.substring(j+2, Map.length());
				}
			}
		}
		
		return Map;
	}

}
