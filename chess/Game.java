package chess;
import java.util.Scanner;


public class Game {
	private static boolean gameEnd=false;
    // Method that returns the integer coresponding to a letter
	public static int getJ(char jIn){
		int j=-1;
		switch(jIn){
			case 'a':
				j = 0;
				break;
			case 'b':
				j = 1;
				break;
			case 'c':
				j = 2;
				break;
			case 'd':
				j = 3;
				break;
			case 'e':
				j = 4;
				break;
			case 'f':
				j = 5;
				break;
			case 'g':
				j = 6;
				break;
			case 'h':
				j = 7;
				break;
			}
			return j;
	}
	//This method requires your input
	public static void play(){
		int round = 0;
		while (!gameEnd){
			if(round % 2 == 0){
				PieceColour playercolor = PieceColour.WHITE;
				System.out.println("----White's Turn----");
			}
			else{
				PieceColour playercolor = PieceColour.BLACK;
				System.out.println("----Black's Turn----");
			}
			System.out.println("Enter your origin:");
			Scanner o1 = new Scanner(System.in);
			String origin = o1.nextLine();

			CheckInput check = new CheckInput();
			if(!check.checkCoordinateValidity(origin))
				continue;

			char i0char = origin.charAt(0);
			char j0char = origin.charAt(1);

			int i0 = Character.getNumericValue(i0char);
			i0=i0-1;

			int j0 = getJ(j0char);

			Piece PieceChosen = Board.getPiece(i0, j0);
			if(PieceChosen == null){
				System.out.println("There is no piece.");
				continue;
			}
			else
				System.out.println(PieceChosen);

			System.out.println("Enter your destination:");
			Scanner d = new Scanner(System.in);
			String dest = d.nextLine();

			if(!check.checkCoordinateValidity(dest))
				continue;

			char i1char = origin.charAt(0);
			char j1char = origin.charAt(1);
			int i1 = Character.getNumericValue(i0char);
			i1=i1-1;

			int j1 = getJ(j1char);

			Board.movePiece(i0, j0, i1, j1, PieceChosen);
			round++;
		}		
	}
	
	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	}
}
