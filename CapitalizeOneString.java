public class CapitalizeOneString{
	
	public static void main (String[] args){
		
		String line = "this is my string.";
		printCapitalized(line);
	}//end main
	
	static void printCapitalized(String str){
		 //print a copy of str to standard output, with the first letter of each word in upper case.
		char ch; //one of the characters in str
		char prevCh; //the character that comes before ch in the string
		int i; //a position in str, from 0 to str.length()-1
		prevCh = 0; //prime the loop with any non-letter character
		
		for (i = 0; i < str.length(); i++){
			ch = str.charAt(i);
			if (Character.isLetter(ch) &&! Character.isLetter(prevCh))
				System.out.print(Character.toUpperCase(ch));
			else
				System.out.print(ch);
			prevCh = ch;//prevCh for next iteration is ch
		}
		System.out.println();
	}
}