import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SecondAss3{
public static void main(String args[])throws IOException{
	File file= new File("input.txt");
	
	if(!file.exists()) {
		
		file.createNewFile();
	}
	
	//creating another file
	
	
File file1= new File("output.txt");
		
		if(!file1.exists()) {
			
			file1.createNewFile();
		}	
	BufferedReader br = new BufferedReader(new FileReader(file));
	BufferedWriter bw = new BufferedWriter(new FileWriter(file1));
	
	int ch;
	while ((ch = br.read()) != -1) {
		bw.write(ch);
	};
	System.out.println("File copied");
	}
}
