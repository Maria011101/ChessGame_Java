package chess;

//This class requires your input
public class Piece {
	private String symbol;
	protected PieceColour colour;

	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String s){
		symbol = s;
	}

	public PieceColour getColour(){
		// switch(symbol){
		// 	case "♝":
		// 	case "♚":
		// 	case "♛":
		// 	case "♜":
		// 	case "♟︎":
		// 	case "♞":
		// 		colour = PieceColour.BLACK;
		// 		break;
		// 	case "♗":
		// 	case "♔":
		// 	case "♕":
		// 	case "♖":
		// 	case "♙":
		// 	case "♘":
		// 		colour = PieceColour.WHITE;
		// 		break;
		// }
		return colour;
	}

	public boolean isLegitMove(){
		return true;
	}

}
