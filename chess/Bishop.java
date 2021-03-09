package chess;

public class Bishop extends Piece{
    public Bishop(PieceColour p){
        if (p==PieceColour.BLACK)
            setSymbol("♝");
        else
            setSymbol("♗");
    }
    
}
