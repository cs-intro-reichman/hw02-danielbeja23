/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		if (x == 0){ // If the input is zero, print zero.
			System.out.println(0);
		}else{
			for(int k = 1; k <= (x / 2); k++){//Check if x has divisors from 1 to x:2.
				if(x % k == 0){
					System.out.println(k);// Print the divisor.
				}
			}
			System.out.println(x); //  Every number is a divisor of himself.
		}
	}
}
