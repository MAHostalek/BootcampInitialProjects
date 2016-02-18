package eclipestour;
//Aviv

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Reader {
	
	private String path;
	public Reader(String file_path){
		path = file_path;
		
	}
	
	public String[] OpenFile() throws IOException{
		//filereader gets every character, while bufferedreader can take in lines
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		int numberLines = readLines();//method used
		String[]textData=new String[numberLines];
		
		
		for(int i=0;i<numberLines;i++){
			textData[i]=textReader.readLine();
		}
		//picks up every line in my text
		textReader.close();
		return textData;
	}

	int readLines() throws IOException{
		//gets the number of lines in my text
		FileReader file_to_read = new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		String aLine;
		int numberLines=0;
		
		while ((aLine = bf.readLine()) != null){
			numberLines++;
		}
		bf.close();
		
		return numberLines;
	}



}