/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int ifPerfect = Integer.parseInt(args[0]);
		String str = ifPerfect + " is a perfect number since " + ifPerfect + " = 1";
		int sum = 1;
		for(int i = 2;i <= ifPerfect / 2;i++){
			if(ifPerfect % i == 0){
				str =str + " + " + i;
				sum = sum + i;
			}
		}if(sum == ifPerfect){
			System.out.print(str);
		}else{
			System.out.print(ifPerfect + " is not a perfect number");
		}
			
	}
}
