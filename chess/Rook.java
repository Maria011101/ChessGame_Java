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
    public boolean isLegitMove(int i0, int j0, int i1, int j1)
    {
        // if it's a horizontal straight line it might be a valid move
        if((i0 == i1) && (j0 != j1))
        {
            // check to see if destination square is empty
            if(Board.hasPiece(i1, j1) == false)
            {
                // checking to see if the path is empty
                for(int j=Math.min(j0,j1)+1; j<Math.max(j0,j1); j++)
                    if(Board.hasPiece(i0,j))
                        return false;
                return true;
            }
            // if destination square is not empty, we check to see if it's a different colour
            else {
                Piece p1 = Board.getPiece(i1, j1);
                Piece p0 = Board.getPiece(i0, j0);
                if(p0.getColour() == p1.getColour())
                    return false;
                else
                    return true;
            }
        }
        // if it's not a horizontal straight line it might be a vertical one
        else if((i0 != i1) && (j0 == j1))
            {
                // checking to see if destination square is empty
                if(Board.hasPiece(i1, j1) == false)
                    {
                    // checking the path is empty

                    for(int k=Math.min(i0,i1)+1; k<Math.max(i0,i1); k++)
                        if(Board.hasPiece(k,j0))
                            return false;
                        
                        return true;
                    }
                // if destination square is not empty, we check to see if it's a different colour
                else {
                    Piece p1 = Board.getPiece(i1, j1);
                    Piece p0 = Board.getPiece(i0, j0);
                    if(p0.getColour() == p1.getColour())
                        return false;
                    else
                        for(int h=Math.min(i0,i1)+1; h<Math.max(i0,i1); h++)
                        if(Board.hasPiece(h,j0))
                            return false;
                        
                        return true;
                }
            }
        // if it's not a vertical or horizontal line, it's not valid
        //else
        return false;
    }
}
