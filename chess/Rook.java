package chess;

public class Rook extends Piece{
    public Rook(PieceColour p){
        // setting the colour of the piece
        this.colour = p;
        if (p==PieceColour.BLACK)
            setSymbol("♜");
        else
            setSymbol("♖");
    }
    @Override
    public boolean isLegitMove(int i0, int j0, int i1, int j1){
        return true;
    }
}
