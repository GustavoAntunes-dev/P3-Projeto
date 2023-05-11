package ChessPieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class Tower extends ChessPiece {

    public Tower(Board board, Color color) {
        super(board, color);
        
    }
    @Override
    public String toString(){
        return "T";
    }
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getrow()][getBoard().getColumn()];
        return null;
    }
    
}
