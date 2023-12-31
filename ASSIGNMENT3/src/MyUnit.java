
public class MyUnit {
	public boolean palindromeCheck(String input1) {
		input1 = input1.toLowerCase();
		int digitCount = input1.length();
		boolean isPalindrome = true;
		
		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;
		
		for (int i = 0; i <= range; i++) {
			if (input1.charAt(i) != input1.charAt(digitCount - i - 1)) isPalindrome = false;
		}
		
		return isPalindrome;
	}
	
	public static void main(String args[]) {
		MyUnit u= new MyUnit();
		boolean ans=u.palindromeCheck("madam");
		System.out.println("Is madam is a palindrome? -"+ ans);
		boolean ans1=u.palindromeCheck("check");
		System.out.println("Is check is a palindrome? -"+ ans1);
	}

}
