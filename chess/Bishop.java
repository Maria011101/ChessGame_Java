package chess;

public class Bishop extends Piece{
    public Bishop(PieceColour p){
        // setting the colour of the piece
        this.colour = p;
        if (p==PieceColour.BLACK)
            setSymbol("♝");
        else
            setSymbol("♗");
    }
    @Override
    public boolean isLegitMove(int i0, int j0, int i1, int j1){
        int dif1 = i1-i0;
        int dif2 = j1-j0;
        if( Math.abs(dif1) ==  Math.abs(dif2))
            return true;
        else
            return false;
    }
    
}
