package chess;

public class Rook extends Piece{
    public Rook(PieceColour p){
        if (p==PieceColour.BLACK)
            setSymbol("♜");
        else
            setSymbol("♖");
    }
}
