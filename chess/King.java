package chess;

public class King extends Piece{
    public King(PieceColour p){
        if (p==PieceColour.BLACK)
            setSymbol("♚");
        else
            setSymbol("♔");
    }
	
}
