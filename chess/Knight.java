package chess;

public class Knight extends Piece{
    public Knight(PieceColour p){
        this.colour = p;
        if (p==PieceColour.BLACK)
            setSymbol("♞");
        else
            setSymbol("♘");
    }
    
}
