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
		// round will count the rounds and keep track of the players' turns
		int round = 0;
		PieceColour playercolor;

		while (!gameEnd){
			if(round % 2 == 0){
				playercolor = PieceColour.WHITE;
				System.out.println("----White's Turn----");
			}
			else{
				playercolor = PieceColour.BLACK;
				System.out.println("----Black's Turn----");
			}

			// Origin piece input
			System.out.println("Enter your origin:");
			Scanner o1 = new Scanner(System.in);
			String origin = o1.nextLine();
			origin = origin.toLowerCase();

			if(origin.equals("end"))
			{
				gameEnd = true;
				break;
			}

			// checking to see if the input is valid
			CheckInput check = new CheckInput();
			if(!check.checkCoordinateValidity(origin))
				continue;
			
			// breaking up the string
			char i0char = origin.charAt(0);
			char j0char = origin.charAt(1);

			// casting i0 into an integer
			int i0 = Character.getNumericValue(i0char);
			i0=i0-1;

			// using the getJ method to get j0 as an integer
			int j0 = getJ(j0char);

			// getting the piece and the checking to see if it is the right colour
			Piece PieceChosen = Board.getPiece(i0, j0);
			if(PieceChosen == null){
				System.out.println("There is no piece.");
				continue;
			}

			if ( playercolor != PieceChosen.getColour())
			{
				System.out.println("Not your piece. Please choose your colour.");
				continue;
			}

			// destination coordinates input
			System.out.println("Enter your destination:");
			Scanner d = new Scanner(System.in);
			String dest = d.nextLine();

			dest = dest.toLowerCase();

			if(dest.equals("end"))
			{
				gameEnd = true;
				break;
			}

			if(!check.checkCoordinateValidity(dest))
				continue;

			// getting the individual coordinates
			char i1char = dest.charAt(0);
			char j1char = dest.charAt(1);
			int i1 = Character.getNumericValue(i1char);
			i1=i1-1;

			int j1 = getJ(j1char);

			// checking to see if it is a legit move
			if(PieceChosen.isLegitMove(i0, j0, i1, j1)){
				// if the king was captured the game ends
				if(Board.movePiece(i0, j0, i1, j1, PieceChosen))
					gameEnd = true;
				round++;
			}
			else{
				System.out.println("Not a valid move.");
				continue;
			}

		}		
	}
	
	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	}
	}
