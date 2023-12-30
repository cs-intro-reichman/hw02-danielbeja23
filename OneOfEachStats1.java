/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);//input of how many families in the expirment.
		double kids =0;//0 for a boy, 1 for a girl.
		int twoChild = 0; // count how many families has two childs.
		int threeChild = 0; // count how many families has three childs.
		int fourChild = 0; // count how many families has four childs.
		double avgChild = 0;// avarage of how many children to get at least one of each gender.
		int mostCommon = 0;// determines the most common number of children in families.
		for(int i = 0;i < T;i++){
			boolean boy = false;
			boolean girl = false;
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
			int familySize = ((family.length() / 2) + 1); // determines how many children are.
			avgChild = avgChild + familySize;
			if(familySize == 2){
				twoChild += 1;
			}
			else if(familySize == 3){
				threeChild += 1;
			}
			else{
				fourChild += 1;
			}
		}
		avgChild = avgChild / T;
		mostCommon = Math.max(Math.max(twoChild,threeChild),fourChild);// check which group is the biggest.
		System.out.println("Average: " + avgChild + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChild);
		System.out.println("Number of families with 3 children: " + threeChild);
		System.out.println("Number of families with 4 or more children: " + fourChild);
		if(mostCommon == twoChild){
			System.out.println("The most common number of children is 2.");
		}else if(mostCommon == threeChild){
			System.out.println("The most common number of children is 3.");
		}else{
			System.out.println("The most common number of children is 4 or more.");
		}
		}
	}
