package random;

import java.util.Random;

public class PasswordGenerator {
	int seed;
	
	public PasswordGenerator(int seed) {
		this.seed = seed;
	}
	
	
	public void execute() {
		String password = choice();
		
		System.out.println("password is " + password);
	}
	
	public String choice() {
		String returnValue = "";
		
		String[] chars = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0","1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "a", "b", "c", "A", "B", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "v", "n", "m", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "N", "M"};
		String wonwon = "";
		Random ungeun = new Random();
		System.out.println("dongangazi seed = " + seed );
		int wonse = 0;
		int i = 1;
		while (i<16) {
			wonse = ungeun.nextInt(chars.length);
			
			String a = chars[wonse];
					
			if(ungeun.nextInt(2) == 1) a = a.toUpperCase(); 
			
			returnValue += a;
			i++;
			System.out.println(wonwon);
		}
		return returnValue;
	}
	
	public static void main(String[] args) {
		
		if(args == null || args.length != 1) {
			System.out.println("enter seed number");
			System.exit(1);
		}
		
		new PasswordGenerator(Integer.parseInt(args[0])).execute();
	}
}