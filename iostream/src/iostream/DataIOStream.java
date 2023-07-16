package iostream;
import java.io.*;

public class DataIOStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos= new FileOutputStream("sample.txt");
		DataOutputStream dos= new DataOutputStream(fos);
		
		dos.writeInt(90);
		dos.writeFloat(3.12f);
		dos.writeChar('d');
		dos.writeUTF("Hari");
		
		System.out.println("Data written for DataIOStream file");
		
		
		
		FileInputStream fis= new FileInputStream("sample.txt");
		DataInputStream dis= new DataInputStream(fis);
		
		int i1=dis.readInt();
		char ch1= dis.readChar();
		float f1= dis.readFloat();
		   
		System.out.println(i1);
		System.out.println(ch1);
		System.out.println(f1);
		
		
		
		
	}

}
