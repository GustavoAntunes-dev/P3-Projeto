package ChessPieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
        
    }

    @Override
    public String toString() {
        return "k";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getrow()][getBoard().getColumn()];
        return null;
    }

}
