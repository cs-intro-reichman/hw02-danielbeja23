/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int damkaSize = Integer.parseInt(args[0]);
		String damkaLine = "";
		for(int i = 0;i < damkaSize; i++){
			damkaLine = damkaLine + "* ";
		}
		for(int i = 0;i < damkaSize;i++){
			if(i%2 == 1){
				System.out.println(" " + damkaLine);
			}else{
				System.out.println(damkaLine);
			}
		}
	}
}
