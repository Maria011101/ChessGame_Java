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
    public boolean isLegitMove(int i0, int j0, int i1, int j1)
    {
        // calculating the differences
        int dif1 = i1-i0;
        int dif2 = j1-j0;
        // if they are equal then the destination is on a diagonal
        if( Math.abs(dif1) ==  Math.abs(dif2))
            {
                dif1 = Math.abs(dif1);
                dif1--;
                //creating position cases depending on the direction the bishop will go
                int position_case = -1;

                if((i0<i1)&&(j0<j1))
                    position_case=0;
                if((i0<i1)&&(j0>j1))
                    position_case=1;
                if((i0>i1)&&(j0>j1))
                    position_case=2;
                if((i0>i1)&&(j0<j1))
                    position_case=3;

                // switch case to determine what to do in each case
                switch(position_case){
                    case 0:
                        int i=i0+1;
                        int j=j0+1;
                            
                        while(dif1 != 0)
                        {
                            if(Board.hasPiece(i,j))
                                {
                                    return false;
                                }
                            i++;
                            j++;
                            dif1--;
                        }
                        if(Board.hasPiece(i1,j1))
                        {
                        // checking to see if the piece on the destination square is the opponent's
                        Piece p1 = Board.getPiece(i1, j1);
                        Piece p0 = Board.getPiece(i0, j0);
                        if(p0.getColour() == p1.getColour())
                            return false;
                        else return true;
                        }
                        break;
                    case 1:
                        int k=i0+1;
                        int l=j0-1;
                            
                        while(dif1 != 0)
                        {
                            if(Board.hasPiece(k,l))
                                {
                                    return false;
                                }
                            k++;
                            l--;
                            dif1--;
                        }
                        if(Board.hasPiece(i1,j1))
                        {
                        // checking to see if the piece on the destination square is the opponent's
                        Piece p2 = Board.getPiece(i1, j1);
                        Piece p3 = Board.getPiece(i0, j0);
                        if(p2.getColour() == p3.getColour())
                            return false;
                        else return true;
                        }
                        break;
                    case 2:
                        int q=i0-1;
                        int r=j0-1;
                            
                        while(dif1 != 0)
                        {
                            if(Board.hasPiece(q,r))
                                {
                                    return false;
                                }
                            q--;
                            r--;
                            dif1--;
                        }
                        if(Board.hasPiece(i1,j1))
                        {
                        // checking to see if the piece on the destination square is the opponent's
                        Piece p4 = Board.getPiece(i1, j1);
                        Piece p5 = Board.getPiece(i0, j0);
                        if(p4.getColour() == p5.getColour())
                                return false;
                        else return true;
                        }

                        break;
                    case 3:
                        int x=i0-1;
                        int y=j0+1;

                            
                        while(dif1 != 0)
                        {

                            if(Board.hasPiece(x,y))
                                {
                                    return false;
                                }
                            x--;
                            y++;
                            dif1--;
                        }
                        if(Board.hasPiece(i1,j1))
                        {
                            // checking to see if the piece on the destination square is the opponent's
                            Piece p6 = Board.getPiece(i1, j1);
                            Piece p7 = Board.getPiece(i0, j0);
                            if(p7.getColour() == p6.getColour())
                                return false;
                            else return true;
                        }
                            break;
                    default:
                        return false;
                    }

                return true;
            }
        else
            return false;
    }
    
}
