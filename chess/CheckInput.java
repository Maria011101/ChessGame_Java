package chess;

public class CheckInput {
	
	//This method requires your input
	public boolean checkCoordinateValidity(String input){
		if(input.length() != 2)
		{
			System.out.println("Not okay");
			return false;
		}
		char ichar = input.charAt(0);
		char j = input.charAt(1);
		int i = Character.getNumericValue(ichar);
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
