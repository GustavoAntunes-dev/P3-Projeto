package ChessPieces;

import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessPiece;
import Chess.Color;

public class Horse extends ChessPiece {

    public Horse(Board board, Color color) {
        super(board, color);
        
    }

    @Override
    public String toString() {
        return "H";
    }

    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);   
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRow()][getBoard().getColumn()];
        Position p = new Position(0, 0);
        
        p.setValues(position.getRow() -1, position.getColumn()-2);
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
    
        p.setValues(position.getRow() -2, position.getColumn()-1);
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        
        p.setValues(position.getRow()-2, position.getColumn() +1 );
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        
        p.setValues(position.getRow()-1, position.getColumn() +2 );
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        
        p.setValues(position.getRow()+1, position.getColumn() +2 );
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        
        p.setValues(position.getRow()+2, position.getColumn() +1 );
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        
        p.setValues(position.getRow()+2, position.getColumn() -1 );
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
       
        p.setValues(position.getRow()+1, position.getColumn() -2 );
        if(getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        return mat;
    }
}
