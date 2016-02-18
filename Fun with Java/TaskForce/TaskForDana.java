package eclipestour;

//Aviv

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TaskForDana {
	public static void main(String[] args)throws IOException {
		
		String file_name="C/dev/gedicht.txt";//the poem is called Mondnacht by Jopseph von Eichendorff (beautiful!)
        
		try {
			Reader file = new Reader(file_name);
			String[] arrayLines = file.OpenFile();
			
			shuffleArray(arrayLines);//method to randomise lines
			
			String[] array1 = new String [(arrayLines.length/2)];//half the size of the original file
			String[] array2 = new String [(arrayLines.length/2)];
			for (int i=0; i<((arrayLines.length)/2);i++){
				array1[i]=arrayLines[i];
			}//gets first half
			for (int i=((arrayLines.length)/2); i<arrayLines.length;i++){
				array2[i-((arrayLines.length)/2)]=arrayLines[i];
			}//gets second half
			write_file(array1, "C:/dev/part1.txt");//uses first half inside a method
			write_file(array2, "C:/dev/part2.txt");
		}
		catch (IOException e){
			System.out.println( e.getMessage() );
		}//in case it doesn't work out, an error message appears
		
	
	}
	
	static void shuffleArray(String[] ar){
		//Fisher-Yates Shuffle, I found on Google, I don't really understand it 100% but it works, b"h!
		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--){
			int index = rnd.nextInt(i + 1);
			String a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

	public static void write_file (String[] str_array, String filename) throws IOException{
		try{		
			FileWriter writer = new FileWriter(filename, false);
			String content = "";
			for(int i=0; i<str_array.length;i++){
				content = content + str_array[i] + "\r";
				content+="\r\n";
			}//content is a String that includes (half of) my text and is sent to the write_file command
			writer.write(content);
			writer.close();
		}
		catch (IOException e) {
            e.printStackTrace();
        }//in case it doesn't work
	}
}
