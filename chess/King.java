package chess;

public class King extends Piece{
    public King(PieceColour p){
        this.colour = p;
        if (p==PieceColour.BLACK)
            setSymbol("♚");
        else
            setSymbol("♔");
    }
	
}
