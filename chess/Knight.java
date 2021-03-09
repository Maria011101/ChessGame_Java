package chess;

public class Knight extends Piece{
    public Knight(PieceColour p){
        if (p==PieceColour.BLACK)
            setSymbol("♞");
        else
            setSymbol("♘");
    }
    
}
