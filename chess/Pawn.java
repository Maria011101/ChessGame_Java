package chess;

public class Pawn extends Piece{	
	public Pawn(PieceColour p){
        if (p==PieceColour.BLACK)
            setSymbol("♟︎");
        else
            setSymbol("♙");
    }
    
}
