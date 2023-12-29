/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int damkaSize = Integer.parseInt(args[0]);
		String damkaLine = "*";
		for(int i = 0;i < damkaSize - 1; i++){//create a base to each damka line.
			damkaLine = damkaLine + " *";
		}
		for(int i = 0;i < damkaSize;i++){ // print rows.
			if(i%2 == 1){ //if the row number is uneven print it with space at the begging.
				System.out.println(" " + damkaLine);
			}else{
				System.out.println(damkaLine);
			}
		}
	}
}
