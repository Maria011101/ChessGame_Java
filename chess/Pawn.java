package chess;

public class Pawn extends Piece{	
	public Pawn(PieceColour p){
        // setting the colour of the piece
        this.colour = p;
        if (p==PieceColour.BLACK)
            setSymbol("♟︎");
        else
            setSymbol("♙");
    }
    @Override
    public boolean isLegitMove(int i0, int j0, int i1, int j1)
    {
        // this if else statement stops the pawns from going backwards
        Piece pawn = Board.getPiece(i0, j0);
        if((pawn.getColour()== PieceColour.WHITE) && (i0<i1))
            return false;
        else if((pawn.getColour()== PieceColour.BLACK) && (i0>i1))
            return false;

        // if the pawn is on an initial position
        if((i0 == 6) || (i0 == 1))
        {
            // we check to see if the destination is maximum 2 squares away
            if((Math.abs(i1-i0) == 1) || (Math.abs(i1-i0) == 2))
            {
                // we check to see if it's a vertical move
                if(j0 == j1)
                {
                    // and then check to see if the destination is occupied
                    Piece p1 = Board.getPiece(i1, j1);
                    if(p1 != null)
                        return false;
                    else
                        return true;
                }
                // if the moves is sideways, then an opposing piece needs to be present
                else if(Math.abs(j1-j0)== 1)
                {
                    // trying to check the two pieces, if there is no piece we will catch the error
                    try
                    {
                    Piece p1 = Board.getPiece(i1, j1);
                    Piece p0 = Board.getPiece(i0, j0);
                    if(p0.getColour() != p1.getColour())
                        return true;
                    else
                        return false;
                    }
                    catch(Exception e){
                        return false;
                    }
                }
            }
            // if the destination is not 1 or 2 squares away from the initial position, then it is not a valid move
            else
                return false;
        }
        // if the pawn is not on an initial position
        else
        {
            // if the position is not initial, the maximum difference can only be 1
            if(Math.abs(i1-i0) == 1)
            {
                // we check to see if it's a vertical move
                if(j0 == j1)
                {
                    // and then check to see if the destination is occupied
                    Piece p1 = Board.getPiece(i1, j1);
                    if(p1 != null)
                        return false;
                    else
                        return true;
                }

                // if the moves is sideways, then an opposing piece needs to be present
                else if(Math.abs(j1-j0)== 1)
                    // trying to check the two pieces, if there is no piece we will catch the error
                {   try
                    {
                    Piece p1 = Board.getPiece(i1, j1);
                    Piece p0 = Board.getPiece(i0, j0);
                    if(p0.getColour() != p1.getColour())
                        return true;
                    else
                        return false;
                    }
                    catch(Exception e)
                    {
                        return false;
                    }
                }
            }
        // if the destination is not 1 square away, it's not a valid move
        else
            return false;
        }
        // end of function return false
        return false;
    }  
}
