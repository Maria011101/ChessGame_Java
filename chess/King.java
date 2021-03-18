package chess;

public class King extends Piece{
    public King(PieceColour p){
        // setting the colour of the piece
        this.colour = p;
        if (p==PieceColour.BLACK)
            setSymbol("♚");
        else
            setSymbol("♔");
    }
    @Override
    public boolean isLegitMove(int i0, int j0, int i1, int j1){
        int dif1 = i1 - i0;
        int dif2 = j1 - j0;
        dif1 = java.lang.Math.abs(dif1);
        dif2 = java.lang.Math.abs(dif2);
        if((dif1 == 0 || dif1 == 1) && (dif2 == 0 || dif2 == 1)){
            if(Board.hasPiece(i1, j1) == false)
                return true;
            else {
                Piece p1 = Board.getPiece(i1, j1);
                Piece p0 = Board.getPiece(i0, j0);
                if(p0.getColour() == p1.getColour())
                    return false;
                else
                    return true;
            }
        }
        else
            return false;
	
    }
}