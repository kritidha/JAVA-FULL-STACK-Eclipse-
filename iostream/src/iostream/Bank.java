package iostream;

import java.io.*;

public class Bank implements java.io.Serializable {
	static double minBalancw = 5000;
	
	private long accNo;
	private String accHName;
	private String username;
	
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	
	public long getAccNo() {
		return accNo;
	}
	
	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}
	
	public String getAccHName() {
		return accHName;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String toString() {
		return "accNo:"+ accNo+"\n"+"accHName:"+accHName +"\n"+"username:"+username+"\n";
	}
}

class BankTransaction{
	public static void main(String []args) throws Exception {
		Bank acc1 = new Bank();
		
		acc1.setAccNo(1);
		acc1.setAccHName("Hari");
		acc1.setUsername("Hari Krishna");
		
		
		System.out.println(acc1);
		try 
		
		(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("BankAccountsinfo.ser"))){
		
		 oos.writeObject(acc1);}
		 
		 System.out.println("Object written to file");
		 
	}
}