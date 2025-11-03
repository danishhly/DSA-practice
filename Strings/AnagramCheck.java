package Strings;


public class AnagramCheck {
	public static void main(String[] args) {
		String A = "decimal";
		String B = "mEdical";

		//if lengths differ, they cannot be anagram
		if(A.length() != B.length()) {
			System.out.println("It's not anagram");
			return;
		}

		//frequency array for 26 lowercase letter (assumes only 'a'....'z')
		int[] freq = new int[26];

		//Count characters at A
		for(int i = 0; i < A.length(); i++) {
			char ch = A.charAt(i);
			//assuming only lower case letters
			//if upper: ch = character.toLowerCase(ch);
			freq[ch - 'a']++;
		}
		//Count for characters at B
		for(int i = 0; i < B.length(); i++) {
			char ch  = B.charAt(i);
			ch = Character.toLowerCase(ch);
			freq[ch - 'a']--;
			if(freq[ch - 'a'] < 0) {
				System.out.println("Its not anagram");
				return;
			}
		}

		System.out.println("Its anagram");
	}
}