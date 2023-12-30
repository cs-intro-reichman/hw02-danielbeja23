
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boy = false;
		boolean girl = false;
		double kids =0;
		String family="";
		while(!boy || !girl){
			kids = Math.random() * 2; //0 is a boy and 1 is a girl.
			if((int)kids == 0){
				family = family + "b";
				boy = true;
			} 
			if((int)kids == 1){
				family = family + "g";
				girl = true;
			}
			if(!boy || !girl){
				family = family + " ";		
			}
		}
		System.out.println(family);
		System.out.println("You made it... and you now have " + ((family.length() / 2) + 1) + " children.") ;
	}
}
