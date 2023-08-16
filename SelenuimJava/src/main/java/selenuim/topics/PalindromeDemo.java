package selenuim.topics;

import java.util.Scanner;

public class PalindromeDemo {

	public static String Palindrome(String str) {

		char[] chArray = str.toCharArray();
		char[] reverse = new char[chArray.length];

		String result = "false";

		for (int k = 0; k < chArray.length; k++) {
			if (chArray[k] == ' ') {
				reverse[k] = ' ';
			}

		}

		int j = reverse.length - 1;

		for (int i = 0; i < chArray.length; i++) 
		{
			if (chArray[i] != ' ') {
				if (reverse[j] == ' ') {
					j--;
				}
				reverse[j] = chArray[i];
				j--;
			}

		}
		
		//String string = reverse.toString();
		
		//System.out.println(string);

		String s = String.valueOf(reverse);

		System.out.println(s);

		if (str.equals(s)) {
			return result = "true";
		} else {
			return result = "false";
		}

	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(Palindrome(s.nextLine()));
	}

}
