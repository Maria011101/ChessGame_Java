package chess;

import javax.lang.model.util.ElementScanner6;
import javax.lang.model.util.ElementScanner7;

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
        if((i0 == i1) && (j0 != j1))
            return true;
        else if((i0 != i1) && (j0 == j1))
            return true;
        else
            return false;
    }
}
