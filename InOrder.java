/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		double currNum = 0;
		double nextNum = Math.random() * 10; //Set the first number.
		do{
			currNum = nextNum; 
			System.out.print((int)currNum+ " ");
			nextNum = Math.random() * 10;//Generate a new number.
		}while(currNum <= nextNum); //Check if we have a non decreasing sequence.
	}
}
