package ChessPieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "B";

    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getrow()][getBoard().getColumn()];
        return null;
    }
}
