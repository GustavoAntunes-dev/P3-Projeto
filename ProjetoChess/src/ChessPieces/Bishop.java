package ChessPieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);

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
