/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
		String strRev = "";// The new reversed string.
		char midChar = 'a';//The middle char.
		for(int i = 0;i < str.length();i++){
			strRev = strRev + str.charAt(str.length() - (i+1));//add the chars in reversed to the new string.
			if(str.length() / 2 == i){//Find the mid char and set it.
				midChar = strRev.charAt(i);
			}
		}	
		System.out.println(strRev);
		System.out.println("The middle character is " + midChar);
	}
}
