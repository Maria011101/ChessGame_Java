package chess;

public class Knight extends Piece{
    public Knight(PieceColour p){
        // setting the colour of the piece
        this.colour = p;
        if (p==PieceColour.BLACK)
            setSymbol("♞");
        else
            setSymbol("♘");
    }
    @Override
    public boolean isLegitMove(int i0, int j0, int i1, int j1){
        // we will define whether our destination is in one of the valid cases
        int position_case = 0;
        if((i0+2 == i1) && (j0-1 == j1))
            position_case = 1;
        else if((i0+2 == i1) && (j0+1 == j1))
            position_case = 1;
        else if((i0+1 == i1) && (j0+2 == j1))
            position_case = 1;
        else if((i0-1 == i1) && (j0+2 == j1))
            position_case = 1;
        else if((i0-2 == i1) && (j0+1 == j1))
            position_case = 1;
        else if((i0-2 == i1) && (j0-1 == j1))
            position_case = 1;
        else if((i0-1 == i1) && (j0-2 == j1))
            position_case = 1;
        else if((i0+1 == i1) && (j0-2 == j1))
            position_case = 1;

        switch(position_case)
        {
            case 0:
                return false;
            case 1:
            // checking to see if the destination square is empty
                if(Board.hasPiece(i1,j1))
                {   // checking to see if it's a different colour otherwise
                    Piece p1 = Board.getPiece(i1, j1);
                    Piece p0 = Board.getPiece(i0, j0);
                    if(p0.getColour() == p1.getColour())
                        return false;
                    else
                        return true;
                }
                else
                    return true;
            default:
            return false;

        }
    }
    
}
