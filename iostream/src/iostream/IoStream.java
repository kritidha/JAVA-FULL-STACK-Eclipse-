package iostream;
import java.io.*;

public class IoStream {
	
	public static void main(String []args ) throws IOException{
		
		//creating a file
		
		File file= new File("sample.txt");
		
		if(!file.exists()) {
			
			file.createNewFile();
		}
		
		
		
		//creating another file
		
		
	File file1= new File("cbc.txt");
			
			if(!file1.exists()) {
				
				file1.createNewFile();
			}
			
			//file input stream
		
		FileInputStream fis= new FileInputStream("sample.txt");
		
		int i;
		
		while((i=fis.read())!=-1) {
			System.out.println(i+"....");
			System.out.println((char)i);
		}
		
		//file output stream
		
		FileOutputStream fos= new FileOutputStream("sample.txt");
		
		fos.write('a');
		fos.write('b');
		fos.write(99);
		
		System.out.println("Data written to file");
		
		//coping file 
		FileInputStream fis1= new FileInputStream("sample.txt");
		
		FileOutputStream fos1 = new FileOutputStream("cbc.txt");
		
		int j;
		while((j=fis1.read())!=-1) {
			fos1.write(j);
			
		}
		System.out.println("Data has Written ");
		
	}
	
	

}
