package chess;

public class CheckInput {
	
	//This method requires your input
	public boolean checkCoordinateValidity(String input){
		// if the input isn't 2 characters is it clearly invalid
		if(input.length() != 2)
		{
			System.out.println("Not a valid input.");
			return false;
		}
		// converting to lowercase and getting the 2 characters individually
		input = input.toLowerCase();
		char ichar = input.charAt(0);
		char j = input.charAt(1);
		int i = Character.getNumericValue(ichar);
		// checking to see if they are valid
		if((i>8) || (i<0)){
			System.out.println("Not a valid square.");
			return false;
		}
		if((j>'h') || (j<'a')){
			System.out.println("Not a valid square.");
			return false;
		}
		return true;
	}
}
