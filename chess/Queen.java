package chess;

public class Queen extends Piece{
    public Queen(PieceColour p){
        this.colour = p;
        if (p==PieceColour.BLACK)
        setSymbol("♛");
    else
        setSymbol("♕");
    }
}
