package chess;

public class Pawn extends Piece{	
	public Pawn(PieceColour p){
        this.colour = p;
        if (p==PieceColour.BLACK)
            setSymbol("♟︎");
        else
            setSymbol("♙");
    }
    
}
