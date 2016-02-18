//Avivamin Shkolalek

import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;
import java.util.Arrays;


/************************************** 
* Importing the necessary libraries for google translate
************************************/
import java.util.Scanner;
public class joinedAss {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMLLPPPLMMMMMMMMMMMMMMMMMMMMMMM");System.out.println("MMMMMMMMMLDzENWpp33pN7EQPLMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMLQJ9W& pDMMMMMMMMMMMMMMMMMMMMMMM");System.out.println("MMMMMMLQ733W7EzzzzJ9N3@@&@3DMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMP9dxxWQMMMMMMMMMMMMMMMMMMMMMMM");System.out.println("MMMMLzW&HNEQPLLMMMMMLPQN _3JLMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMEHx 7PMMMMMMMMMMMMMMMMMMMMMMM");System.out.println("MMMP7d p9DLMMMMMMMMMMMMDzEzPMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM9dx 9PMMMMMMMMMMMMMMMMMMMMMMM");System.out.println("MML9d HEPMMMMMMMMMMMMMMMMMMMMMMMMMMDzE9999EJDLMMMMMMMMMLDJEE9N7EJDMMMMMMMMMMLQzzQDQzJE9JLMM9dx ELMMMMMLQE9979JQLMMQJzDJM");System.out.println("MLJW^^7DMMMMMMMMMMMMMMMMMMMMMMMMLzpp9JzzJ73&@H9LMMMMMLEHp9zzJJ93dd3ELMMMMLzWNJJE73d&@W9zDLL7@x ELMMLD937JzzEWd&&9LLPLPDM");System.out.println("MP7H ^ELMMMMMMMMMMMMMMMMMMMMMMMD7&d9zLLLMLLE@&_&QMMMJ3^3EzPLMLLP9d@_HPMMD7@3JQPLPDp@&^9LMML7@x ELMLzp_NJDLLLDN_  9LMMMMM");System.out.println("MP3d^ ELMMMMMMMMMMMMMMMMMMMMMMP9H WzLMMMMMMMJd@ &DLzp& WQMMMMMMMLEH&^@PLEp 3QLMMMML3@ &DMML7@x ELMD7__EPDJ7NNNNW7JLMMMMM");System.out.println("ML3d& HPMMMMMMMMMMMMLPPPLLPDPMz7& WDMMMMMMMML7H x7L7d& NPMMMMMMMMPpd^ ELNd^&zLMMMMMEH dJLML7@x ELMzW^_N9EJzzzQPLLMMMMMMM");System.out.println("MMz@d&^WLLMMMMMMMMLz97N7N3_&JLzp& dQMMMMMMMMMJ3  7P9d& HDMMMMMMMMLNd  EPzd_^dzLMMLDH_d7QMML7@x ELMz3_ 3DLLLLMMMMMMMMMMMM");System.out.println("MMMJ@@&_HDMMMMMMMMMLPDDQNd &ELL3&_ NLMMMMMMML9@x3ELPp@_^7LMMMMMMMPW_ 3JLMDNd&&pEJWdN9EDMMML7@x ELMLp&_^pLMMMMMMMMMMMMMMM");System.out.println("MMMMDW@&&&WzLMMMMMMMMMMDN@ _JLMLN&^^pDLMMMLP7&_pEPMMDW@_&NPMMMMLDN&&WEPMMMLPQJJp3_&7DLMMMMLN&x 9LMMLW&__@NzPLLLPDPMMMMMM");System.out.println("MMMMLLQN@^^_@p7EzQDDDQEW&_^dJLMMLzWd_&HWN7NWWN9zLMMMMLzWd&@3N99NpW79QLMMMMMMLDQ7@&&&3JLMMMzH_  @pJLMLzp&^ ^_@d3WJPLMMMMM");System.out.println("MMMMMMMMLQENp3HHH3pWN79JEEJzPMMMMMLPQE9EJzzQQPLMMMMMMMMLDzJEJJzzQQPLMMMLDEW3W777Npd_&_@zMMMPzJJzzDLMMMLDJ97779JzDLMMMMMM");System.out.println("MMMMMMMMMMMMMLLLLLLLLLMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMLMMMMMMMPE3&NEzQDPLLPzp&^_DLMMMMMMMMMMMMMMMMMMLLMMMMMMMMMM");System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMEp^dEPMMMMMMMLLN_^EPMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM7@__7LMMMMMMMLQH&WELMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMML9d_^@W7EEE97WW7EzLMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMPJ7WWWWN7EJJzQPMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMLPPPPLLLLMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		System.out.println("Please Enter a Line");
		//Splitting the user line into an array
		String userLinPre = in.nextLine();
		String[] userLine = userLinPre.split(" ");
		String language = getLanguage();
		System.out.println(tranlsateText(userLinPre, language));
		int userChoise = 0;
		do{
			//Display the main menu of the program
			System.out.println("Please choose an option:");
			System.out.println("1. Display my original sentence");
			System.out.println("2. Translate my sentence");
			System.out.println("3. Translate a word at a specific index");
			System.out.println("4. Display word count");
			System.out.println("5. Display letter count");
			System.out.println("6. Display longest word");
			System.out.println("7. Display shortest word position");
			System.out.println("8. Display Reversed sentence");
			System.out.println("9. Is my sentence lexicographically ordered");
			System.out.println("0. Exit");

			userChoise = in.nextInt();
			int howMany = userLine.length;
			switch(userChoise){
			case 1:
				System.out.println(Arrays.toString(userLine));
				for (int i=0; i<userLine.length;i++){
					System.out.print(userLine[i] + " ");
				}
				break;
			case 2:
				System.out.println(tranlsateText(userLinPre, language));
				if ((tranlsateText(userLinPre, language)).equals("Error")){
					System.out.println("Error");
				}
				break;
			case 3:
				System.out.println("Please enter the index of the word you wish to have translated seperately, starting from 1 to " + howMany);
				int indX = in.nextInt()-1;
				System.out.println(tranlsateText(userLine[indX], language));
				break;
			case 4:
				System.out.println("Yanai says: You have " + howMany + " words");
				break;
			case 5:
				userLinPre.toLowerCase();
				int count=0;
				for (int j=0; j<userLinPre.length(); j++){
					if ((userLinPre.charAt(j)>96)&&(userLinPre.charAt(j)<123)){
						count++;
					}
				}
				System.out.println("Yanai says: You have " + count + " letters");
				break;
			case 6:
				String kohei="";
				for (int k=0; k<userLine.length; k++){
					if (userLine[k].length()>kohei.length()){
						kohei=userLine[k];
					}
				}
				System.out.println("Yanai says: Your longest word is " + kohei);
				break;
			case 7:
				System.out.println("Yanai says: Your shortest word is " + getShort(userLine));
				break;
			case 8:
				for (int l=userLine.length-1; l>=0; l--){
					System.out.print(userLine[l] + " ");
				}
				break;
			case 9:
				System.out.println(getLex(userLine, getShort(userLine)));
				break;
			case 0:
				System.out.println("Bye");
				break;
			default:
				System.out.println("No such option! try again");
				break;
			}
		}while(userChoise!=0);
		in.close();
	} 

	/**
	 * This method uses Google Translate API - it may take some time to get a response.
	 * @param textToTranslate The String you need to translate
	 * @param targetLang The target language's code for full list of codes go to https://cloud.google.com/translate/v2/using_rest
	 * @return A translated String or the String 'Error' in case something went wrong
	 * 
	 * @author Gilad
	 */
	public static String tranlsateText(String textToTranslate,String targetLang){
		try{
		Response response = 
				given().
				        param("key", "AIzaSyCR1K_pTOYxCLPWQ5gDqHHZkwT6cyMJ8GU").
				        param("source", "en").
				        param("target", targetLang).
				        param("q",textToTranslate).
				        
				when().
				        get("https://www.googleapis.com/language/translate/v2").
				then().
				        contentType("application/json").
				extract().
				        response(); 
				String translationResult = response.path("data.translations[0].translatedText");
				return translationResult;
		}catch (Exception e){
			return "Error";
		}
	}
	public static String getLanguage(){
		System.out.println("Please decide on the language you want to have it translated into");
		System.out.println("1 = Hebrew");System.out.println("2 = German");System.out.println("3 = French (Gay)"); System.out.println("4 = Arabic (super-retarded)");
		int lingua = in.nextInt();
		String sprache = "";
		switch (lingua){
		case 1: sprache = "he";break;
		case 2: sprache = "de";break;
		case 3: sprache = "fr";break;
		case 4: sprache = "ar";break;
		}
		return (sprache);
	}
	public static String getShort(String[] userLine){
		String yanai=userLine[0];
		for (int k=1; k<userLine.length; k++){
			if (userLine[k].length()<yanai.length()){
				yanai=userLine[k];
			}
		}
		return (yanai);
	}	
	
	public static String getLex(String[] userLine, String yanai){
		boolean lexi=true;
		for (int q=0; q<userLine.length-1; q++){
			for (int p=0; p<yanai.length(); p++){
				if (userLine[q].charAt(p)>=userLine[q+1].charAt(p)){
					lexi=false;
				}
			}
		}
		String lexiBel = "Your sentence is ";
		if (lexi){
			lexiBel = lexiBel + "in a lexicographic order";
		} else { lexiBel = lexiBel + "NOT in a lexicographic order";
		}
		return(lexiBel);
	}	
	
	
	
	
	
	
	
}